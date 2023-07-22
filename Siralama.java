import java.util.Scanner;

public class Siralama {

    public static void main(String[] args) {

        int n1,n2,n3;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ilk sayısı giriniz: ");
        n1 = input.nextInt();

        System.out.print("Lütfen ikinci sayısı giriniz: ");
        n2 = input.nextInt();

        System.out.print("Lütfen üçüncü sayısı giriniz: ");
        n3 = input.nextInt();

        if ( (n1 > n2) && (n1 > n3) && (n2 > n3))
        {
            System.out.print("Sayılar Büyükten Küçüğe Doğru: "+ n1 + " > " + n2 + " > " + n3);
        } else if ( (n2 > n1) && (n2 > n3) && (n1 > n3))
        {
            System.out.print("Sayılar Büyükten Küçüğe Doğru: "+ n2 + " > " + n1 + " > " + n3);
        } else if ( (n1 > n2) && (n1 > n3) && (n3 > n2) )
        {
            System.out.print("Sayılar Büyükten Küçüğe Doğru: "+ n1 + " > " + n3 + " > " + n2);
        } else if ( (n2 > n1) && (n2 > n3) && (n3 > n1))
        {
            System.out.print("Sayılar Büyükten Küçüğe Doğru: "+ n2 + " > " + n3 + " > " + n1);
        } else if ( (n3 > n1) && (n3 > n2) && (n1 > n2))
        {
            System.out.print("Sayılar Büyükten Küçüğe Doğru: "+ n3 + " > " + n1 + " > " + n2);
        } else if ( (n3 > n1) && (n3 > n2) && (n2 > n1))
        {
            System.out.print("Sayılar Büyükten Küçüğe Doğru: "+ n3 + " > " + n2 + " > " + n1);
        }
    }
}
