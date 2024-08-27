import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int Num = sc.nextInt();

        PriorityQueue<Integer> que = new PriorityQueue<>();

        for(int i = 0; i < Num; i++) {

            int num = sc.nextInt();

            if(num == 0) {
                sb.append(que.size() == 0 ? 0 : que.poll()).append("\n");
            }
            else {
                que.add(num);
            }
        }

        System.out.print(sb);

    }

}
