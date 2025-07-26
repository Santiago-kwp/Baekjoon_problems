package 완전탐색_시뮬레이션;

import java.util.Scanner;
class b11068{
    public static int checkCircular(int originalNum){

        // 2진법부터 64진법까지 회문인수 검사
        for (int i=2; i<65; i++) {
            int num = originalNum; // 입력 숫자 초기화
            String snum = "";
            // i진법 수 만들기
            while (num>0){
                int D = num%i;
                snum += (char)D;
                num = num/i;
            }
            // 회문인수 체크
            boolean isCircularNum = true;
            for (int j = 0; j < snum.length() / 2; j++){
                if (snum.charAt(j) != snum.charAt(snum.length()-1-j)) {
                    isCircularNum = false;
                    break;
                }
            }
            // 회문인 수 검사를 한번이라도 통과하면 return 1
            if (isCircularNum) return 1;
        }
        // 모든 N진법의 회문인 수 검사를 통과하지 못하면 return 0
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T =  sc.nextInt();
        while(T-- > 0){
            System.out.println(checkCircular(sc.nextInt()));
        }
    }
}