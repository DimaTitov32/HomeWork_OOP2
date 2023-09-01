public class Owner implements Greetings,Playing,ShowInfo,Sleeping,SoundMaker{
    private  String name;
    private  int age;

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public void greet() {
        System.out.println(name + " " +  "Приветствует!");
    }

    @Override
    public void play() {
        System.out.println(name + " " + "Изучает Java");
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " " + "наизучал и уснул");
    }

    @Override
    public void voice() {
        System.out.println(this.name + " " + "Говорит изучать ООП не просто, но интересно!");
    }
}
