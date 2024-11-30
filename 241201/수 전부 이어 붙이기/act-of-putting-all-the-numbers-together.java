import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        String split = scanner.nextLine().replace(" ","");
        int counter = 0;
        while (counter + 5 <= split.length()){
            System.out.println(split.substring(counter,counter+5));
            counter += 5;
        }
        System.out.println(split.substring(counter, split.length()));
    }
}
