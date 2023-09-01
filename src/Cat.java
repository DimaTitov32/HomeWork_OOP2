public class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice(){
        System.out.println(super.getName() + "Голос: Мяу-мяу");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

    }

    @Override
    public void sleep(){
        System.out.println(super.getName()+ " " + "спит ZzZ-ZzZ");
    }

    public void play(){
        System.out.println(super.getName()+ " " + "играет тыгыдык-тыгыдык");
    }


    public void greet(){
        System.out.println("Привет! Меня зовут " + super.getName());
    }
}
