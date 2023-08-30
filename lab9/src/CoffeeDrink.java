public class CoffeeDrink {
    private final Ingredient coffee;
    private final Ingredient milk;
    public CoffeeDrink(Ingredient i1, Ingredient i2)
    {
        this.coffee=i1;
        this.milk=i2;
    }
    public Ingredient getIngred1(){return coffee;}
    public Ingredient getIngred2(){return milk;}
    // compares two drinks based on their milk/coffee ratio.
    //drink 1 is stronger than drink 2 if that ratio is smaller than
    // the corresponding ratio of drink 2
    public int compareTo(CoffeeDrink other){
        if ((double)milk.getStrength()/coffee.getStrength() > (double)
            other.getIngred2().getStrength()/other.getIngred1().getStrength())
            return 1;
        else if ((double)milk.getStrength()/coffee.getStrength() < (double)
            other.getIngred2().getStrength()/other.getIngred1().getStrength())
            return -1;
        else
            return 0;
    }
    public String toString(){
        return coffee.toString()+"\n"+milk.toString();
    }
}
