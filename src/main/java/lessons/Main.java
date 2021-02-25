package lessons;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Собака", "Зелёный", 2);
        Cat cat2 = new Cat("Вася Пупкин", "Бурый");
        Cat cat3 = new Cat("Кошка");

//        cat1.age = -1;
        cat1.incAge();
        cat2.setAge(10);
        cat2.setAge(-5);





        cat3.color = "yellow";



        cat1.printInfo();
        cat2.printInfo();
        cat3.printInfo();

        cat1.run();
        cat2.run();

//        cat2 = null;


//        Cat[] cats = new Cat[3];

        Cat[] cats = {cat1, cat2, cat3};
        for (Cat cat : cats) {
            cat.printInfo();
        }

    }
}
