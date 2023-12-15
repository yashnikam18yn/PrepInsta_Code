
class Base1{
    Base1(){
        System.out.println("BAse1 class constructor");
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("This is an Derived1 class constructor");
    }
}

class Derived2 extends Derived1{
    Derived2(){
        System.out.println("this is last class constructor");
    }
}
public class multilevel {
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
    }
}
