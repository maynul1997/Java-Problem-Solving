import java.util.Scanner;

public class SumOfDigit {
    static void main() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int r, temp;

        System.out.println("Enter the Digit : ");
        int num = input.nextInt();

        temp = num;

        while (temp !=0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }



    }
}
