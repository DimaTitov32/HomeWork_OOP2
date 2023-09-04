import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("Шарик",2));
        dogs.add(new Dog("Бобик",3));
        dogs.add(new Dog("Того",5));
        dogs.add(new Dog("Лето",1));
        dogs.add(new Dog("Альфа", 8));

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println();

//      Cортировка по ГОДУ с использованием java.util.Comparator внутри класса Main
        Comparator<Dog> ageComparator = Comparator.comparingInt(dog -> dog.getAge());
        Collections.sort(dogs, ageComparator);
        System.out.println("Отсортированный по ГОДУ спискок:");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

//      Cортировка по ИМЕНИ с использованием java.util.Comparator внутри класса Main
        Comparator<Dog> nameComporator = Comparator.comparing(dog -> dog.getName());
        Collections.sort(dogs, nameComporator);
        System.out.println("Отсортированный по ИМЕНИ спискок:");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println();

        //Cортировка по ГОДУ в обратном порядке с использованием java.util.Comparator в классе SortByAge
        Collections.sort(dogs, new SortByAge());
        System.out.println("Cортировка по ГОДУ в обратном порядке");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println();
        //Сортировка по ИМЕНИ в обратном порядке с использованием java.util.Comparator в классе SortByAge
        Collections.sort(dogs,new SortByName().reversed());
        System.out.println("Сортировка по ИМЕНИ в обратном порядке");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println();





//        Owner owner = new Owner("Дима", 30);
//        Bird bird = new Bird("Чижик", 2);
//        Cat cat = new Cat("Барсик",3);
//        Dog dog = new Dog("Шарик", 5);

//        bird.displayInfo();
//        bird.greet();
//        bird.voice();
//        bird.sleep();
//        bird.play();
//
//        System.out.println();
//
//        cat.displayInfo();
//        cat.greet();
//        cat.voice();
//        cat.sleep();
//        cat.play();
//
//        System.out.println();
//
//        dog.displayInfo();
//        dog.greet();
//        dog.voice();
//        dog.sleep();
//        dog.play();
//
//        System.out.println();
//
//
//        owner.displayInfo();
//        owner.greet();
//        owner.voice();
//        owner.play();
//        owner.sleep();


    }
}
