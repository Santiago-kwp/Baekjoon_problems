package 완전탐색_시뮬레이션;
import java.util.Scanner;
public class b2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=1000000;i++) {
            int carry = i;
            int generator = i;
            while(carry>0) {
                generator+=(carry%10);
                carry/=10;
            }
            if(generator==N) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}