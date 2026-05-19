import java.util.Scanner;

public class Assignment_16_Login_System {
    static void main() {
        Scanner input = new Scanner(System.in);

        String username;
        String password;

        while(true){

            System.out.println("Enter user name : ");
            username = input.nextLine();

            System.out.println("Enter password : ");
            password = input.nextLine();

            if(username.equals("Anis") && password.equals(123456)) {
                System.out.println("Welcome to the System");
            }
        }


    }
}
