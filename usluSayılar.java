import java.util.Scanner ;
public class usluSayılar {
    public static void main(String[] args) {

        int n , r ;
        int total = 1 ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Üssü ALınacak Sayı : ");
        n = inp.nextInt();
        System.out.print("Üs Olacak Sayı : ");
        r = inp.nextInt();

        for (int a = 1; a <= n; a++) {
            total *= n ;
        }
        System.out.print("Cevap : " + total);
    }
}
