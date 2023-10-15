public class Model {
    int id;
    String name;
    String category;
    double price;

    public Model(int id, String name, String category, double price){
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public Double getPrice(){
        return price;
    }
}