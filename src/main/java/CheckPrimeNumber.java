import java.util.Scanner;

public class CheckPrimeNumber {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any positive number : ");
        int num = input.nextInt();
        int count;

        for( int i = 2; i<=num; i++) {
            if(num % i == 0){
                count ++;
                break;
            }
        }
        if (count==0){
            System.out.println("Prime Number");
        }


    }
}
