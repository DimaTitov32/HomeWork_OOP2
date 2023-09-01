public class Bird extends Pet{


    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice(){
        System.out.println(super.getName() + "Голос: чирик-чирик");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

    }

    @Override
    public void sleep(){
        System.out.println(super.getName()+ " " + "спит");
    }

    public void play(){
        System.out.println(super.getName()+ " " + "Летает-играет");
    }


    public void greet(){
        System.out.println("Привет! Меня зовут " + super.getName());
    }


}
