public class Ring implements Accessories{
    protected String name;
    protected String className;
    protected double damage, d;

    Ring(String name, double d){
        this.name = name;
        className = "Ring";
        this.d = d;
    }

    @Override
    public void upState() {
        damage = d*2;
    }

    public double getDamageRing() { return damage; }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public String getName() {
        return name;
    }
}
