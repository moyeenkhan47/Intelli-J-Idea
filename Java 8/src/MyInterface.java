public interface MyInterface {
    void show();
}
class Test implements MyInterface{


    @Override
    public void show() {

            System.out.println("I am in show method");

    }
}
class Main{

    public static void main(String[] args) {
        Test t=new Test();
        t.show();
    }
}
