package 완전탐색_시뮬레이션;
import java.io.*;

class b1730{
    public static char stamp(char grid, char move){
        if (grid=='.') {
            if (move=='D') grid = (char)124; //124 : '|'
            if (move=='U') grid = (char)124;
            if (move=='R') grid = (char)45;  //45 : '-'
            if (move=='L') grid = (char)45;
        }
        if (grid==(char)124) {
            if (move=='R') grid = (char)43;  //43 : '+'
            if (move=='L') grid = (char)43;
        }
        if (grid==(char)45) {
            if (move=='D') grid = (char)43;
            if (move=='U') grid = (char)43;
        }
        return grid;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        char[][] map = new char[N][N];
        // 초기화
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j] = '.';
            }
        }
        char [] moves = br.readLine().toCharArray();
        char[] dir = {'U','D','R','L'};
        int[] dirR = {-1,1,0,0};
        int[] dirC = {0,0,1,-1};
        int[] current = {0,0}; // r,c 좌표

        for (int i=0; i<moves.length; i++){
            for (int d=0; d<dir.length; d++){
                // 진행 방향 확인
                if (dir[d]==moves[i]){
                    if (current[0]+dirR[d]>=0 && current[0]+dirR[d]<N && current[1]+dirC[d]>=0 && current[1]+dirC[d]<N){
                        // stamp 찍기
                        map[current[0]][current[1]] = stamp(map[current[0]][current[1]], moves[i]);
                        // 이동하기
                        current[0]+=dirR[d];
                        current[1]+=dirC[d];
                        // stamp 찍기
                        map[current[0]][current[1]] = stamp(map[current[0]][current[1]], moves[i]);
                    }
                    break;
                }
            }
        }
        for (int i=0;i<N;i++)
            System.out.println(map[i]);
        bw.flush();
    }
}