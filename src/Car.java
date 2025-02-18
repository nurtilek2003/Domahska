public class Car {
    String model;
    String name;
    int obem;
    int price;
    public Car(String model,String name){
        this.model=model;
        this.name=name;

    }
    public Car(int obem,int price){
        this.obem=obem;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", obem='" + obem + '\'' +
                ", price=" + price +
                '}';
    }
}
