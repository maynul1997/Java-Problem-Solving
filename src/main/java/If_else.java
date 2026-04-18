import java.util.Scanner;

public class If_else {
    static void main() {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter an Integer Number: ");
        num = input.nextInt();

        if (num>0) {
            System.out.println("Positive");
        }

        else if(num<0) {
            System.out.println("Negative");
        }

        else{
            System.out.println("Zero");
        }
    }
}
