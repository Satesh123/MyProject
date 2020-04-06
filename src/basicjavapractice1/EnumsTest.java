package basicjavapractice1;

class FreshJuice{
    enum FreshJuiceSize{Small, Medium, Large }
    FreshJuiceSize Size;

}
public class EnumsTest {

    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();
        juice.Size = FreshJuice.FreshJuiceSize.Medium;
        System.out.println("Size: " + juice.Size);
    }

}
