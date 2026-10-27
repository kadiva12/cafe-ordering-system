public class Drink extends MenuItem implements Discountable {
    private String size;
    private boolean iced;

    public Drink(String name, double price, String size, boolean iced) {
        super(name, price);
        this.size = size;
        this.iced = iced;
    }

    @Override
    public double calculatePrice() {
        if (size.equalsIgnoreCase("Large")) {
            return price + 5000;
        }
        return price;
    }

    @Override
    public double calculateDiscount() {
        if (iced) {
            return calculatePrice() * 0.10;
        }
        return 0;
    }

    @Override
    public void displayDetails() {
        String temperature = iced ? "Iced" : "Hot";
        System.out.println("[Drink] " + name + " (" + size + ", " + temperature
                + ") - Rp" + String.format("%.0f", calculatePrice()));
    }
}
