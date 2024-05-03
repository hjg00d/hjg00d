package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] results = new int[10];
        int index = 0; // 값이 0부터 올 수 있게 해준다

        do {
            System.out.print("First number: ");
            int num1 = sc.nextInt();
            System.out.print("Second number: ");
            int num2 = sc.nextInt();
            System.out.println("Please enter a symbol.(+, -, *, /): ");
            char operator = sc.next().charAt(0);

            int result = 0;
// ��Ģ���� ����
            switch(operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if(num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Input 0 X");
                        return;
                    }
                    break;
                default:
                    System.out.println("X");
                    break;
            }
            System.out.println("result: = " + result);
            results[index] = result;
            index++;
            System.out.println("Arrays.toString(results)= " + Arrays.toString(results));
            // Arrays.ToString(results) -> ?

            System.out.println("If you type in anything, you'll continue? (Exit when you enter exit)");
        } while (!sc.next().equals("exit"));

    }
}
