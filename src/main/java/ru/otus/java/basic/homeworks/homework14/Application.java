package ru.otus.java.basic.homeworks.homework14;

public class Application {
    public static void main(String[] args) {
        long start, end;
        double[] arr = new double[100_000_000];
        double[] arr1 = arr.clone();
        start = System.currentTimeMillis();
        calcArray(arr);
        end = System.currentTimeMillis();
        System.out.println("Последовательное выполнение  " + ((end - start)) + " millisecond");
        System.out.println("---------------------");
        start = System.currentTimeMillis();
        calcArrayThreads(arr1);
        end = System.currentTimeMillis();
        System.out.println("Параллельное выполнение  " + ((end - start)) + " millisecond");
    }

    public static void calcArray(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public static void calcArrayThreads(double[] arr) {
        int z = arr.length / 4;
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < z; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = z; i < z * 2; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = z * 2; i < z * 3; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = z * 3; i < z * 4; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
