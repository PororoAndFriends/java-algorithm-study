import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int map[][] = new int[n][n];
        int dp[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j] = sc.nextInt();
            }
        }
        dp[0][0] = map[0][0];
        for(int i=1;i<n;i++){
            dp[i][0] = Math.min(map[i][0],dp[i-1][0]);
            dp[0][i] = Math.min(map[0][i],dp[0][i-1]);
        }


        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(map[i][j] >= Math.max(dp[i-1][j], dp[i][j-1])){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }else{
                    dp[i][j] = map[i][j];
                }
            }
        }
        System.out.println(dp[n-1][n-1]);
    }
}