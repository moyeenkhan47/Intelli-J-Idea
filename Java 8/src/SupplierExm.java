import java.util.function.Supplier;

public class SupplierExm {
    public static void main(String[] args) {
        Supplier<Double> randomvalue=()-> Math.random();
        System.out.println(randomvalue.get());
    }
}
