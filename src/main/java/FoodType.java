public enum FoodType {
    SANDWICH(50),
    PASTA(60),
    NOODLES(70),
    COKE(30);

    private final float price;

    FoodType(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
