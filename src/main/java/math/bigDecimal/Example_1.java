package math.bigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Класс java.math.BigDecimal предпочтительнее для работы
 * с финансами вместо double, так как более гибок в настройках
 * При работе с большими числами нельзя использовать привычные
 математические операции с помощью + или * и т.п.
 Вместо них следует использовать специальные методы
 add(), multiply(), subtract(), divide(), mod()

 Не используйте для сравнения метод equals(), потому что метод
 будет сравнивать масштабы. Если масштабы различаются.
 Вместо этого следует использовать методы compareTo() и signum()

 Чтобы задать количество цифр после запятой, используйте метод  setScale().
 Хорошей практикой является одновременное указание
 вместе с масштабом режима округления с помощью  setScale(scale, roundingMode).
 Режим округления задаёт правило округления числа.

 Есть восемь вариантов режима округления, которые задаются константами:
 ROUND_CEILING: В большую сторону
 ROUND_DOWN: Отбрасывание разряда
 ROUND_FLOOR: В меньшую сторону
 ROUND_HALF_UP: Округление вверх, если число после запятой >= .5
 ROUND_HALF_DOWN: Округление вверх, если число после запятой > .5
 ROUND_HALF_EVEN: Округление половины по чётности округляет как обычно.
 Однако, когда округляемая цифра 5, округление будет идти вниз,
 если цифра слева от 5 чётная и вверх, если нечётная.
 ROUND_UNNECESSARY: Используйте ROUND_UNNECESSARY когда необходимо
 использовать один из методов, который требует ввода режима округления,
 но известно, что результат округлять не надо.

 При делении будьте осторожны и указывайте способ округления в методе divide().
 В противном случае можно получить ArithmeticException.
 */
public class Example_1 {
    public static void main(String[] args)  {
        BigInteger bigIntegerA = BigInteger.valueOf(42);
        BigInteger bigIntegerB = bigIntegerA.add(bigIntegerA);
        BigInteger bigIntegerC = bigIntegerA.multiply(bigIntegerB);

        BigDecimal bigDecimalA = new BigDecimal(1.5);
        BigDecimal bigDecimalB = BigDecimal.valueOf(1.5);
        BigDecimal bigDecimalC = new BigDecimal("1.5");

        bigDecimalA.setScale(2);
    }
}
