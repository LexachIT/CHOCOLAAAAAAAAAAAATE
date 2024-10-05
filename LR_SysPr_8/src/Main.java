public class Main {
    public static void main(String[] args) {
        int money = 15;
        int price = 1;
        int wrap = 0;
        int chocolate = 0;
        while (money >= 0) {
            money -= price;
            chocolate++;
            wrap++;
            if (wrap == 3) {
                chocolate++;
                wrap = 0;
            }
        }
        System.out.println("Всего шоколадок:" + chocolate);
    }
}