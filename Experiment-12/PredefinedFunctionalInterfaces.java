import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class PredefinedFunctionalInterfaces {
    public static void main(String[] args) {
        Consumer<String> c = name -> System.out.println(name);
        c.accept("Hello Java");

        Predicate<Integer> p = n -> n > 10;
        System.out.println(p.test(15));

        Function<Integer, Integer> f = n -> n * n;
        System.out.println(f.apply(5));

        Supplier<String> s = () -> "Hello World";
        System.out.println(s.get());
    }
}
