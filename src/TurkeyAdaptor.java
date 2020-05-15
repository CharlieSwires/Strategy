
public class TurkeyAdaptor extends Duck implements QuackBehaviour, FlyBehaviour{

    Turkey turkey;
    public TurkeyAdaptor(Turkey turkey) {
        super();
        this.turkey = turkey;
        super.setFlyBehaviour(this);
        super.setQuackBehaviour(this);
    }
    public String display() {
        System.out.println(turkey.display());
        return turkey.display();
    }
    @Override
    public String fly() {
        System.out.println(turkey.fly());
        return turkey.fly();
    }
    @Override
    public String quack() {
        System.out.println(turkey.gobble());
        return turkey.gobble();
    }
}
