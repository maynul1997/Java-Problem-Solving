import java.util.Scanner;

public class LogicalOperator2 {

    static void main() {

        Scanner input = new Scanner(System.in);
        char ch;

        System.out.println("Enter a Letter: ");
        ch = input.next().charAt(0);

        if (ch >= 'a' && ch<= 'z') {
            System.out.println("Small letter");
        }

        else if (ch>= 'A' && ch<='Z') {
            System.out.println("Capital letter");
        }
    }
}
