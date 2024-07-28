import java.util.function.*;

class House {
    public static void main(String[] args) {

        Predicate<Integer> p1 = (a) -> a > 20;

        Predicate<Integer> p2 = (a) -> a > 10;

        // Correct way to combine predicates using 'and'
        Predicate<Integer> p3 = p1.and(p2);

        System.out.println(p3.test(22)); // This will print true, as 22 > 20 and 22 > 10
    }
}
