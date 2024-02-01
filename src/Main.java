import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену:");
        double price = scanner.nextDouble();

        System.out.print("введите промокод:");
        int cod = scanner.nextInt();

        double discount = 0.0;
        switch (cod) {
            case 4525:
                discount = 0.3;
                break;
            case 6424:
            case 7012:
                discount = 0.2;
                break;
            case 7647:
            case 9011:
            case 6612:
                discount = 0.1;
                break;

            default:
                System.out.println("скидка не найдена,цена: "+price);
        }
        double totalPrice = price - (price * discount);
        if (discount == 0) {
            System.out.println();
        } else {
            System.out.println("Цена со скидкой: " + totalPrice);
        }
    }
}