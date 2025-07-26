package 완전탐색_시뮬레이션;
import java.util.Arrays;
import java.util.Scanner;

class b2817{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        // 26개의 대문자 알파벳을 가진 스태프들이 받은 득표수 배열
        int[] staffVotes = new int[26];
        double[][] staffVoteMatrix = new double[26][14];
        boolean[] overCutOff = new boolean[26];
        double[] totalVotes = new double[140];
        double cutOff = 0.05*X;
        int staffNum = 0;
        while(N-- > 0) {
            int n = sc.next().charAt(0) - 'A';
            int votes = sc.nextInt();
            // 득표수가 5% 미만인 경우 다음 스태프로 넘어감
            if (votes < cutOff) continue;
            overCutOff[n] = true;
            staffNum++;
            // 스태프 득표수 배열에 1부터 14까지 나눈 값을 저장
            for (int i = 0; i < 14; i++) {
                staffVoteMatrix[n][i] = (double) votes / (i + 1);
                totalVotes[14*staffNum+i-1] = staffVoteMatrix[n][i];
            }
        }
        // 오름차순으로 받은 표를 정렬
        Arrays.sort(totalVotes);
        for (int i=0; i<26; i++){
            int currentStaffVote = 0;
            for (int j=0; j<14; j++){
                for(int k=totalVotes.length-1; k>totalVotes.length-15; k--){
                    if (totalVotes[k] == staffVoteMatrix[i][j]) {
                        currentStaffVote++;
                    }
                }
            }
            if (overCutOff[i]) System.out.println((char)(i+'A')+" "+currentStaffVote);
        }
        if (N==0) System.out.println(" ");
        //System.out.println();

    }
}