
class Base{
    public void fun1(){
        System.out.println("This is an a base class function");
    }
}

class Derived extends Base{
    public void fun2(){
        System.out.println("This is an a derived class function");
    }
}
public class single {
    public static void main(String[] args) {
        Derived d1 = new Derived();
        d1.fun1();
        d1.fun2();
    }
}
