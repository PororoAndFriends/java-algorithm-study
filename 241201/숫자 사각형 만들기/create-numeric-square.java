import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i=0;i<num;i++) {
            for(int j=0;j<num;j++) {
                int x = 9-i-j >=1 ? 9-i-j : 1;
                System.out.printf("%d ", x);
            }
        System.out.println();          
        }
    }
}