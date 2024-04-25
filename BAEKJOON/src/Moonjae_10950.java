import java.util.Scanner;

// 스캐너로 전체 입력횟수를 받아서
//한번에 2개 정수 입력받고
// 10개 다 입력받으면 A+B 값을 출력해라
public class Moonjae_10950 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int arr[] = new int[C];

        for(int i = 0; i <C;i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[i] = A + B;
        }
        sc.close();

        for(int D : arr){
            System.out.println(D);
        }
    }
}
