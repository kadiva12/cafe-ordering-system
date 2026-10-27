public class Food extends MenuItem implements Discountable {
    private String category;

    public Food(String name, double price, String category) {
        super(name, price);
        this.category = category;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public double calculateDiscount() {
        return calculatePrice() * 0.05;
    }

    @Override
    public void displayDetails() {
        System.out.println("[Food] " + name + " (" + category + ") - Rp"
                + String.format("%.0f", calculatePrice()));
    }
}
