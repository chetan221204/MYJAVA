import java.util.Scanner;
import java.util.Arrays;
public class arrayinputsort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Size Of Array");
        
        int size =in.nextInt();
        int []array= new int [size];
        //INPUT
        System.out.println("Enter Element Of Array");
        for(int i=0;i<size;i++){
        array[i]=in.nextInt();
        
        }
        //OUTPUT
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        
        }
        System.out.println("Sorted Array is :");
        Arrays.sort(array);
        System.out.println(array[size]);
        
    }
    
}
