package concarent_collections.lambda_1;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 23.03.2019
 **/

@FunctionalInterface
public interface Converter<T extends Number, R> {
    R convert(T num);
}
