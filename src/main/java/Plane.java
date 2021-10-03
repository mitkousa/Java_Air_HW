public enum Plane {
    BOEING747(80, 42000);
    private int capacity;
    private int totalWeight;

    Plane(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }
}
