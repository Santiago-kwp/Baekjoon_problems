package 배열;

// 문제에서 요구하는대로 구현한 코드
import java.util.Scanner;
class b10431{
    public static int calMove(int[] arr){
        int count=0;
        int maxHeight = 0;
        for(int i=0;i<20;i++){
            // 1. 내가 가장 클 경우 가장 큰 키 값 갱신하고 움직이지 않음
            if (arr[i] > maxHeight) {
                maxHeight = arr[i];
            }
            else {
                // 2. 나보다 큰 키가 앞에서 존재하는 경우 배열의 맨 앞에부터 비교하여 나보다 큰 키인 경우를 찾음
                // 3. 찾은 후에는 자리를 바꾸며 배열 원소를 조정함.
                for (int j=0; j<i;j++) {
                    if (arr[j] > arr[i]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        for (int k=i;k>j+1;k--) {
                            arr[k] = arr[k-1];
                        }
                        arr[j+1] = temp;
                        count+= i-j;
                    }
                }

            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int P =  sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[P][20];

        for (int i = 0; i < P; i++){
            String inputLine = sc.nextLine();
            String[] stringNumbers = inputLine.split(" ");
            for (int j = 1; j < 21; j++){
                arr[i][j-1] = Integer.parseInt(stringNumbers[j]);
            }
        }
        for (int i = 0; i < P; i++)
            System.out.println(i+1+" "+calMove(arr[i]));
    }
}
