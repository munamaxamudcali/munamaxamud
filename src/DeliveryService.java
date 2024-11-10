import java.util.Stack;

public class DeliveryService {
    private Stack<String> deliveryStops;

    public DeliveryService(){
        deliveryStops = new Stack<>();
    }
    public void pickUpOrder(String address) {
        deliveryStops.push(address);
        System.out.println("Picked up order for: " + address);
    }


    public void deliverOrders() {
        while (!deliveryStops.isEmpty()) {
            String nextStop = deliveryStops.pop();
            System.out.println("Delivering to: " + nextStop);
        }
        System.out.println("All orders delivered!");
    }

    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();

        deliveryService.pickUpOrder("123 Main St");
        deliveryService.pickUpOrder("456 Oak St");
        deliveryService.pickUpOrder("789 Maple Ave");

        System.out.println("Starting deliveries...");
        deliveryService.deliverOrders();
}
 }


