public class SalesManager {
    protected long[] sales;
//    protected long max;
//    protected long min;


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
        //this.max = max;
        return max;
    }

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        //this.min = min;
        return min;
    }

    public long average() {
        int sum = 0;
        for (long sale : sales) {
                sum += sale;
        }
        long average = (sum - (max()+min())) / (sales.length - 2);
        return average;
    }
}
