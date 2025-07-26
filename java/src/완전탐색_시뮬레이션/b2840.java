package 완전탐색_시뮬레이션;
import java.util.Scanner;

class b2840{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] S = new int[K];
        char[] lastAlpabet = new char[K];
        char[] ans = new char[N];
        boolean luckyTest = false;

        for (int i=0; i<N; i++)
            ans[i] = '?';

        for(int i = 0; i < K; i++){
            S[i] = sc.nextInt();
            lastAlpabet[i] = sc.next().charAt(0);
        }
        // 뒤에서 하나씩 갱신
        int curInd = 0;
        ans[0] = lastAlpabet[K-1];
        String usedAlpabet = "";

        for (int i=K-1; i>=0; i--){
            // 만약 한바퀴를 돌려서 변화가 없는데 같은 알파벳이 나오지 않은 경우 행운의 바퀴가 아님
            if (i>1 && S[i] == N && lastAlpabet[i] != lastAlpabet[i-1]) luckyTest = true;

            // 이미 있는 알파벳을 기존 알파벳이 아닌 새로운 알파벳으로 갱신하려는 경우
            if (ans[curInd] != '?' && ans[curInd] != lastAlpabet[i]) luckyTest = true;

            // 아직 갱신이 안된 알파벳인데 이미 쓰인 알파벳인 경우
            if (ans[curInd] == '?' && usedAlpabet.indexOf(lastAlpabet[i]) != -1) luckyTest = true;

            ans[curInd] =  lastAlpabet[i];
            usedAlpabet += lastAlpabet[i];
            // rotate 수만큼 돌리돼, 한바퀴 돌 때 인덱스 0부터 다시 시작하기 위해 N으로 나눈 나머지를 현재 인덱스로
            curInd = (curInd + S[i])%N;

        }

        if (luckyTest) System.out.println("!");
        else {
            for (int i = 0; i < N; i++)
                System.out.print(ans[i]);
        }

    }
}