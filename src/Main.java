public class Main {
    public static void main(String[] args) {
        int [] sales = {100, 200, 300};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальная сделка: " + salesManager.max() + " руб.");
    }
}
