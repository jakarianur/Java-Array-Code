import java.util.Scanner;
public class NewClass4 {
 public static void main(String args[]) { 
 Scanner input = new Scanner(System.in);
 System.out.println("Enter the size of the array: ");
 int size = input.nextInt();
 int[] arr = new int [size];
 System.out.println("Enter the values of the array: "); 
 for(int i = 0; i<size; i++)
 {
 arr[i] = input.nextInt();
 }
 for(int i = 0; i<size; i++)
 {
 System.out.println("The value of array ["+i+"] : "+arr[i]);
 } 
 }
}
