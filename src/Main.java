public class Main {
    public static void main(String[] args) {
        int check = 522;
        int amountOfHit = 1500;
        int bonus;
        int replenishmentAccount = 1000;

        if (amountOfHit >= replenishmentAccount) {
            bonus = amountOfHit / 100;
        } else {
            bonus = 0;
        }
        int sum = check + amountOfHit + bonus;
        System.out.println("Сумма бонуса:" + sum);
    }
}