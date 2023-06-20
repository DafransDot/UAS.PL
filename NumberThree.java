import java.util.Scanner;

public class NumberThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlharray = input.nextInt();
        if (jmlharray < 1 ){
            System.out.println("array kosong!!!");
            return;
        }

        int[] array = new int[jmlharray];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int jmlahAngka = 0;
        NumberThree Cari = new NumberThree();
        Cari.CariAngka5(array,jmlahAngka);

    }

    public static void CariAngka5(int[] array , int jmlahAngka) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                jmlahAngka++;
                System.out.println("Berikut angka kelipatan 5 ke "+jmlahAngka +" : " + array[i]);
            }
        }
    }
}