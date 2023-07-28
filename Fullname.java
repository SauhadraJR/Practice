import java.util.Scanner;
public class Fullname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fname = sc.nextLine();
        System.out.println("Enter last name: ");
        String lname = sc.nextLine();

        System.out.println("Full name is: " + fname + " " + lname);
    }
}
