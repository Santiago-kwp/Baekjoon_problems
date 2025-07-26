package 완전탐색_시뮬레이션;
import java.util.Scanner;
public class b2309 {
    public static boolean[] findFakeDwarf(int total, int[] dwarfs) {
        boolean[] fakeDwarf = new boolean[9];
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (total - dwarfs[i] - dwarfs[j] == 100) {
                    fakeDwarf[i] = true;
                    fakeDwarf[j] = true;
                    return fakeDwarf;
                }
            }
        }
        return fakeDwarf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dwarfs = new int[9];
        boolean[] fakeDwarf = new boolean[9];
        int total = 0;
        for (int i=0; i<9; i++){
            int n = sc.nextInt();
            dwarfs[i]=n;
            total+=n;
        }

        fakeDwarf = findFakeDwarf(total, dwarfs);

        int[] heights = new int[101];
        for (int i=0; i<9; i++) {
            if (!fakeDwarf[i]) heights[dwarfs[i]]++;
        }
        for (int i=1; i<101; i++) {
            if (heights[i] !=0) System.out.println(i);
        }


    }
}
