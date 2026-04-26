import java.util.Scanner;

public class Assignment_12 {
    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Num1 : ");
        int num1 = input.nextInt();

        System.out.println("Enter Num2 : ");
        int num2 = input.nextInt();

        for (int i = num1+1 ; i < num2; i++){
            if( i % 2 =10= 0 ){
                System.out.println(i);
            }
        }

    }
}
