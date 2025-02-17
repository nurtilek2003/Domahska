public class Dog {
    String name;
    String color;
    int age;

    public Dog() {

    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Dog(int age, String name, String color) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

}