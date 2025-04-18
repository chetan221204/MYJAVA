import java.util.Arrays;
public class Arraysort02 {
    public static void main(String[] args) {
        int []marks=new int[5];
        marks[0]=10;
        marks[1]=30;
        marks[2]=50;
        marks[3]=20;
        marks[4]=40;
        System.out.println("Unsorted array:");
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
            
        }
        System.out.println("sorted array is :");
        for(int i=0;i<5;i++){
          //  System.out.println(marks[i]);
            
        
        Arrays.sort(marks);
        System.out.println(marks[i]);}
    }
    
}
