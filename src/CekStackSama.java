import java.util.Stack;

public class CekStackSama {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(1); stack1.push(2); stack1.push(3);
        stack2.push(1); stack2.push(2); stack2.push(3);

        System.out.println("Stack 1: " + stack1);
        System.out.println("Stack 2: " + stack2);
        System.out.println("Kedua stack sama: " + stack1.equals(stack2));
    }
}