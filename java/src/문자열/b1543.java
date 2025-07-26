package 문자열;//Sliding window 방식으로 같은 문자열을 찾으면 그 문자 길이 만큼 이동, 아니면 한칸 씩 이동
//indexing에서 '<' 가 아닌 '<='으로 해야 정확히 검색할 수 있음!
// substring() 메서드를 사용하였다가 startsWith() 메서드를 추천받아서 사용함
import java.util.Scanner;
class b1543{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();
        int ans = 0;
        int ind = 0;
        while (ind <= (doc.length()-word.length())){
            if (doc.startsWith(word, ind)) {
                ans++;
                ind+=word.length();
            }
            else
                ind++;
        }
        System.out.println(ans);
    }
}


// replace 메서드 이용하기 ~ 일치하는 패턴을 지운 글자 수 / 일치하는 패턴의 글자 수
/*
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();
        String replaced = doc.replace(word, "");
        int ans = (doc.length() - replaced.length()) / word.length();
        System.out.println(ans);
    }
}
*/
