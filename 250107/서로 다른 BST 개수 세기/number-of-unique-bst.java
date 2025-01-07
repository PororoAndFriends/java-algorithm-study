import java.util.*;

public class Main {
    
    public static int dp[] = new int[20];

    public static void bst(int n){

        int sum = 0;
        for(int i =0;i < n;i++){
            sum += dp[i] * dp[n-i-1];
        }
        dp[n] = sum;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n;i++){
            bst(i);
        }

        System.out.println(dp[n]);
        

    }
}