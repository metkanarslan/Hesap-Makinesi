import java.util.Scanner;

public class Yeniiiiii {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz :");
        n1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz :");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz nedir : ");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.print("Toplam :" + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma :" + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma :" + (n1 * n2));
                break;
            case 4:
                System.out.print("Bölme :" + (n1/n2));
                break;
        }
    }

}
