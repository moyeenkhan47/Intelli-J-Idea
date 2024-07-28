import java.util.function.Predicate;

public class PredicateExm {
    public static void main(String[] args) {
        Predicate<Integer> p1=(num)->num>30;
        boolean a=p1.test(35);
        System.out.println(a);
    }
}
