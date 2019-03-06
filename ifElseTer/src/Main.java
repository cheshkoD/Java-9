public class Main {

    public static void main(String[] args) {
        int a = -10;
        //if (a < 0 ){
         //   a = -a;
        //}else{
        //    a = a;
        //}
        //System.out.println(a);
        a = (a < 0)? -a : a;
        // 1        2       3       4
        //          true    1=3
        //          false   1=4
        System.out.println(a);
    }
}
