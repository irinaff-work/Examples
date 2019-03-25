package Lambda;

@FunctionalInterface
public interface Converter<T, F> {
    F convert (T from);
}
