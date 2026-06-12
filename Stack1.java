import java.util.Stack;
public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.println(st.peek());
        Stack<Integer> st1 = new Stack<>();
        st1.push(5);
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        System.out.println(st1);
    }
}
