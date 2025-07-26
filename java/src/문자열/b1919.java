package 문자열;//애너그램 - 문자열
//두 문자열 간 대소비교 후 substring과 indexOf를 통해 해결
import java.util.Scanner;
class b1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next(); // 공백으로 구분된 한 문자열을 받기 위해 .next() 씀
        String st2 = sc.next();
        String buf = "";
        if (st1.length() > st2.length()) {
            buf = st1;
            st1 = st2;
            st2 = buf;
        }
        int ans = st2.length() - st1.length();
        for (int i=0;i<st1.length();i++) {
            if (st2.indexOf(st1.charAt(i)) != -1) {
                int ind=st2.indexOf(st1.charAt(i));
                st2 = st2.substring(0, ind) + st2.substring(ind + 1);
            }
            else
                ans+=2;
        }
        System.out.println(ans);
    }
}