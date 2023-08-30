public class MonetaryCoin extends Coin{
    private int value;
    // I know that the 'intention' of the assignment was to make a default random value, which would be in the default
    // constructor, but I thought it makes more sense to specify that it should be a random value and accept a parameter
    // for setting the value by default instead.
    public MonetaryCoin(int face, int value){
        super();
        setValue(value);
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >=1 && value <=100) {
            this.value = value;
        }
        else
            System.out.println("Try a different value, between 1 and 100.");
    }
    public String toString() {
        return "Face: " + super.toString() + "Value: " + value;
    }
}
