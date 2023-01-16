public class Main {
    public static void main(String[] args) {

        int ticketPrice = 88_000; // будем реалистами
        int milesBonus = 20; // не акция - сказка
        int giftMiles = (ticketPrice / milesBonus);

        System.out.println(" Количество бонусных миль составляет: " + giftMiles);
    }
}