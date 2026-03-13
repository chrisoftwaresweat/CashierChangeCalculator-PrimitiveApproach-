import java.util.Scanner;
//CASHIER COMPUTATION SYSTEM
public class ProblemThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total, cash, change;
        //user input
        System.out.print("Enter the total amount to pay: ");
        total= scanner.nextDouble();
        System.out.print("Enter the cash given: ");
        cash= scanner.nextDouble();
        if(cash<total){
            System.out.println("Insufficient balance");
        }
        else{
            change=cash-total;
            int remaining=(int)Math.round(change*100);
            System.out.printf("Total change: %.2f\n", change);//%.2f: 100.003456->100.00
            System.out.println("Breakdown:");

            int count;
            //1000
            count = remaining / 100000;
            if (count > 0) {
                System.out.printf("1000 x %d\n", count);
                //we are constantly changing the value of the remainder, for next calculation to be accurate
                //if we remove ts, the next calculation will calculate unchanged number.
                remaining = remaining % 100000;
            }
            //500
            count = remaining / 50000;
            if (count > 0) {
                System.out.printf("500 x %d\n", count);
                remaining = remaining % 50000;
            }
            //200
            count = remaining / 20000;
            if (count > 0) {
                System.out.printf("200 x %d\n", count);
                remaining = remaining % 20000;
            }
            //100
            count = remaining / 10000;
            if (count > 0) {
                System.out.printf("100 x %d\n", count);
                remaining = remaining % 10000;
            }
            //50
            count = remaining / 5000;
            if (count > 0) {
                System.out.printf("50 x %d\n", count);
                remaining = remaining % 5000;
            }
            //20
            count = remaining / 2000;
            if (count > 0) {
                System.out.printf("20 x %d\n", count);
                remaining = remaining % 2000;
            }
            //10
            count = remaining / 1000;
            if (count > 0) {
                System.out.printf("10 x %d\n", count);
                remaining = remaining % 1000;
            }
            //5
            count = remaining / 500;
            if (count > 0) {
                System.out.printf("5 x %d\n", count);
                remaining = remaining % 500;
            }
            //1
            count = remaining / 100;
            if (count > 0) {
                System.out.printf("1 x %d\n", count);
                remaining = remaining % 100;
            }
            //0.25
            count = remaining / 25;
            if (count > 0) {
                System.out.printf("0.25 x %d\n", count);
                remaining = remaining % 25;
            }
        }
        scanner.close();
    }
}



