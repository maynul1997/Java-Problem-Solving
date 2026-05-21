import java.util.Scanner;

public class Pattern_01 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter line number : ");
        int n = input.nextInt();

        for( int row = 1; row <= n; row++ ) {

            for( int col = 1; col <= row; col++ ) {

                System.out.print(" "+col);

            }

            System.out.println();

        }

    }
}
