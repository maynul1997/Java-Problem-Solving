import java.util.Scanner;

public class Area_of_triangle {
    static void main() {
        double base, height, area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Base: ");
        base = input.nextDouble();

        System.out.println("Enter Height: ");
        height = input.nextDouble();

        area = 0.5* base * height;


    }
}
