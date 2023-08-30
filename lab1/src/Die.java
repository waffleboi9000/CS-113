public class Die {
    public int faceValue;

    //default constructor
    public Die(){
        // initializing variable faceValue
        faceValue = (int) (Math.random() * 6) + 1;
    }
    //non-default constructor
    public Die(int face){
        faceValue = face;
    }

    public void roll(){
        faceValue = (int) (Math.random() * 6) + 1;
    }
    //getter method
    public int getFaceValue(){
        return faceValue;
    }
    //setter method

    public void setFaceValue(int newFace){
        faceValue = newFace;
    }

    //toString method
    public String toString(){
        return "Die with face " + faceValue;
    }
}
