import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi=input.nextInt(),toplam=0;
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i == 0) {
                toplam+=i;
            }
        }
        if (toplam == sayi) {
            System.out.println(sayi+" Mükkemmel Sayıdır.");
        }
        else {
            System.out.println(sayi+" Mükkemmel Sayı Değildir.");
        }
    }
}