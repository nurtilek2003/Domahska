import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="A Icons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Dog dog1;
        Dog dog2 ;
        Dog dog3 ;
        Dog dog4 ;


        do {
            do {
                System.out.print("ittin atyn jaz:");
                String name =scanner.nextLine();
                System.out.print("ittin color jaz:");
                String color =scanner.nextLine();
                System.out.print("ittin age jaz:");
                int age =scanner1.nextInt();
                dog1=new Dog();
                dog1.name=name;
                dog1.age=age;
                dog1.color=color;
                System.out.println();

            }while (false);
            do {
                System.out.print("ittin atyn jaz:");
                String name =scanner.nextLine();
                System.out.print("ittin color jaz:");
                String color =scanner.nextLine();
                System.out.print("ittin age jaz:");
                int age =scanner1.nextInt();
                dog2=new Dog(name,color,age);
                System.out.println();
            }while (false);
            do {
                System.out.print("ittin atyn jaz:");
                String name =scanner.nextLine();
                System.out.print("ittin color jaz:");
                String color =scanner.nextLine();
                System.out.print("ittin age jaz:");
                int age =scanner1.nextInt();
                dog3=new Dog(age,name,color);
                System.out.println();
            }while (false);
            do {
                System.out.print("ittin atyn jaz:");
                String name =scanner.nextLine();
                System.out.print("ittin color jaz:");
                String color =scanner.nextLine();
                System.out.print("ittin age jaz:");
                int age =scanner1.nextInt();
                dog4=new Dog(name,age,color);
                System.out.println();
            }while (false);
            System.out.println(dog1);
            System.out.println(dog2);
            System.out.println(dog3);
            System.out.println(dog4);

        }while (false);
        }

    }


