import java.util.ArrayList;
import java.util.Scanner;
public class Beautiful {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a;
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            boolean isBeautiful = true;
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> array = new ArrayList<>();
            arr.add(scanner.nextInt());
            a = arr.get(0);
            for (int j = 1; j < n; j++) {
                arr.add(scanner.nextInt());
                array.add(a * arr.get(j));
                a = arr.get(j);
            }
            for (Integer integer : array) {
                if (!arr.contains(integer)) {
                    isBeautiful = false;
                    break;
                }
            }
            if (isBeautiful) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}