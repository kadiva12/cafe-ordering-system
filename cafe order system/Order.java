import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void showOrder() {
        double subtotal = 0;
        double totalDiscount = 0;

        System.out.println("===== DETAIL PESANAN =====");

        for (MenuItem item : items) {
            item.displayDetails();
            subtotal += item.calculatePrice();

            if (item instanceof Discountable) {
                Discountable discountedItem = (Discountable) item;
                totalDiscount += discountedItem.calculateDiscount();
            }
        }

        System.out.println("--------------------------");
        System.out.println("Subtotal : Rp" + String.format("%.0f", subtotal));
        System.out.println("Diskon   : Rp" + String.format("%.0f", totalDiscount));
        System.out.println("Total    : Rp" + String.format("%.0f", subtotal - totalDiscount));
    }
}
