public class Main {
    public static void main(String[] args) {
        int cache = 100; // деньги на счету
        int amount = 3000; // сумма пополнения
        int bonus;

        if (amount > 1_000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        System.out.println((cache + amount + bonus) + " итого на счету");
    }
}

