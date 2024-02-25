public enum Plan {
    BASIC(200),
    MEDIUM(300),
    PREMIUM(400);
    private double price;

    Plan(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}

