package 완전탐색_시뮬레이션;
import java.util.Scanner;
public class b1233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S1 = sc.nextInt();
        int S2 = sc.nextInt();
        int S3 = sc.nextInt();
        int[] frequency = new int[81];

        for (int i=1; i<=S1; i++) {
            for (int j=1; j<=S2; j++) {
                for (int k=1; k<=S3; k++) {
                    frequency[i+j+k]++;
                }
            }
        }

        int mx = 0;
        int ans = 0;
        for (int i=1; i<81; i++) {
            if (frequency[i]>mx) {
                mx = frequency[i];
                ans = i;
            }
        }

        System.out.println(ans);


    }
}