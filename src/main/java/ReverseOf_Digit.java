import java.util.Scanner;

public class ReverseOf_Digit {
    static void main() {
        Scanner input = new Scanner(System.in);
        int temp, r=0 , num, sum =0;

        System.out.println("Enter the number : ");
        num = input.nextByte();

        temp = num;
        while(temp != 0) {

            r = temp % 10;
            sum = sum*10 + r;
            temp = temp / 10;

        }

        System.out.println("The reverse number is : "+sum);


    }
}
