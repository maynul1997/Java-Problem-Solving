import java.util.Scanner;

public class Digit_Spelling {

    static void main() {
        Scanner input = new Scanner(System.in);
        int digit;

        System.out.println("Enter aDigit- ");
        digit = input.nextInt();

        switch (digit){

            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");

        }

    }
}
