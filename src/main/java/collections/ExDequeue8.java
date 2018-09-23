package collections;

import java.util.*;

//Для любого числа потоков.Максим Хлыстов
public class ExDequeue8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numQueries = 2;
        List<Deque<Integer>> workers = new ArrayList<Deque<Integer>>(numQueries);
        int workerLoad[] = new int[numQueries];
        for(int i=0; i<numQueries; ++i){
            workers.add(new ArrayDeque<>());
            workerLoad[i] = 0;
        }
        int numTasks = sc.nextInt();
        for(int i=0; i<numTasks; ++i) {
            int taskId = sc.nextInt();
            int taskLoad = sc.nextInt();
            int worker = arrayMin(workerLoad);
            if(worker == -1)
                worker = 0;
            workerLoad[worker] += taskLoad;
            workers.get(worker).offerLast(taskId);
        }
        for(int i=0; i<numQueries; ++i){
            Deque<Integer> worker = workers.get(i);
            for(int val : worker) {
                System.out.print(val);
                System.out.print(" ");
            }
            if(worker.size() > 0)
                System.out.println("");
        }
    }

    public static int arrayMin(int[] arr1) {
        int min = Integer.MAX_VALUE;
        int idx = -1;
        if (arr1 != null) {
            int arrLen = arr1.length;
            for(int i=0; i<arrLen; ++i) {
                if (arr1[i] < min) {
                    min = arr1[i];
                    idx = i;
                }
            }
        }
        return idx;
    }
}
