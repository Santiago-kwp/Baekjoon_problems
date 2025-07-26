package 완전탐색_시뮬레이션;
// 나눠질때까지 몫과 나머지로 분리한 뒤 진법의 크기에 따라서 아스키코드 변환을 함

import java.util.Scanner;
class b11005{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        int remainder = 0;
        String s = "";
        while (N >= B) {
            remainder = N % B;
            N = N/B;
            if (remainder >= 10)
                s = (char) ((remainder-10) + 'A') + s;
            else
                s = (char) (remainder + '0') + s;
        }
        if (N >= 10)
            s = (char) ((N - 10) + 'A') + s;
        else
            s = (char) (N + '0') + s;

        System.out.println(s);
    }
}