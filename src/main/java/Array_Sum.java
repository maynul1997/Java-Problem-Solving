import java.util.Scanner;

public class Array_Sum {
    static void main() {
        Scanner input = new Scanner(System.in);

        double [] number = new double [5];
        double sum = 0;
        System.out.println("Please Enter the numbers : ");

        for( int i = 0; i < 5; i++) {
            number [i] = input.nextDouble();
        }

        sum = number [0] + number [1] + number [2] + number [3] + number [4];
        System.out.println("The Sum is : "+sum);


    }
}
