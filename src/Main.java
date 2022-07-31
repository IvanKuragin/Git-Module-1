public class Main {
    public static void main(String[] args) {
        int [] sales = {200, 100, 300, 400, 500};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальная сделка: " + salesManager.max() + " руб.");
        salesManager.min();
        System.out.println("Минимальная сделка: " + salesManager.min() + " руб.");
        salesManager.average();
        System.out.println("Среднее значение продаж (без учета минимальной и максимальной сделки): "
                + salesManager.average() + " руб.");
    }
}
