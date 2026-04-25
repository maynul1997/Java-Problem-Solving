import java.util.Scanner;

public class Factorials {
    static void main() {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int i = input.nextInt();
        int result = 1;

        for(int j=1; j<=i; j++){
            result = result*i;

        }
        System.out.println(result);


    }
}
