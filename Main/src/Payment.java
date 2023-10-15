public class Payment {
    int id;
    Order order;
    double amount;

    public Payment(int id, Order order, double amount){
        this.id = id;
        this.order = order;
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}