import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int random = (int) (Math.random()*9)+1;
        int i = 3;

        Scanner sc = new Scanner(System.in);


        while (i>0) {

            System.out.println("Введите число от 1 до 9:");
            int number = sc.nextInt();

            if (number > 9 || number <= 0) {
                System.out.println("число не в диапозоне от 1 до 9: \n");
                continue;
            }

            if (number == random) {
                System.out.println("точно в цель");
                break;

            }else if (number < random) {
                System.out.println("число больше ");
            }

            else  {
                System.out.println("число меньше");
            }
        i--;

        }
        if(i == 0){
            System.out.println("загаданное число было: "+random);
        }
    }
}

