import java.util.Scanner;

public class Assignment5 {

    static void main() {

        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("Enter your age: ");
        age = input.nextInt();

        if (age<18){
            System.out.println("Not Voter");
        }

        else if(age>=18){
            System.out.println("Voter");
        }
    }
}
