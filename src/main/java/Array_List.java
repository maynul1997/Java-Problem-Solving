import java.sql.SQLOutput;
import java.util.Arrays;

public class Array_List {
    static void main(String[] args) {

        int [] number = {5, -10, 7, 4, 90};

        Arrays.sort(number);

        for (int i = 0; i<5; i++) {

            System.out.print("  "+number[i]);

        }

        System.out.println();
        for (int i = 4; i >= 0; i--) {

            System.out.print("  "+number[i]);

        }


    }
}
