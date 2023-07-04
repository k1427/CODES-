package Questions;

import java.util.*;

public class DecimalToBinaryUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        int count = 0;
        while (n > 0) {
            if (count == 4) {
                System.out.println("Overflow");
                return;
            }
            stack.push(n % 2);
            n = n / 2;
            count++;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}
