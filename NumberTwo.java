import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("input teks : ");
    String teks = input.next();

    if(teks.length() == 5){
        System.out.println("Teks tersebut memiliki 5 karakter");
        }else {
        System.out.println("Teks tersebut Tidak memilki 5 karakter!!!");
    }
    }
}
