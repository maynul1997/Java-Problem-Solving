import java.util.Scanner;

public class SumOFLoop {
    static void main() {
        Scanner input = new Scanner(System.in);

        int num1, num2, i;
        int sum = 0;
        System.out.println("Enter num1 : ");
        num1 = input.nextInt();

        System.out.println("Enter num2 :  ");
        num2 = input.nextInt();

        for( i = num1; i <num2; i++){
            sum = sum + 1;

        }
        System.out.println("Sum is : ");


    }
}
