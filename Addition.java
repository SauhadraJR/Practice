import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number a: ");
        int a = sc.nextInt();
        System.out.println("Enter second number b: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b is = " + sum);
    }
}
