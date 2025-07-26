package 완전탐색_시뮬레이션;
import java.util.Scanner;
public class b1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        char[][] board = new char[N][M];
        int ans = 64;
        for (int i=0; i<N; i++){
            board[i] = sc.nextLine().toCharArray();
        }

        String pattern = "BWBWBWBW";

        char[][] chessBoard = new char[8][8];
        for (int r=0; r<=(N-8); r++) {
            for (int c=0; c<=(M-8); c++) {
                int Cnt1 = 0;
                int Cnt2 = 0;
                for (int i=0; i<8; i+=2) {
                    for (int j=0; j<8; j++) {
                        if (board[i+r][j+c] != pattern.charAt(j)) Cnt1++;
                        if (board[i+r+1][j+c] != pattern.charAt(7-j)) Cnt1++;

                        if (board[i+r][j+c] != pattern.charAt(7-j)) Cnt2++;
                        if (board[i+r+1][j+c] != pattern.charAt(j)) Cnt2++;
                    }
                }
                ans = Math.min(ans, Math.min(Cnt1, Cnt2));
            }
        }
        System.out.println(ans);

    }
}