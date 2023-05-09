public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1100;
        int reward = 1;

        if (payment > 1000) {
            int bonus = payment / 100 * reward;
            System.out.println("Количество бонусов: " + bonus);
            System.out.println("Итоговый счёт: " + (balance + payment + bonus));
        } else {
            int bonus = 0;
            System.out.println("Количество бонусов: " + bonus);
            System.out.println("Итоговый счёт: " + (balance + payment));
        }
    }
}