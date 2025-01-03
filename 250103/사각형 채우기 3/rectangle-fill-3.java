import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n+1];

        if(n==1){
            System.out.println(2);
            return;
        }else if(n==2){
            System.out.println(7);
            return;
        }

        int MOD = 1000000007;

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 7;

        for(int i=3;i<n+1;i++){
            arr[i] = (arr[i-1] * 2 + arr[i-2] * 3) % MOD;
            for(int j=i-3;j>=0;j--){

                arr[i] = (arr[i] + arr[j] * 2) % MOD;
            }
        }

        System.out.println(arr[n]);

    }
}