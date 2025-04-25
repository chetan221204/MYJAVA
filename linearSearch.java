import java.util.Scanner;

public class linearSearch {
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  marks = sc.nextInt();
        int arr[] = new int[marks];

        for(int i=0;i<marks;i++){
            arr[i]=sc.nextInt();
        }
 int x=sc.nextInt();
        for(int i=0;i<marks;i++){
            if(arr[i]==x){
                System.out.println(i);
            }
        }

    }
 }