import java.util.Scanner;

public class TypeCasting {
    static void main() {

        int num1, num2, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        num1 = input.nextInt();

        System.out.println("Enter Second Number: ");
        num2 = input.nextInt();


        result = num1 + num2;
        System.out.println("Sum:"+result);

        result = num1 - num2;
        System.out.println("Sub:"+result);

        result = num1 * num2;
        System.out.println("Mul:"+result);

        result = num1 / num2;
        System.out.println("Div:"+result);

        result = num1 % num2;
        System.out.println("Reminder:"+result);

    }
}
