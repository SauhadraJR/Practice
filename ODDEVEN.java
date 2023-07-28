import java.util.Scanner;
public class ODDEVEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number :");
        int num1 = sc.nextInt();
        String check = (num1 % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + num1 + " is " + check);
    }
}
