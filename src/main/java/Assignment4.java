import java.sql.SQLOutput;
import java.util.Scanner;

public class Assignment4 {
    static void main() {
        int phonePrice = 1800; //Euros
        int NumOfInstallment, InstallmentPerMonth;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number of Installment: ");
        NumOfInstallment = input.nextInt();

        InstallmentPerMonth = phonePrice/NumOfInstallment;
        System.out.println("Per Month Installment: "+InstallmentPerMonth);
    }
}
