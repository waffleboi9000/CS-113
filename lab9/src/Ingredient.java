public class Ingredient {private final String name;
private final int strength;
public Ingredient(String name, int strength)
{
    this.name=name; this.strength=strength;
}
public int getStrength(){return strength;}
public String toString(){return name+" strength: "+strength;}
}
