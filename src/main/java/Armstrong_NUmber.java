import java.util.Scanner;

public class Armstrong_NUmber {
    static void main() {
        Scanner input = new Scanner(System.in);
        int num, r, temp, sum= 0;

        System.out.println("Enter the number: ");
        num = input.nextInt();

        temp = num;

        while (temp !=0 ) {
           r = temp % 10;
           sum = sum + r*r*r ;
           temp = temp / 10;
        }

        if ( temp == sum) {

            System.out.println("The Number is Armstrong");

        }

        else {
            System.out.println("The number is not Armstrong");
        }

        }

    }
}
