import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 식당 수
        int restCount = scanner.nextInt();

        int[] custCount = new int[1000000];

        for(int i=0;i<restCount;i++){
            custCount[i] = scanner.nextInt();
        }

        // 팀장이 검사 가능한 수
        int head = scanner.nextInt();
        // 팀원이 검사 가능한 수
        int tail = scanner.nextInt();
        int count = 0;

        for(int i=0;i<restCount;i++){
            int temp = custCount[i];
            temp -= head;
            count += 1;
            if(temp > 0){
                count += temp / tail;
                if(temp % tail != 0){
                    count += 1;
                }
            }
        }

        System.out.println(count);
    }
}