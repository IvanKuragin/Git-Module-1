public class SalesManager {
    protected int [] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }
    public int max() {
        int max = sales [0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales [0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public int average() {
        int sum = 0;
        for (int sale : sales) {
            if (sale != max() && sale != min()) {
                sum += sale;
            }
        }
        int average = sum/(sales.length -2);
        return average;
    }
}
