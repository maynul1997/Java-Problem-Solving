import java.util.Scanner;

public class Assignment_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch;

        System.out.println("Enter Y or N : ");
        ch = input.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            System.out.println("I love Java");
        } else if (ch == 'N' || ch == 'n') {
            System.out.println("I donot love Java");
        }


    }
}