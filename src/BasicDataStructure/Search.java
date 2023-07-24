package BasicDataStructure;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] arr={5,12,14,6,78,19,1,23,26,37,7,52,86,47};
        int searchValue;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value to be searched");
        searchValue=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchValue){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(searchValue+"is present");

        }else {
            System.out.println(searchValue+"not found");
        }
        sc.close();
    }

}

