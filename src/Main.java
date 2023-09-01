public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Дима", 30);
        Bird bird = new Bird("Чижик", 2);
        Cat cat = new Cat("Барсик",3);
        Dog dog = new Dog("Шарик", 5);

        bird.displayInfo();
        bird.greet();
        bird.voice();
        bird.sleep();
        bird.play();

        System.out.println();

        cat.displayInfo();
        cat.greet();
        cat.voice();
        cat.sleep();
        cat.play();

        System.out.println();

        dog.displayInfo();
        dog.greet();
        dog.voice();
        dog.sleep();
        dog.play();

        System.out.println();


        owner.displayInfo();
        owner.greet();
        owner.voice();
        owner.play();
        owner.sleep();


    }
}
