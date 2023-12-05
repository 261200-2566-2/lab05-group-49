public class Shoes implements Accessories{
    protected String name;
    protected String className;
    protected double defense, s;

    Shoes(String name, double s){
        this.name = name;
        className = "Shoes";
        this.s = s;
    }
    @Override
    public void upState() {
        defense += s;
    }

    public double getDefenseShoes() {
        upState();
        return defense;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public String getName() {
        return name;
    }
}