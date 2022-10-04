public class Main {
    public static void main(String[] args) {
        int startAmount = 100;
        int addAmount = 1100;
        int bonusAmount;
        int finalAmount;

        if (addAmount > 1000) {
            bonusAmount = addAmount / 100;
        } else {
            bonusAmount = 0;
        }
        finalAmount = startAmount + addAmount + bonusAmount;
        System.out.println("Ваш итоговый счет " + finalAmount + " рублей");
        System.out.println("Вам начислено " + bonusAmount + " бонусных рублей");

    }
}
