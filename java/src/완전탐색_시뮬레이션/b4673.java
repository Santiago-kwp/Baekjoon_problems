package 완전탐색_시뮬레이션;

class b4763 {
    public static int dN(int N) {
        int dn = N;
        while(N>0) {
            dn += N%10;
            N /= 10;
        }
        return dn;
    }
    public static void main(String[] args) {
        boolean selfNumber = true;
        for (int i=1; i<=10000; i++) {
            for (int j=1; j<=10000; j++) {
                if (dN(j) == i) {
                    selfNumber = false;
                    break;
                }
                else if (dN(j) > 2*i) break; // 찾을 가능성이 없는 경우
            }
            if (!selfNumber) selfNumber = true;
            else System.out.println(i);
        }

    }
}