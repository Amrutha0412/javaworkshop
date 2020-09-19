import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        float[]arr=new float[n];
        float total=0;
        for(int i=0;i<arr.length;i++) {
            System.out.print("Enter element no. "+(i+1)+":  ");
            arr[i]=sc.nextFloat();
        }
        sc.close();
        for(int i=0;i<arr.length;i++) {
            total=total+arr[i];
        }
        float average =total/ arr.length;
        System.out.format("The average is : %.3f", average);
    }
}
