import java.util.ArrayList;
import java.util.List;

public class Order {

    int id;
    Customer customer;
    List<Model> models;

    public Order(int id, Customer customer){
        this.id = id;
        this.customer = customer;
        this.models = new ArrayList<>();
    }

    public void addModel(Model model){
        models.add(model);
    }

    public List<Model> getModels(){
        return models;
    }

    public int getId() {
        return id;
    }
}