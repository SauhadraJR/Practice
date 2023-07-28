import java.util.Scanner;

public class Try1 {

    public static void PrintName(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age: ");
            int name = sc.nextInt();
            System.out.println("Your age is: "+name);
        }catch (Exception ex){
            System.out.println("Something went wrong");
        }


    }

    public static void main(String[] args) {
        PrintName();
    }
}
