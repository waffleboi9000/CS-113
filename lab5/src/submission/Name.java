public class Name {
    public String first;
    public String middle;
    public String last;
    public String getFirst(){
        return first;
    }
    public String getMiddle(){
        return middle;
    }
    public String getLast(){
        return last;
    }
    public String firstmiddlelast(){
        return first + " " +  middle + " " + last;
    }
    public boolean equals(Name Name, Name otherName){
        if (otherName.firstmiddlelast() == Name.firstmiddlelast())
            return true;
        else
            return false;
    }
}
