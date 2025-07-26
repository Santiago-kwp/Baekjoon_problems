package 배열;
// count 배열을 활용해서 해결 메모리는 대략 8백만 바이트이므로 약 8MB 필요하여 괜찮았음
import java.util.Scanner;
class b3273{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count[] = new int[2000001];
        int ans = 0;
        for (int i=0; i<N; i++) {
            count[sc.nextInt()]++;
        }
        int x = sc.nextInt();
        for (int i=1; i<1000001; i++){
            while(count[i]-- >0){
                if (x>i && count[x-i]-- >0)
                    ans++;
            }
        }
        System.out.println(ans);
    }
}