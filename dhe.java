import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
 
//  BANK MANAGEMENT SYSTEM  — Single-file Java Implementation
//  Features: HashMap storage, Login/Logout, Deposit, Withdraw,
//             Transfer, Balance, Change PIN, Admin Panel,
//             accounts.txt & transactions.txt persistence
 
public class dhe {
 
    // ── Constants ────────────────────────────────────────────────
    static final String ACCOUNTS_FILE    = "accounts.txt";
    static final String TRANSACTIONS_FILE = "transactions.txt";
    static final String ADMIN_USERNAME   = "admin";
    static final String ADMIN_PASSWORD   = "admin123";
    static final double MIN_BALANCE      = 100.0;
    static final DateTimeFormatter FMT   =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
 
    // ── In-memory store ─────────────────────────────────────────
    static HashMap<String, Account> accounts = new HashMap<>();
    static Account loggedInAccount = null;
    static Scanner sc = new Scanner(System.in);
 
    //  MODEL — Account
    static class Account {
        String accountNumber;
        String holderName;
        String pin;           // stored as plain text for simplicity
        String accountType;   // SAVINGS / CURRENT
        double balance;
        String createdAt;
        boolean active;
 
        Account(String accountNumber, String holderName, String pin,
                String accountType, double balance) {
            this.accountNumber = accountNumber;
            this.holderName    = holderName;
            this.pin           = pin;
            this.accountType   = accountType;
            this.balance       = balance;
            this.createdAt     = LocalDateTime.now().format(FMT);
            this.active        = true;
        }
 
        // Serialize to one CSV line
        String toFileLine() {
            return String.join("|",
                    accountNumber, holderName, pin, accountType,
                    String.valueOf(balance), String.valueOf(active));
        }
 
        // Deserialize from CSV line
        static Account fromFileLine(String line) {
            String[] p = line.split("\\|");
            Account a  = new Account(p[0], p[1], p[2], p[3], Double.parseDouble(p[4]));
            a.createdAt = p[5];
            a.active    = Boolean.parseBoolean(p[6]);
            return a;
        }
 
