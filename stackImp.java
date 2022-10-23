import java.util.Stack;
public class stackImp {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(3);
        s1.push(6);
        s1.push(8);
        System.out.println(s1);
        s1.pop();
        s1.pop();
        System.out.println(s1);
        System.out.println(s1.peek());
        s1.pop();
        boolean status = s1.empty();
        System.out.println(status);
    }
}