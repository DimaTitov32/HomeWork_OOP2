public class Dog extends Pet{
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void voice(){
        System.out.println(super.getName() + "Голос: Гав-Гав");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

    }

    @Override
    public void sleep(){
        System.out.println(super.getName()+ " " + "спит ZzZ-ZzZ");
    }
    @Override
    public void play(){
        System.out.println(super.getName()+ " " + "играет (бегает за хвостом)");
    }

    @Override
    public void greet(){
        System.out.println("Привет! Меня зовут " + super.getName());
    }

}
