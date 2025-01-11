import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int dp[][] = new int[n][n];
        int map[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j] = scanner.nextInt();
            }
        }
        dp[0][0] = map[0][0];
        
        for(int i=1;i<n;i++){
            dp[0][i] = dp[0][i-1] + map[0][i];
            dp[i][0] = dp[i-1][0] + map[i][0];
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = Math.max(dp[i-1][j] + map[i][j], dp[i][j-1] + map[i][j]);
            }
        }

        System.out.println(dp[n-1][n-1]);
    }
}