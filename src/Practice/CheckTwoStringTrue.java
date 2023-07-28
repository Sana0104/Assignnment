package Practice;

import java.util.Scanner;

public class CheckTwoStringTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string");
        String str2 = sc.nextLine();

        if(areReverse(str1,str2)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
        sc.close();
    }
    public static boolean areReverse(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int len=str1.length();
        for(int i=0;i<len;i++){
            if(str1.charAt(i)!=str2.charAt(len-i-1)){
            return false;

        }
    }
    return true;
}
}