package BasicDataStructure;

import java.util.Scanner;

public class SimpleAndCompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amt");
        double principal = sc.nextDouble();
        System.out.println("Enter the rateOFInterest ");
        double rate = sc.nextDouble() / 100.0;
        System.out.println("Enter the time period");
        double time = sc.nextDouble();

        double CompoundInterest = CalculateCompoundInterest(principal, time, rate);
        System.out.println("CompoundInterest" + CompoundInterest);
        double simpleInterest = CalculateSimpleInterest(principal, time, rate);

        System.out.println("SimpleInterest" + simpleInterest);

        sc.close();
    }
        public static double CalculateCompoundInterest(double principal,double time,double rate){
            return principal*(Math.pow(1+rate,time)-1);
        }
        public static double CalculateSimpleInterest(double principal,double time,double rate){

        return principal*rate*time;


    }
}
