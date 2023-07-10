package bai_tap.bai_tap2;

import java.time.LocalTime;

public class StopWatchObj {

    public static void main(String[] args) {
        //random các phần tử trong mảng
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }


        LocalTime start = LocalTime.now();// khai báo biến và gán giá trị
        selectionSort(arr); //--> gọi phương thức sắp xếp mảng
        LocalTime end = LocalTime.now();// khai báo biến và gán giá trị

        StopWatch sw = new StopWatch(start, end);//--> khai báo đối tượng với các đối số tương ứng
        System.out.println("Time: " + sw.getElapsedTime() + " ms");//--> gọi phương thức của đối tượng
        System.out.println("Start time: " + sw.getStartTime());
        System.out.println("End time: " + sw.getEndTime());
//        for (int x : result) {
//            System.out.println(x);
//        }
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
//        return a;
    }
}
