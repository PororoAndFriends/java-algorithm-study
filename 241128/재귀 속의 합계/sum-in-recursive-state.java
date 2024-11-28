import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println((1 + num) * num / 2);
        }else{
            System.out.println((num - 1) * num / 2 + num);
        }
    }
}