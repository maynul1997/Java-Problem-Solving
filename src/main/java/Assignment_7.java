import java.util.Scanner;

public class Assignment_7 {
    static void main() {

        Scanner input = new Scanner (System.in);
        char ch ;
        char num ;
        System.out.println("Enter Y or N : ");
        ch = input.next().charAt();

        System.out.println("Enter Y or N : ");
        num = input.next().charAt();

        if(ch =='Y' || ch == 'y' ){
            System.out.println("I love Java");
        }

        else if (num == 'N' || num == 'n'){
            System.out.println("I donot love Java");
        }


    }
}
