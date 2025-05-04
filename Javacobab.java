//Bai cua Dy Khang
import java.util.*;

public class Cau3{
    public static void main(String[] args){
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = temp.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter your array: ");
        for(int i = 0; i < n; i++){
            arr[i] = temp.nextInt();
        }
        System.out.println("Cac phan tu trung nhau: ");
        for(int i = 0; i < arr.length ; i++){
            for(int j = i + 1; j < arr.length; j++){
                int t = 0;
                if(arr[j] == arr[i]){
                    System.out.println(arr[j]);
                }
            }
        }
 
    }   
}