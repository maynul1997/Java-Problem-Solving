import java.util.Scanner;

public class Series_2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n, mul=1 ;

        System.out.println("Enter the last number : ");
        n = input.nextInt();

        for (int i = 0 ; i<= n; i++){
            mul = mul * i;
        }
        System.out.println(mul);


    }
}
