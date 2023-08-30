public class TestDie {
    public static void main(String[] args){
        Die d1 = new Die();
        System.out.println(d1.getFaceValue());
        Die d2 = new Die();
        d1.roll();
        System.out.println(d1.getFaceValue());
        d1.setFaceValue(99);
        System.out.println(d1.getFaceValue());
        System.out.println(d1 + "\n" + d2);
        int count2 = 0;
        int count1 = 1;
while (count1 <= 10)
{
count2 = 1;
while (count2 < 20)
{
System.out.println("Here");
count2++;
}
count1++;
}
        System.out.println(count2);
    }
}
