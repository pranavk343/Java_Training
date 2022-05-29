import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter you array : ");
        for (int i =0; i<5;i++){
            arr[i] = ob.nextInt();
        }
        for (int i = 0; i<5;i++){
            System.out.println(arr[i] * arr[i]);
        }
    }
}
