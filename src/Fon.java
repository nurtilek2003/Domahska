public class Fon {
    String model;
    int money;
    String camera;
    public Fon(String model,String camera){
        this.model=model;
        this.camera=camera;
    }
    public Fon(int money){
        this.money=money;
    }

    @Override
    public String toString() {
        return "Fon{" +
                "model='" + model + '\'' +
                ", money=" + money +
                ", camera='" + camera + '\'' +
                '}';
    }
}
