public class Main {

    public static void main(String[] args) {
        //System.out.println(1);
        //System.out.println(2);
        //System.out.println(3);
        //System.out.println(4);
        //System.out.println(5);
        for(int i=1;i<=30;i=i+2){
            System.out.print(i + " , ");
        }
        System.out.println();
        for(int k=1;k <=3;k++){
            for (int l = 0;l <= 9;l++){
                System.out.print(10 * k +  l + "  ");
            }
            System.out.println();
        }
    }
}
// 10 11 12 . . 19
//20 21 22 . . 29
//30 31 32 . . 39