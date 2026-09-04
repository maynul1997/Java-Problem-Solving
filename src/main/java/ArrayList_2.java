import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_2 {
    static void main() {
        ArrayList<Integer>  number = new ArrayList<>();

        number.add(20);
        number.add(-40);
        number.add(50);
        number.add(30);
        number.add(90);
        number.add(-20);

        System.out.println("Before sorting "+number);

        Collections.sort(number);
        System.out.println("After sorting as ascending order"+number);

        Collections.sort(number, Collections.reverseOrder());



    }
}
