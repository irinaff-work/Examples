package tasks;

public class ArraySort {

    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("сортируем");
        //sortedArray(array1);
        sortArrayBubble1(array1);

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    /**
     * Сортировка выбором (Selection sort)
     */
    static void sortedArray(int[] arg) {
        int tmp;
        /*По очереди будем просматривать все подмножества
          элементов массива (0 - последний, 1-последний,
          2-последний,...)*/
        for (int i = 0; i < arg.length; i++) {
            /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arg[i];
            int min_i = i;
            /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < arg.length; j++) {
                //Если находим, запоминаем его индекс
                if (min > arg[j]) {
                    min = arg[j];
                    min_i = j;
                }
            }
            /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                tmp = arg[i];
                arg[i] = arg[min_i];
                arg[min_i] = tmp;
            }
        }

    }
    //Сортировка пузырьком (Bubble sort)

    /**
     * Алгоритм проходит массив от начала и до конца, сравнивая попарно соседние элементы,
     * Если элементы стоят в неправильном порядке, то они меняются местами, таким образом,
     * после первого прохода на конце массива оказывается максимальный элемент (для сортировки по возрастанию).
     * Затем проход массива повторяется, и на предпоследнем месте оказывается другой наибольший после
     * максимального элемент и т.д. В итоге, наименьший элемент постепенно перемещается
     * к началу массива («всплывает» до нужной позиции как пузырёк в воде).
     */

    //реализация алгоритма Сортировка пузырьком на Java (по возрастанию):
    public static void sortArrayBubble1(int[] arr) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    //реализация алгоритма Сортировка пузырьком на Java (по убыванию):
    static void sortArrayBubble12(int[] arg) {
        for (int i = 0; i < arg.length - 1; i++) {

            for (int j = arg.length - 1; j > i; j--) {
                if (arg[j - 1] > arg[j]) {
                    int tmp = arg[j - 1];
                    arg[j - 1] = arg[j];
                    arg[j] = tmp;
                }
            }
        }
    }
}
