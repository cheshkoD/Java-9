package pack1;

public class Main {

    public static void main(String[] args) {
        int a,b;
        int x = 45;
        int y = 2;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println("Частное от деления " + (double)x / y);
        a = x++; //46
        b = ++x; //46
        ++x; // x = x +1 инкремент
        System.out.println(a);
        System.out.println(b);
        //декримент
        x--;
        --x;
    }
}
