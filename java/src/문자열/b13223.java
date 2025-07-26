package 문자열;// 시, 분, 초를 각각 정수형으로 파싱해서 23:59:60을 각각 더한뒤 시간에서 뺀다음
// 몫과 나머지 연산을 통해 각각 계산하고, 별도로 출력함..
import java.util.Scanner;
class b13223{
    public static int[] extract_hms(String str){
        int[] hms = new int[3];
        hms[0] = Integer.parseInt(str.substring(0,2));
        hms[1] = Integer.parseInt(str.substring(3,5));
        hms[2] = Integer.parseInt(str.substring(6,8));
        return hms;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();
        String t2 = sc.next();

        int[] ta1 = extract_hms(t1);
        int[] ta2 = extract_hms(t2);
        int[] ans = new int[3];

        ans[2] = (ta2[2]+60-ta1[2])%60;
        ans[1] = (ta2[1]+59-ta1[1] + ((ta2[2]+60-ta1[2])/60))%60;
        ans[0] = (ta2[0]+23-ta1[0] + (ta2[1]+59-ta1[1]+((ta2[2]+60-ta1[2])/60))/60)%24;

        if (ans[0] == 0 && ans[1] == 0 && ans[2] == 0){
            System.out.println("24:00:00");
        }
        else {
            for (int i = 0; i<=2;i++) {
                if (ans[i]<10) {
                    System.out.print("0"+String.valueOf(ans[i]));
                }
                else
                    System.out.print(String.valueOf(ans[i]));
                if(i!=2)
                    System.out.print(":");
            }
        }
    }
}


/* 시/분/초를 가장 작은 단위인 초로 묶어서 계산하기!
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String current = sc.next();
        String drop = sc.next();

        String[] currentUnit = current.split(":");
        int currentHour = Integer.parseInt(currentUnit[0]);
        int currentMinute = Integer.parseInt(currentUnit[1]);
        int currentSecond = Integer.parseInt(currentUnit[2]);
        int currentSecondAmount = currentHour*3600 + currentMinute*60 + currentSecond;

        String[] dropUnit = drop.split(":");
        int dropHour = Integer.parseInt(dropUnit[0]);
        int dropMinute = Integer.parseInt(dropUnit[1]);
        int dropSecond = Integer.parseInt(dropUnit[2]);
        int dropSecondAmount = dropHour*3600 + dropMinute*60 + dropSecond;

        int needSecondAmount = dropSecondAmount - currentSecondAmount;
        if(needSecondAmount <= 0){
            needSecondAmount += 3600*24;
        }

        int needHour = needSecondAmount / 3600;
        int needMinute = needSecondAmount % 3600 / 60;
        int needSecond = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);

    }
}*/
