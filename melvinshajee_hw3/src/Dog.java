public class Dog {
    public String name;
    public double weight;
    // default constructor
    public Dog(){
        name = "dog";
        weight = 0;
    }
    // getter
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    // setter
    public void setName(String newName){
        name = newName;
    }
    public void setWeight(double newWeight){
        weight = newWeight;
    }
    // computes and returns the weight in kg
    public double toKgs(){
        return weight*0.453592;
    }
    //toString method
    public String toString(){
        return "Dog with name " + name + " and weight " + weight;
    }
}
