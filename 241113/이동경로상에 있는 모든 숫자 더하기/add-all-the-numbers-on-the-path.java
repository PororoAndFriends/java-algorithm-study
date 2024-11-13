import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] delta = {{-1,0}, {0,1}, {1,0}, {0, -1}};
        // 상 우 하 좌 0 1 2 3
        int cur = 0;
        int[][] arr = new int[99][99];
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);
        String command = scanner.nextLine();

        int x = n / 2;
        int y = x;
        for(int i = 0; i < n; i++){
            input = scanner.nextLine().split(" ");
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }
        int sum = arr[x][y];


        for(int i = 0; i < t; i ++){
            char c = command.charAt(i);
            if(c=='R'){
                cur += 1;
                if(cur > 3) cur = 0;
            }else if(c== 'L'){
                cur -= 1;
                if(cur < 0) cur = 3;
            }else{
                int x_ = x + delta[cur][0];
                int y_ = y + delta[cur][1];
                if(0 <= x_ && x_ < n){
                    if(0 <= y_ && y_ < n){
                        x = x_;
                        y = y_;
                        sum += arr[x][y];
                    }
                }

            }

        }
        System.out.println(sum);
    }
}