import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner muns = new Scanner(System.in);
        int m = muns.nextInt();
        String season = " ";
        switch(m) {
            case 1: season = "Январь";
                break;
            case 2: season = "Февраль";
                break;
            case 3: season = "Март";
                break;
            case 4: season = "Апрель";
                break;
            case 5: season = "Май";
                break;
            case 6: season = "Июнь";
                break;
        }
        System.out.println(season);
    }
}
