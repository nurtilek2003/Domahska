public class Dog {
    String name;
    String color;
    int age;
 public Dog(String name,String color){
     this.name=name;
     this.color=color;

 }
 public Dog(int age){
     this.age=age;
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