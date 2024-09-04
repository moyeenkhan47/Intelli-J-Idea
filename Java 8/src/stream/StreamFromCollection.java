import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFromCollection {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","b","c");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }
}
