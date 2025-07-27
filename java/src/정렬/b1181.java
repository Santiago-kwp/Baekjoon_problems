// b1181 TreeSet<E> 과 람다식을 이용해서 두 가지 기준의 정렬을 수행하는 코드
import java.util.Scanner;
import java.util.TreeSet;

class b1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        TreeSet<String> sortedWords = new TreeSet<>((s1, s2)-> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            return s1.compareTo(s2);
        });


        while (N-- > 0) {
            sortedWords.add(sc.nextLine());
        }

        for(String s:sortedWords)
            System.out.println(s);

    }
}