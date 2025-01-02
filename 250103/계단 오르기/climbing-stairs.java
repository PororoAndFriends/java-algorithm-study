import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 2){
            System.out.println(1);
            return;
            
        }


        int arr[] = new int[n+1];
        for(int i =0; i < arr.length; i++){
            arr[i] = 0;
        }
        arr[0] = 0;
        arr[2] = 1;
        arr[3] = 1;
        for(int i=4; i<arr.length; i++){
            arr[i] = arr[i-2] + arr[i-3];
        }
        System.out.println(arr[n] % 10007);
    }
}