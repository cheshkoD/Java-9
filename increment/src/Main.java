public class Main {

    public static void main(String[] args) {
        int  x = 20;
        double y =21;
         //System.out.println((int)(x + y)); //кастинг
        short a =227;
        byte b =100;
         //System.out.println((byte) (a + b));
         int  f = x++; //x = x + 1; инкремент; постфиксная форма
         //System.out.println(x);
        //System.out.println(f);
        int h = ++x; //префиксная форма
        //System.out.println(x);
        //System.out.println(h);
        --a; //декримент
        a--;
        boolean sr = x != y; //false
        System.out.println(sr);
        int k = 9;
        int l = 10;
        System.out.println((k = l) < 21 );
    }
}
