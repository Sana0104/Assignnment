package BasicDataStructure;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of subject 1");
        int sub1=sc.nextInt();

        System.out.println("enter marks of subject 2");
        int sub2=sc.nextInt();

        System.out.println("enter marks of subject 3");
        int sub3=sc.nextInt();

                sc.close();
    if(sub1>60 && sub2>60 && sub3>60){
        System.out.println("Passed");
    } else if (sub1>60 && sub2>60 ||sub2>60 && sub3>60 || sub1>60 && sub3>60 ) {
        System.out.println("promoted");
    }
    else if (sub1>60 || sub2>60 ||sub3>60 ){
        System.out.println("failed");
        }
    else {
        System.out.println("failed");
    }

    }
    }
