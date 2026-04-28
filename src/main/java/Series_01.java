import java.util.Scanner;

public class Series_01 {
    static void main() {

        Scanner input = new Scanner(System.in);
        int num, sum = 0;

        System.out.println("Enter the series of num : ");
        num = input.nextInt();

        for(int i=1; i<=num; i = i + 2) {
            System.out.print(i+" ");
            sum = sum + i;

        }
        System.out.println();
        System.out.println(sum);


    }
}
