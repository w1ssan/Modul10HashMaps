package BookExercises;

import BookExamples.MyMap;

/**
 * (Implement MyMap using open addressing with linear probing) Create a new concrete
 * class that implements MyMap using open addressing with linear probing.
 * For simplicity, use f(key) = key % size as the hash function, where size is
 * the hash-table size. Initially, the hash-table size is 6. The table size is doubled
 * whenever the load factor exceeds the threshold (0.5).
 */
public class Exercise27_1 {
    public static void main(String[] args) {
        LinearProbingMap<Integer, Integer> map = new LinearProbingMap<>();
        map.put(16, 1);
        map.put(19, 2);
        map.put(20, 3);
        map.put(23, 4);
        printTable(map.table);
    }

    public static void printTable(MyMap.Entry<Integer, Integer>[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println(i + ": " + table[i]);
        }
    }
}
