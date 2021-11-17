import java.util.Scanner;

public class ArraySum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter element number" + (i+1));
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<10;i++){
            sum= sum + arr[i];
        }
        System.out.println("Entered array is :");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Sum of array elements is: " + sum);
    }
}


