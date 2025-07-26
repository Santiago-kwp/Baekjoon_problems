package 완전탐색_시뮬레이션;
import java.util.Scanner;
public class b1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int mn = A.length();

        for (int i = 0; i<=B.length()-A.length(); i++) {
            int diff = 0;
            for (int j=0; j<A.length();j++) {
                if (A.charAt(j) != B.charAt(i+j)) {
                    diff++;
                }
            }
            if (diff < mn) mn = diff;
        }
        System.out.println(mn);
    }
}
