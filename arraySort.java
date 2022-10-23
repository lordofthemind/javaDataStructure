import java.util.Arrays;
import java.util.Scanner;

public class arraySort {

    public static void search(int array[], int key){
        for(int i=0; i<array.length; i++){
            if(array[i]==key){
                System.out.println("Element you are looking for, is at "+array[i]);
            }
        }
        System.out.println("Element you are looking for, doesn't exist in Array");
        
    }
    public static void sort(int a1[]){
        System.out.println("Original Array");
        for(int i=0; i<a1.length; i++){
            System.out.print(a1[i]+", ");
        }
        System.out.println();
        System.out.println("Sorted Array");
        Arrays.sort(a1);
        for(int i=0; i<a1.length; i++){
            System.out.print(a1[i]+", ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Array!!");
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Elements of Array!!");
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Array is: ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        System.out.println("What do You want to do with Array?");
        System.out.println("1: Search");
        System.out.println("2: Sort");
        System.out.println("3: Exit");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("You Choose to Search.");
                System.out.println("Enter the element You want to Search.");
                int key = sc.nextInt();
                search(arr, key);
                break;
            case 2:
                System.out.println("You Choose Sort.");
                sort(arr);
                break;
            case 3:
                System.exit(0);
                break;        
            default:
                System.out.println("Invalid Input!!");
                break;
        }
        sc.close();     
    }
}