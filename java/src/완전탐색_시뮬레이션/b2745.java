package 완전탐색_시뮬레이션;
import java.util.Scanner;

public class b2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        String N = strs[0];
        int B = Integer.parseInt(strs[1]);
        int ans = 0;
        int carry = 1;
        for (int i = N.length()-1; i>=0; i--) {
            char n =  N.charAt(i);
            if (n >= 'A' && n <= 'Z') {
                ans+= carry*(n-'A'+10);
            }
            else {
                ans+= carry*(n-'0');
            }
            carry*=B;
        }
        System.out.println(ans);
    }
}
