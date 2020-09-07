import java.util.Scanner;

public class Rykhlov_01 {
    public static void main(String[] arg){
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
        }while(i != n);
        System.out.println(sum1 + "\n" + sum2 + "\n" + sum3);

        for (int j = 0; j < arg.length; j++){
            System.out.println(arg[j]);
        }
        System.out.print(1);
        for (double j = 2; j <= 10;  j++){
            System.out.print(" " + 1/j);
        }
        n = in.nextInt();
        int[] arr2 = new int[n];

        n = in.nextInt();
        int[] arr3 = new int[n];

        in.close();
    }
}
