import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[] = new int[n+1];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        if(n<=2){
            System.out.println(arr[n]);
            return;
        }


        for(int i =3; i < n+1; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[n]);
    }
}