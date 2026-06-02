import java.util.Arrays;

public class Array_Ascending {

    static void main() {
        int [] number = {30, -10, 30, 50, 2};

        Arrays.sort(number);

        for( int i = 0; i < 5; i ++) {
            System.out.println(" "+number[i]);
        }

    }



}
