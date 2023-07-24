package BasicDataStructure;

import java.util.Scanner;

public class Bubblesort {

        public static void main(String[] args) {
            int[] arr = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
            int searchValue;


            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value to be searched: ");
            searchValue = scanner.nextInt();

            // Sort the array using Bubble Sort
            bubbleSort(arr);

            // Print the sorted array
            System.out.println("Sorted Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();


            boolean found = binarySearch(arr, searchValue);


            if (found) {
                System.out.println("The value " + searchValue + " is present in the array.");
            } else {
                System.out.println("The value " + searchValue + " is not present in the array.");
            }


            scanner.close();
        }


        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                if (!swapped) {
                    break;
                }
            }
        }


        public static boolean binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == target) {
                    return true;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
        }
    }

