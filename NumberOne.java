import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Berikanlah Sebuah angka :");
        int array= input.nextInt();

        if(array % 5 ==0){
            System.out.println("Angka tersebut termasuk kelipatan 5");
        }else {
            System.out.println("Angka tersebut tidak termasuk kelipatan 5!!!");
        }
    }
}
