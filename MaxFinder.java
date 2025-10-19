public class MaxFinder {

    public int findMax(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public double findMax(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        MaxFinder m = new MaxFinder();

        int maxInt = m.findMax(10, 25);
        double maxDouble = m.findMax(5.7, 3.9);

        System.out.println("Larger int value: " + maxInt);
        System.out.println("Larger double value: " + maxDouble);
    }
}
