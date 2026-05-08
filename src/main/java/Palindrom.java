import java.util.Scanner;

public class Palindrom {
    static void main() {
        Scanner input = new Scanner(System.in);
        int num , temp, r, sum = 0;

        System.out.println("Enter the number : ");
        num = input.nextInt();

        temp = num;
        while(temp != 0) {

            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp/10;
        }

        if(num == sum){
            System.out.println("The number is Palindrom");
    }
        else {
            System.out.println("The number is not palindrom");
        }
    }
}
