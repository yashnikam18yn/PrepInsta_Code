
class base{
    base(){
        System.out.println("This is an a first class constructor");
    }
}
public class frist_class {
    public static void main(String[] args) {
        base b1 = new base();
        derived d1 = new derived();
    }
}
