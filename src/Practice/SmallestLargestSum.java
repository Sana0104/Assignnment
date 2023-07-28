package Practice;

public class SmallestLargestSum {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,-1,-2,-4
        };
        int sumSmallest=findSumSmallest(array);
        int sumLargest=findSumLargest(array);

        System.out.println("sumof large"+sumLargest);
        System.out.println("sumof small"+sumSmallest);


    }
    public static int findSumSmallest(int[] array){
        int sumSmallest=Integer.MAX_VALUE;
        int current=0;
        for(int num:array){
            current+=num;
            sumSmallest=Math.min(sumSmallest,current);
            if(current>0){
                current=0;
            }
        }
        return sumSmallest;
    }
    public static int findSumLargest(int[] array){
        int sumLargest=Integer.MIN_VALUE;
        int current=0;
        for(int num:array){
            current+=num;
            sumLargest=Math.max(sumLargest,current);

        if(current<0){
            current=0;
        }

    }
    return sumLargest;
}
}
