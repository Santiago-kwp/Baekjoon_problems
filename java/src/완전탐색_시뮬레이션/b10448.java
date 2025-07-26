package 완전탐색_시뮬레이션;
// 3중 for 문을 통해 삼각수 완전 탐색함
import java.util.Scanner;

class b10448{
    public static int findTriganleNum(int target){
        // 1. 1000보다 작은 삼각수 배열 생성하기 i=44일 때 삼각수는 990
        int triangleNums[] = new int[44];
        for(int i=0; i < 44; i++)
            triangleNums[i]=(i+1)*(i+2)/2;

        // 44개의 원소 중 중복을 허용하여 3개를 뽑는 루프 생성 : 44*44*44면 85,000대의 시간복잡도
        for (int i=0; i < 44; i++){
            for (int j=0; j < 44; j++){
                for (int k=0; k < 44; k++){
                    if (triangleNums[i]+triangleNums[j]+triangleNums[k]==target){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            int K = sc.nextInt();
            System.out.println(findTriganleNum(K));
        }
    }
}