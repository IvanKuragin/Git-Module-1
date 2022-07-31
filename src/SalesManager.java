public class SalesManager {
    protected long [] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales [0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public long average() {
        int sum = 0;
        for (long sale : sales) {
            if (sale != max() && sale != min()) {
                sum += sale;
            }
        }
        long average = sum/(sales.length -2);
        return average;
    }
}
