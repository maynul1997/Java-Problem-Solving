public class DigitSpelling {
    static void main() {

        int num = 123456;
        int reverse = 0;

        //Reverse part
        while(num>0) {
            int digit = num % 10 ;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        // Print part
        while (reverse > 0) {
            int digit = reverse % 10;
            switch (digit) {
                case 1: System.out.print("One "); break;
                case 2: System.out.print("Two "); break;
                case 3: System.out.print("Three "); break;
                case 3: System.out.print("Four "); break;
                case 3: System.out.print("Five "); break;
                case 3: System.out.print("Six "); break;
            }

            reverse = reverse / 10;

        }



    }
}
