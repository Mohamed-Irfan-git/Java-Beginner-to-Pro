package basic.loopsandcondition;

import java.util.Scanner;

public class Calculatar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double ans = 0;

        while (true){
            System.out.println("Enter the operator");
            char op = scan.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ){
                System.out.print("Enter Tow number :");
                double num1 = scan.nextDouble();
                double num2 = scan.nextDouble();

                if(op=='+'){
                    ans = num1 + num2;
                }
                if(op=='-'){
                    ans = num1 - num2;
                }
                if(op=='*'){
                    ans = num1 * num2;
                }
                if(op=='/'){
                    if(num1!=0){
                        ans = num1 / num2;
                    }

                }
                if(op=='%'){
                    ans = num1%num2;
                }
            }
            System.out.println(ans);
        }
    }
}
