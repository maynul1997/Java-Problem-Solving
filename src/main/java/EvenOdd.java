import java.util.Scanner;

public class EvenOdd {

    static void main() {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Eneter a Number: ");
        num = input.nextInt();

        if (num%2==0){
            System.out.println("Even Number");
        }

    }
}
