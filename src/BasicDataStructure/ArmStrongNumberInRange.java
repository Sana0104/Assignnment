package BasicDataStructure;

public class ArmStrongNumberInRange {
    public static void main(String[] args) {
        System.out.println("Armstrong num bwt 100 and 999");
        findArmstrongNumbers(100,999);
    }
    public static void findArmstrongNumbers(int start,int end){
        for(int number=start;number<=end;number++){
            if(isArmstrongNumbers(number)){
                System.out.println(number+" ");

            }
        }

    }
    public static boolean isArmstrongNumbers(int number){
        int originalNumber=number;
        int sum=0;
        int numDigit=String.valueOf(number).length();
        while(number>0){
            int digit=number%10;
            sum+=Math.pow(digit,numDigit);
            number /=10;
        }
        return sum==originalNumber;
    }
}
