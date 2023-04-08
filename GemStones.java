import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class GemStones {
    public static void main(String... args) {
        

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<HashSet<Character>> distinctSets = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < N; ++i) {
            HashSet<Character> set = new HashSet<>();
            distinctSets.add(set);
            char[] array = scanner.nextLine().toCharArray();
            for (char c : array)
                set.add(c);
        }
        
        boolean isCurrentCharGem = false;
        int count = 0;
        for(char c : distinctSets.get(0)) {
            isCurrentCharGem = true;
            for (HashSet<Character> set : distinctSets) {
                if (!set.contains(c)) {
                    isCurrentCharGem = false;
                    break;
                }
            }
            if (isCurrentCharGem)
                count++;
        }
        
        scanner.close();
        System.out.println(count);

    }
}


