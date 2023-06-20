import java.util.Scanner;

public class NumberFour {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int jmlharray = input.nextInt();
        if (jmlharray < 1 ){
            System.out.println("array kosong!!!");
            return;
        }

    String[] array = new String[jmlharray];
    for (int i = 0; i < array.length; i++) {
        array[i] = input.nextLine();
    }

    NumberFour Cari = new NumberFour();
    Cari.CariAngka5(array);

}

    public static void CariAngka5(String [] array ) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 5) {
                System.out.println("Berikut Teks yang memiliki 5 Karakter : " + array[i]);
            }
        }
    }
}