        @Override
        public String toString() {
            return String.format(
                "┌─────────────────────────────────────────┐\n" +
                "│  Account No : %-27s│\n" +
                "│  Holder     : %-27s│\n" +
                "│  Type       : %-27s│\n" +
                "│  Balance    : %-27s│\n" +
                "│  Status     : %-27s│\n" +
                "│  Opened     : %-27s│\n" +
                "└─────────────────────────────────────────┘",
                accountNumber, holderName, accountType,
                String.format("%.2f", balance),
                active ? "ACTIVE" : "DEACTIVATED");
        }
    }
    //  FILE PERSISTENCE
    static void saveAccounts() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ACCOUNTS_FILE))) {
            for (Account a : accounts.values()) pw.println(a.toFileLine());
        } catch (IOException e) {
            System.out.println("[ERROR] Could not save accounts: " + e.getMessage());
        }
    }
 
    static void loadAccounts() {
        File f = new File(ACCOUNTS_FILE);
        if (!f.exists()) return;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isBlank()) {
                    Account a = Account.fromFileLine(line.trim());
                    if (a != null) accounts.put(a.accountNumber, a);
                }
            }
            System.out.println("[INFO] Loaded " + accounts.size() + " account(s) from disk.");
        } catch (IOException e) {
            System.out.println("[ERROR] Could not load accounts: " + e.getMessage());
        }
    }
 
    static void logTransaction(String accNo, String type, double amount,
                               double balanceBefore, double balanceAfter, String note) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(TRANSACTIONS_FILE, true))) {
            pw.printf("%s | %-12s | %-10s | Amount: %10.2f | Before: %10.2f | After: %10.2f | %s%n",
                    LocalDateTime.now().format(FMT),
                    accNo, type, amount, balanceBefore, balanceAfter, note);
        } catch (IOException e) {
            System.out.println("[ERROR] Could not write transaction log: " + e.getMessage());
        }
    }
    //  ACCOUNT NUMBER GENERATOR
    static String generateAccountNumber() {
        String prefix = "ACC";
        int next = accounts.size() + 1001;
        String candidate = prefix + next;
        while (accounts.containsKey(candidate)) {
            next++;
            candidate = prefix + next;
        }
        return candidate;
    }
    //  INPUT HELPERS
    static String input(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }
 
    static int inputInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try { return Integer.parseInt(sc.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("  ✗ Enter a valid number."); }
        }
    }
 
    static double inputDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double v = Double.parseDouble(sc.nextLine().trim());
                if (v <= 0) System.out.println("  ✗ Amount must be positive.");
                else return v;
            } catch (NumberFormatException e) {
                System.out.println("  ✗ Enter a valid amount.");
            }
        }
    }
 
    static String inputPin(String prompt) {
        while (true) {
            String pin = input(prompt);
            if (pin.matches("\\d{4,6}")) return pin;
            System.out.println("  ✗ PIN must be 4-6 digits.");
        }
    }
 
    static void pause() {
        input("\n  Press ENTER to continue...");
    }
 
    static void divider() {
        System.out.println("  ──────────────────────────────────────────");
    }//  AUTH — Login / Logout
    static void login() {
        System.out.println("<-- Login Your Account       -->");
        String accNo = input("  Account Number: ").toUpperCase();
        Account a = accounts.get(accNo);
        if (a == null) {
            System.out.println("🙅  ✗ Account not found.");
            return;
        }
        if (!a.active) {
            System.out.println("  ✗ This account has been deactivated. Contact admin.");
            return;
        }
        String pin = input("  PIN: ");
        if (!a.pin.equals(pin)) {
            System.out.println("  ✗ Incorrect PIN.");
            return;
        }
        loggedInAccount = a;
        System.out.println("\n  ✓ Welcome, " + a.holderName + "!");
    }
 
    static void logout() {
        System.out.println("\n  ✓ Logged out. Goodbye, " + loggedInAccount.holderName + "!");
        loggedInAccount = null;
    }
    //  account creation
    static void createAccount() {
        System.out.println(" <--       CREATE A  NEW ACCOUNT      -->");
 
        String name = input(" Enter Your Full Name: ");
        if (name.isBlank()) { System.out.println("  ✗ Name cannot be empty."); return; }
 
        System.out.println("  Account Type: (1) Savings  (2) Current");
        int typeChoice = inputInt("  Choice: ");
        String type = (typeChoice == 2) ? "CURRENT" : "SAVINGS";
 
        double minOpen = type.equals("SAVINGS") ? MIN_BALANCE : 0;
        System.out.printf("  Initial deposit (min %.2f for %s): ", minOpen, type);
        double deposit;
        try {
            deposit = Double.parseDouble(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("  ✗ Invalid amount."); return;
        }
        if (deposit < minOpen) {
            System.out.printf("  ✗ Minimum opening deposit for %s is %.2f%n", type, minOpen);
            return;
        }
 
        String pin = inputPin("  Set PIN (4-6 digits): ");
        String confirmPin = inputPin("  Confirm PIN: ");
        if (!pin.equals(confirmPin)) { System.out.println("  ✗ PINs do not match."); return; }
 
        String accNo = generateAccountNumber();
        Account a = new Account(accNo, name, pin, type, deposit);
        accounts.put(accNo, a);
        saveAccounts();
        logTransaction(accNo, "ACCOUNT_OPEN", deposit, 0, deposit, "Account created");
 
        System.out.println("\n  ✓ Account created successfully!");
        System.out.println("  ┌─────────────────────────────────┐");
        System.out.println("  │  Account Number : " + accNo + "          │");
        System.out.printf( "  │  Initial Balance: %-14.2f │%n", deposit);
        System.out.println("  │  *** Save your account number! ***│");
        System.out.println("  └─────────────────────────────────┘");
    }
    //  DEPOSIT
    static void deposit() {
        System.out.println("\n  ── DEPOSIT ──");
        double amount = inputDouble("  Amount: ");
        double before = loggedInAccount.balance;
        loggedInAccount.balance += amount;
        saveAccounts();
        logTransaction(loggedInAccount.accountNumber, "DEPOSIT",
                amount, before, loggedInAccount.balance, "Cash deposit");
        System.out.printf("  ✓ Deposited %.2f | New Balance: %.2f%n",
                amount, loggedInAccount.balance);
    }
    //  WITHDRAW
    static void withdraw() {
        System.out.println("\n  --> WITHDRAWAL ");
        double amount = inputDouble("  Amount: ");
 
        double limit = loggedInAccount.accountType.equals("SAVINGS")
                ? loggedInAccount.balance - MIN_BALANCE
                : loggedInAccount.balance;
 
        if (amount > limit) {
            if (loggedInAccount.accountType.equals("SAVINGS"))
                System.out.printf(
                    "  ✗ Cannot withdraw. Must maintain min balance of %.2f. " +
                    "Available to withdraw: %.2f%n", MIN_BALANCE, limit);
            else
                System.out.printf("  ✗ Insufficient funds. Available: %.2f%n",
                        loggedInAccount.balance);
            return;
        }
 
        double before = loggedInAccount.balance;
        loggedInAccount.balance -= amount;
        saveAccounts();
        logTransaction(loggedInAccount.accountNumber, "WITHDRAWAL",
                amount, before, loggedInAccount.balance, "Cash withdrawal");
        System.out.printf("  ✓ Withdrawn %.2f | Remaining Balance: %.2f%n",
                amount, loggedInAccount.balance);
    }
    //  TRANSFER
    static void transfer() {
        System.out.println("\n  --> FUND TRANSFER ");
        String targetNo = input(" Enter Destination Account Number: ").toUpperCase();
 
        if (targetNo.equals(loggedInAccount.accountNumber)) {
            System.out.println("  ✗ Cannot transfer to the same account.");
            return;
        }
        Account target = accounts.get(targetNo);
        if (target == null) { System.out.println("  ✗ Destination account not found."); return; }
        if (!target.active) { System.out.println("  ✗ Destination account is deactivated."); return; }
 
        System.out.println("  Destination: " + target.holderName + " (" + target.accountType + ")");
        double amount = inputDouble("  Amount to transfer: ");
 
        double limit = loggedInAccount.accountType.equals("SAVINGS")
                ? loggedInAccount.balance - MIN_BALANCE
                : loggedInAccount.balance;
 
        if (amount > limit) {
            System.out.printf("  ✗ Insufficient funds. Available to transfer: %.2f%n", limit);
            return;
        }
 
        String confirm = input("  Confirm transfer of " + String.format("%.2f", amount)
                + " to " + target.holderName + "? (yes/no): ");
        if (!confirm.equalsIgnoreCase("yes")) { System.out.println("  Transfer cancelled."); return; }
 
        double fromBefore = loggedInAccount.balance;
        double toBefore   = target.balance;
        loggedInAccount.balance -= amount;
        target.balance          += amount;
        saveAccounts();
 
        logTransaction(loggedInAccount.accountNumber, "TRANSFER_OUT",
                amount, fromBefore, loggedInAccount.balance, "To: " + targetNo);
        logTransaction(targetNo, "TRANSFER_IN",
                amount, toBefore, target.balance, "From: " + loggedInAccount.accountNumber);
 
        System.out.printf("  ✓ Transferred %.2f to %s (%s)%n",
                amount, target.holderName, targetNo);
        System.out.printf("  Your new balance: %.2f%n", loggedInAccount.balance);
    }
    //  BALANCE INQUIRY
    static void checkBalance() {
        System.out.println("\n  ── BALANCE INQUIRY ──");
        System.out.println("  Account : " + loggedInAccount.accountNumber);
        System.out.println("  Holder  : " + loggedInAccount.holderName);
        System.out.println("  Type    : " + loggedInAccount.accountType);
        System.out.printf( "  Balance : %.2f%n", loggedInAccount.balance);
        if (loggedInAccount.accountType.equals("SAVINGS"))
            System.out.printf("  (Min balance: %.2f | Withdrawable: %.2f)%n",
                    MIN_BALANCE, loggedInAccount.balance - MIN_BALANCE);
     }
    //  USER MENU (after login)
    static void userMenu() {
        boolean active = true;
        while (active) {
            System.out.printf( "    👋Hello, %-23s %n", loggedInAccount.holderName);
            System.out.println("  -->  1. Deposit                    ");
            System.out.println("  -->  2. Withdraw                   ");
            System.out.println("  -->  3. Transfer Money             ");
            System.out.println("  -->  4. Check Balance              ");
            System.out.println("  -->  0. Logout                     ");
 
            int choice = inputInt("  Choice: ");
            switch (choice) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> transfer();
                case 4 -> checkBalance();
                case 0 -> { logout(); active = false; }
                default -> System.out.println("🙅  ✗ Invalid option.");
            }
            if (active) pause();
        }
    }
    //  ADMIN — View all accounts
    static void adminViewAll() {
        System.out.println("\n  ── ALL ACCOUNTS ──");
        if (accounts.isEmpty()) { System.out.println("  No accounts found."); return; }
        System.out.printf("  %-12s %-20s %-10s %-10s %-6s%n",
                "ACC NO", "HOLDER", "TYPE", "BALANCE", "STATUS");
        divider();
        for (Account a : accounts.values()) {
            System.out.printf("  %-12s %-20s %-10s %-10.2f %-6s%n",
                    a.accountNumber, a.holderName, a.accountType,
                    a.balance, a.active ? "ACTIVE" : "INACTIVE");
        }
        System.out.println("  Total accounts: " + accounts.size());
    }
    static void adminPanel() {
        System.out.println("<---        ADMIN LOGIN        ---->");
        String user = input("  Username: ");
        String pass = input("  Password: ");
        if (!user.equals(ADMIN_USERNAME) || !pass.equals(ADMIN_PASSWORD)) {
            System.out.println(" 🙅 ✗ Invalid admin credentials.");
            return;
        }
        System.out.println("  ✓ Admin access granted.");
 
        boolean running = true;
        while (running) {
            System.out.println(" ||         ADMIN PANEL            ||");
            System.out.println("  -->  1. View All Accounts          ");
            System.out.println("  -->  0. Exit Admin Panel           ");
 
            int choice = inputInt("  Choice: ");
            switch (choice) {
                case 1 -> adminViewAll();
                case 0 -> { System.out.println("  Exiting admin panel."); running = false; }
                default -> System.out.println(" 🙅 ✗ Invalid option.");
            }
            if (running) pause();
        }
    }//  MAIN MENU
    static void mainMenu() {
        System.out.println("   ||      JAVA BANK MANAGEMENT SYSTEM        ||");
        System.out.println("  -->  1. Login                                ");
        System.out.println("  -->  2. Create A New Account                 ");
        System.out.println("  -->  3. Login As Admin                          ");
        System.out.println("  -->  0. Exit                                 ");
    }
    //  ENTRY POINT
    public static void main(String[] args) {
        loadAccounts();
        System.out.println("<--👋 Welcome to our Java Bank Management System -->");
 
        boolean running = true;
        while (running) {
            mainMenu();
            int choice = inputInt("  Choice: ");
            switch (choice) {
                case 1 -> {
                    login();
                    if (loggedInAccount != null) userMenu();
                }
                case 2 -> { createAccount(); pause(); }
                case 3 -> adminPanel();
                case 0 -> { System.out.println("\n  Goodbye! Stay safe."); running = false; }
                default -> System.out.println(" 🙅 ✗ Invalid option. Try again.");
            }
        }
        sc.close();
    }
}