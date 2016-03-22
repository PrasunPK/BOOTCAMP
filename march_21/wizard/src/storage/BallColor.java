package storage;

public enum BallColor {
    RED(5), BLUE(12), GREEN(3);

    private int maxAmount;

    BallColor(int maxAmount) {
        this.maxAmount = maxAmount;
    }


    public boolean isFull(int currentAmount) {
//        System.out.println(currentAmount);
        return currentAmount > maxAmount;
    }
}
