import java.util.function.Function;

public class FunctionExm {
    public static void main(String[] args) {
        Function<Integer,Integer> f1=(num)->num*5;
        System.out.println(f1.apply(40));
    }
}
