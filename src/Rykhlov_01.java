import java.util.Scanner;

public class Rykhlov_01 {
    public static void main(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++){
            sum1 += arr[i];
        }
        int i = 0;
        while (i < n){
            sum2 += arr[i];
            i++;
        }
        i = 0;
        do{
            sum3 += arr[i];
            i++;
        }while(i == n);
        System.out.printf(sum1 + "\n" + sum2 + "\n" + sum3);



        in.close();
    }
}
