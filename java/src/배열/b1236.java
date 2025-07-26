package 배열;

// 2D-char 배열로 입력을 받아서 각 행과 열에서 경비원이 있는 경우를
// countN, countM 행렬로 체크하고 추가로 필요한 경비원의 수를
// max 함수를 통해서 결정함
import java.util.Scanner;
public class b1236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] arr = new char[N][M];
        int[] CountN = new int[N];
        int[] CountM = new int[M];
        int needN = 0;
        int needM = 0;

        for (int i=0; i<N; i++){
            String input = sc.next();
            for (int j=0; j<M; j++){
                arr[i][j] = input.charAt(j);
                if (arr[i][j] == 'X'){
                    CountN[i]++;
                    CountM[j]++;
                }
            }
        }
        for (int i=0; i<N; i++) {
            if (CountN[i] == 0) {
                needN++;
            }
        }
        for (int j=0; j<M; j++) {
            if (CountM[j] == 0) {
                needM++;
            }
        }
        System.out.println(Math.max(needN, needM));
    }
}