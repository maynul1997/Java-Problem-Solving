import java.util.Scanner;

public class User_PrimeNumber {
    static void main() {

        int j, count = 0;
        Scanner input = new Scanner(System.in);
         int m, n;
        System.out.println("Enter the initial number : ");
        m = input.nextInt();

        System.out.println("Enter the ending number : ");
        n = input.nextInt();

        for (int i= m; i<n; i++){

            for( j=2; j<i; j++){
                if( i%j == 0) {
                    count ++;
                    break;
                }
            }
            if(count == 0)
                System.out.println(i);
                count =0;
        }

    }
}
