public class DigitSpelling {
    static void main() {

        int num = 123;
        int reverse = 0;

        //Reverse part
        while(num>0) {
            int digit = num % 10 ;
            reverse = reverse * 10 + digit;

        }

    }
}
