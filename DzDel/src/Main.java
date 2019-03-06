import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        int m = nums.nextInt();
        int k = 0;
        for (int i = 1;i <= m; i++) {
            if (m % i == 0) {
                k++;
            }
        }
        if (k < 3){
            System.out.println("число простое");
        }else{
            System.out.println("Число составное, кол-во делителей равно " + k);
        }
    }
}
