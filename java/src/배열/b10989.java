package 배열;
// Scanner 가 아닌 입력 및 출력 스트림 설정하기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; // IOException을 위해 import

class b10989{
    public static void main(String[] args) throws IOException{
        // BufferedReader를 사용하여 입력 스트림 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter를 사용하여 출력 스트림 설정
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 줄 P를 읽어옴. readLine()은 항상 String을 반환하므로 int로 파싱 필요.
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        // count 정렬 구현
        int[] count = new int[10001];

        for(int i = 0; i < N; i++){
            count[Integer.parseInt(br.readLine())]++;
        }
        for(int i=1; i<10001; i++){
            while(count[i]-- >0) {
                bw.write(i + "\n");
            }
        }

        // 모든 출력이 끝난 후 버퍼를 비우고 스트림을 닫음
        bw.flush(); // 버퍼에 남아있는 내용을 강제로 출력
        br.close(); // 입력 스트림 닫기
        bw.close(); // 출력 스트림 닫기
    }
}
