
interface inter1{
    public void func1();
    public void func2();
}

class der implements inter1{
    @Override
    public void func1() {
        System.out.println("this is an function");
    }

    @Override
    public void func2() {
        System.out.println("This is an a function two");
    }
}



public class interface_multiple {
    public static void main(String[] args) {
        der d3 = new der();
        d3.func1();
        d3.func2();
    }
}
