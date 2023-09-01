public class Pet extends Owner implements Greetings,Playing,ShowInfo,Sleeping,SoundMaker {
    private  String name;
    private  int age;

    public Pet(String name, int age) {
        super(name, age);
        this.age = age;
        this.name = name;

    }


    @Override
    public void greet() {
        System.out.println("Приветствие");
    }

    @Override
    public void play() {
        System.out.println("The pet playing");
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    @Override
    public void sleep() {
        System.out.println("Спит");
    }

    @Override
    public void voice() {
        System.out.println("Голос");
    }
}
