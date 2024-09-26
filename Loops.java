class Loops {
    public void multiplesOfSeven() {
        int count = 0;
        while (count <= 100) {
            if (count % 7 == 0) {
                System.out.println(count);
            }
            ++count;
        } 
    }
    public int sumUpTo(int max) {
        int i = 0;
        int sum = 0;
        while (i <= max) {
            sum += i;
            ++i;
        }
        return sum;
    }
    public int sumBetween(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; ++i) {
            sum += i;
        }
        return sum;
    }
    public int sumSquares(int max) {
        int i = 0;
        int sum = 0;
        while (i <= max) {
            sum += Math.pow(i, 2);
            ++i;
        }
        return sum;
    }
    public double sumReciprocals(int max) {
        double sum = 0.0;
        for (int i = 1; i <= max; ++i) {
            sum += 1.0/i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Loops loop = new Loops();
        loop.multiplesOfSeven();
        System.out.println("===========");
        Loops sumUpTo = new Loops();
        System.out.println(sumUpTo.sumUpTo(-4));
        System.out.println("===========");
        Loops sumBetween = new Loops();
        System.out.println(sumBetween.sumBetween(12, 12));
        System.out.println("===========");
        Loops sumSquares = new Loops();
        System.out.println(sumSquares.sumSquares(10));
        System.out.println("===========");
        Loops sumReciprocals = new Loops();
        System.out.println(sumReciprocals.sumReciprocals(5));
    }
}