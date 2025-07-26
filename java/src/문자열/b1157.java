package 문자열;// count 함수와 flag 변수를 이용해서 중복한 개수의 알파벳이 있는 경우를 체크함
import java.util.Scanner;
class b1157{
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                count[str.charAt(i) - 'A']++;
            else
                count[str.charAt(i) - 'a']++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] countS = getAlphabetCount(s);
        int mx = 0;
        int flag = 0;
        char ans = 'a';
        for (int i = 0; i < 26; i++) {
            if (countS[i] > mx) {
                flag = 0;
                mx = countS[i];
                ans = (char)(i+'A');
            }
            else if (countS[i] == mx) {
                flag = 1;
            }

        }
        if  (flag==1)
            System.out.println("?");
        else
            System.out.println(ans);
    }
}
