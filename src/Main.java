import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер квартиры: ");
        int apartmentNumber = scanner.nextInt();

        int floor = (apartmentNumber - 1) / 4 + 1; // Вычисление этажа
        int position = (apartmentNumber - 1) % 4; // Вычисление позиции

        String floorLocation;
        String positionLocation;


        // Определение положения позиции
        if (position == 0) {
            positionLocation = "слева от лифта";
        } else if (position == 1) {
            positionLocation = "справа от лифта";
        } else if (position == 2) {
            positionLocation = "дальняя с лева ";
        } else {
            positionLocation = "дальняя справа";
        }
        if (apartmentNumber <= 36) {
            System.out.println("Этаж: " + floor);
            System.out.println("Место: " + positionLocation);
        }
        while (apartmentNumber > 36) {
            System.out.println("ДАННАЯ КВАРТИРА ОТСУТСТВУЕТ!!!");
            break;
        }
    }
}