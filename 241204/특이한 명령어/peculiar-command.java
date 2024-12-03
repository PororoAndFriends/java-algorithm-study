import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        for(int i=0;i<count;i++){
            String[] split = scanner.nextLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            if(split[2].equals("t")){
                System.out.println(a * b / 2.0);
            }else if(split[2].equals("s")){
                System.out.println(a * b);
            }
        }
    }
}