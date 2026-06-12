import java.util.Stack;
public class Stack2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("ramu");
        stack.push("shamu");
        stack.push("santosh");
        stack.push("ashu");
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.search("ramu"));
        System.out.println(stack.pop());

    }
}
