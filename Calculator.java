import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("emter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        System.out.println("enter c : ");
        int c = sc.nextInt();
        System.out.println("enter operator : ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b + c);
                break;
            case '-':
                System.out.println(a - b - c);
                break;
            case '*':
                System.out.println(a * b * c);
                break;
            case '/':
                System.out.println(a / b / c);
                break;
            case '%':
                System.out.println(a % b % c);
        }

    }

}
