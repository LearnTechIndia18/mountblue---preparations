
import java.util.*;
public class SherlockSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = sc.nextInt();
            int[] a = new int[n];
            TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                tm.put(a[i], i);
            }
            int lastIndex = n;
            int ans = 0;
            while (!tm.isEmpty()) {
                Map.Entry<Integer, Integer> e = tm.pollLastEntry();
                if (e.getValue() < lastIndex) {
                    lastIndex = e.getValue();
                    ans++;
                }
            }
            System.out.println(ans%2==0?"ANDY":"BOB");
        }
    }
}