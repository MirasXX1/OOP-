package lab3.services;

public class Sort {
    // Элементтердің орнын ауыстыру
    public static <T> void swap(T[] massive, int a, int b) {
        T komekshi = massive[a];
        massive[a] = massive[b];
        massive[b] = komekshi;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] mass) {
        int n = mass.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (mass[j].compareTo(mass[j+1]) > 0) {
                    swap(mass, j, j+1);
                }
            }
        }
    }
}