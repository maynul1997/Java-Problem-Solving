import java.util.Scanner;

public class Temperature_Converter {
    static void main() {

        Scanner input = new Scanner(System.in);
        double cels, Fer;

        System.out.println("Enter Cels Temperature: ");
        cels = input.nextDouble();

        Fer = 1.8*cels+32;
        System.out.println("Fern is: "+Fer);

    }
}
