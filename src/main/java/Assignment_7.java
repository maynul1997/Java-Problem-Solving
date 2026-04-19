import java.util.Scanner;

public class Assignment_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch;
        char num;
        System.out.println("Enter Y or N : ");
        ch = input.next().charAt(0);

        System.out.println("Enter Y or N : ");
        num = input.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            System.out.println("I love Java");
        } else if (num == 'N' || num == 'n') {
            System.out.println("I donot love Java");
        }


    }
}