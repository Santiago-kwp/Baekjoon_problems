package 완전탐색_시뮬레이션;
// 조건 분류를 하는데 애먹었던 문제로 N이 H보다 작을 때
// W와의 대소 비교를 했어야 했는데 생각이 나지 않아 어려웠다.
import java.util.Scanner;
class b10250{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int stair = 0;
        int num = 0;
        while(T-->0){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            // N이 H의 배수인 경우, 층수는 높이(H)와 같고, 호수는 나눈 몫과 같음
            if (N%H == 0) {
                stair = H;
                num = N/H;
            }
            // N이 H보다 작지만 W 보다 크거나 같은 경우, 층수는 N이고 호수는 1
            else if (N>=W && N<H) {
                stair = N;
                num = 1;
            }
            else {
                stair = N%H;
                num = N/H+1;
            }

            System.out.printf("%d%02d\n", stair, num);
        }
    }
}

// W와 N의 크기 비교를 할 필요가 없는 문제였음.. ㅠㅠ
// N-1 을 하고 연산을 한다는 것을 알아내는 것이 키포인트였던 문제!
// 독립적으로 생각하지 말고 일단 같이 적용될 수 있는 규칙이 있는지 확인하자!
/*import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N =  sc.nextInt();

            int distance = (N-1) / H + 1; // 거리 = 호 수 로 N번째에서 1을 빼고 H로 나눈 "몫"에서 1을 더함 (1층부터 시작)
            int floor = (N-1) % H + 1;
            System.out.printf("%d%02d\n",floor,distance);
        }
    }
}*/
