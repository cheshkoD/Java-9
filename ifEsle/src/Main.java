import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.print("сколько есть денек?");
        int x = ch.nextInt();
        System.out.println();
        System.out.println("Па чем?");
        int y = ch.nextInt();
        System.out.println("Твой гусь с тобой идет?");
        boolean s  = ch.hasNextBoolean();
        boolean b = (x >= y) && s;
        //System.out.println(b);
        if (b){
            System.out.println("Тыц гоу ту синема!!");
        }else{
            System.out.println("ЛОХ, СИДР");
        }
    }
}
