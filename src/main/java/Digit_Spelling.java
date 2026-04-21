import java.util.Scanner;

public class Digit_Spelling {

    static void main() {
        Scanner input = new Scanner(System.in);
        int digit;

        System.out.println("Enter a Digit: ");
        digit = input.nextInt();

        switch (digit){

            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

        }

    }
}
