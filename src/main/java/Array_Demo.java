public class Array_Demo {

    static void main() {
        int [][] number = new int [4] [5];
        int k = 0;

        for ( int row = 0; row < 4; row ++ ) {
            for ( int col = 0; col < 5; col++ ) {
                number [row][col] = k;
                k++;


            }

        }

    }

}
