public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        MenuItem food = new Food("Nasi Goreng", 25000, "Main Course");
        MenuItem drink = new Drink("Es Latte", 20000, "Large", true);

        order.addItem(food);
        order.addItem(drink);

        order.showOrder();
    }
}