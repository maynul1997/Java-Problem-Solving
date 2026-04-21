import java.util.Scanner;

public class Assignment_08 {
    static void main() {

        Scanner input = new Scanner(System.in);
        char masters, English;

        System.out.println("Have you complete your Post Graduation? ");
        masters = input.next().charAt(0);

        System.out.println("Are you fluent at English? ");
        English = input.next().charAt(0);

        if((masters == 'Y' || masters == 'y') && (English =='Y' || English=='y')) {

            System.out.println("You are Eligible for the Job ! ");
        }

        else{
            System.out.println("Not eligible for the Job");
        }



    }
}
