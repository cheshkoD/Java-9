import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
        System.out.println("введите число 3хзн");
        int z = sc.nextInt();
        for (int b = 2; b <= z; b++) {
            for (int j = 2;j <= b; j++) {
                if (z %j == 0) {
                    System.out.println(j + "");
                    z = z / j;
                }
            }
        }
    }

}
