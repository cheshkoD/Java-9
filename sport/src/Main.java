import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("рост");
        int y = input.nextInt();
        System.out.println("вес");
        int x = input.nextInt();
        boolean b = (y <= 180) && (x <= 80);
        if (b){
            System.out.println("ты принят");
        }else{
            System.out.println("иди прыгай");
        }

    }
}
