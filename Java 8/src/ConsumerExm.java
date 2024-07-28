import java.util.function.Consumer;

public class ConsumerExm {
    public static void main(String[] args) {
        Consumer<Integer> c1=(a)-> System.out.println(a);
        c1.accept(20);
    }
}
