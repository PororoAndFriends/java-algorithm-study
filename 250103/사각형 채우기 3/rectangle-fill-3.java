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

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 7;

        for(int i=3;i<n+1;i++){
            arr[i] = (arr[i-1]*2) + (arr[i-2]*3) + (arr[i-3] * 2);
        }

        System.out.println(arr[n]);

    }
}