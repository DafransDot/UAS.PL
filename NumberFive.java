import java.util.Scanner;

public class NumberFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlharray = input.nextInt();
        if (jmlharray < 1){
            System.out.println("array kosong!!!");
            return;
        }

        int []array = new int[jmlharray];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("tentukan Angka yang dicari :");
        int found = input.nextInt();

        NumberFive Cari = new NumberFive();
        Cari.CariAngka(array,found);

    }
    public static void CariAngka (int[] array,int found){
        boolean bl = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == found ){
                System.out.println("Berikut index dari angka yang ditentukan : " + i);
                bl = true;
            }
        }
        if (bl == false){
            System.out.println("tidak ada");
        }
    }
}
