import java.util.Scanner;

public class TwoDimentionArray {
    static void main() {

        Scanner input = new Scanner(System.in);
        int [] [] A = new int [2] [3];
        int [] [] B = new int [2][3];

        //Getting input from a matrix
        for (int row = 0; row <2; row++) {
            for (int col = 0; col < 3; col ++) {
                A [row] [col] = input.nextInt();

            }
        }


    }
}
