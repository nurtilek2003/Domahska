public class Laptop {
    String model;
    int age;
    public Laptop(String model){
        this.model=model;
    }
    public Laptop(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", age=" + age +
                '}';
    }
}
