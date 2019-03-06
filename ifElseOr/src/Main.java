public class Main {

    public static void main(String[] args) {
        int vKarmane = 10;
        int naCart = 100;
        int bilet = 40;
        boolean rezultat = vKarmane >= bilet || naCart >= bilet ;
        if(rezultat){
            System.out.println("go to the cinema");
        }else {
            System.out.println("no no no no");
        }
    }
}
