package 완전탐색_시뮬레이션;
import java.util.Scanner;
class b3085{
    // 보드의 모든 구성을 바꿔보고 최대 캔디수를 리턴하는 메서드
    public static int switchBoard_returnMaxCandy(char[][] board){
        int maxCandy = 0;
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){


                if (j < board[0].length-1){
                    // 인접한 열 원소간 변경
                    int candynum = 0;
                    if (board[i][j] != board[i][j+1]){
                        char temp = board[i][j];
                        board[i][j] = board[i][j+1];
                        board[i][j+1] = temp;
                        candynum = calMaxCandy(board);
                        if (candynum > maxCandy) maxCandy = candynum;

                        // 보드 원복
                        temp = board[i][j];
                        board[i][j] = board[i][j+1];
                        board[i][j+1] = temp;
                    }

                    // 인접한 행 원소 간 변경
                    if (board[j][i] != board[j+1][i]){
                        char temp = board[j][i];
                        board[j][i] = board[j+1][i];
                        board[j+1][i] = temp;
                        candynum = calMaxCandy(board);
                        if (candynum > maxCandy) maxCandy = candynum;

                        // 보드 원복
                        temp = board[j][i];
                        board[j][i] = board[j+1][i];
                        board[j+1][i] = temp;
                    }


                }
            }
        }
        return maxCandy;
    }

    // 현재 보드의 최대 캔디 수를 리턴하는 메서드
    public static int calMaxCandy(char[][] board) {
        int maxCandy = 0;

        char candyColor[] = {'C','P','Z','Y'};
        for (int c=0; c<candyColor.length; c++){
            for (int i=0; i<board.length; i++){
                int consecutiveCandy = 1; // 연속된 캔디 수는 1부터임
                // 행 검사
                for (int j=0; j<board[0].length-1; j++){
                    boolean isContinued = false;
                    if (board[i][j] == candyColor[c] && board[i][j+1] == candyColor[c])
                        consecutiveCandy++;
                        // 연속이 끊기면 현재 캔디값 저장하고 초기화
                    else {
                        if (consecutiveCandy > maxCandy)  maxCandy = consecutiveCandy;
                        consecutiveCandy = 1;
                    }
                }
                if  (consecutiveCandy > maxCandy) maxCandy = consecutiveCandy;
                // 열 검사
                consecutiveCandy = 1;
                for (int j=0; j<board[0].length-1; j++){
                    if (board[j][i] == candyColor[c] && board[j+1][i] == candyColor[c]) {
                        consecutiveCandy++;
                    }
                    else {
                        if (consecutiveCandy > maxCandy)  maxCandy = consecutiveCandy;
                        consecutiveCandy = 1;
                    }
                }
                if  (consecutiveCandy > maxCandy) maxCandy = consecutiveCandy;
            }
        }
        return maxCandy;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        char[][] board = new char[N][N];
        for(int i = 0; i < N; i++)
            board[i] = sc.nextLine().toCharArray();

        System.out.println(switchBoard_returnMaxCandy(board));


    }
}
