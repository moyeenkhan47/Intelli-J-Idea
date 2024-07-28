public interface Hello {
    void test();


    class Main {
        public static void main(String[] args) {
            Hello hlo = () -> System.out.println("i am in test method");
            hlo.test();
        }
    }
}
