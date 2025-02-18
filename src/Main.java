import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="A Icons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("laika", "blak");  //////
        Dog dog1 = new Dog(5);
        System.out.println(dog.name + " " + dog.color + " " + dog1.age);

        System.out.println();
        Cat cat = new Cat(4);
        Cat cat1 = new Cat("Kisai", "blak");
        System.out.println(cat1.name + " " + cat1.color + " " + cat.age);

        System.out.println();

        Car car = new Car("BMB", "x5");
        Car car1 = new Car(3, 20000);
        System.out.println(car.model + " " + car.name + " " + car1.obem + " " + car1.price);

        System.out.println();
        School school = new School("Algebra", "Baiel");
        System.out.println(school.lesson + " " + school.student);


        System.out.println();
        Fon fon = new Fon("Aifon", "Ultra");
        Fon fon1 = new Fon(100000);
        System.out.println(fon.model + " " + fon.camera + " " + fon1.money);

        System.out.println();
        Laptop laptop=new Laptop("Windos");
        Laptop laptop1=new Laptop(12);
        System.out.println(laptop.model+" "+laptop1.age);

        System.out.println();
        Muzsik muzsik=new Muzsik("DO","max");
        System.out.println(muzsik.nota+" "+muzsik.sound);

        System.out.println();
        Ufc ufc=new Ufc("Junusbek","Sanjar");
        Ufc ufc1=new Ufc(5);
        System.out.println(ufc.fighters+" "+ufc.trainer+" "+ufc1.round);

        System.out.println();
        Fcb fcb=new Fcb("Elaman"," Barcalona");
        Fcb fcb1= new Fcb(43);
        System.out.println(fcb.ball+" "+fcb.football+" "+fcb1.age);

        System.out.println();
        Food food=new Food("ak cuu", "suu bashy","suluktu");
        System.out.println(food.ace+" "+food.marking+" "+food.potato);


    }
}