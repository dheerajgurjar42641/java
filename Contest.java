import java.util.*;

public class Contest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] standardLine = new int[n];
        for (int i = 0; i < n; i++) {
            standardLine[i] = sc.nextInt();
        }
        if (!sc.hasNextInt()) return;
        int m = sc.nextInt();
        Set<Integer> vipSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            vipSet.add(sc.nextInt());
        }
        int count = 0;
        for (int studentId : standardLine) {
            if (vipSet.contains(studentId)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
