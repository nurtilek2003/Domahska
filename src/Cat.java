public class Cat {
    String name;
    String color;
    int age;
    public Cat(String name, String color){
        this.color=color;
        this.name=name;
    }
    public Cat(int age){ this.age=age;}







    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

