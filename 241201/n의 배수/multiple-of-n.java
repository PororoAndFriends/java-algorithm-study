import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int counter = num;
        while (counter <= 200){
            System.out.printf("%d ", counter);
            if (counter % 10 == 0){
                break;
            }
            counter += num;
        }
            
    }
}