package com.gpcoder.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        // Với hàng đợi (queue) PriorityQueue phần tử sẽ được sắp xếp vị trí
        // theo trật tự tự nhiên của chúng.
        Queue<Integer> names = new PriorityQueue<Integer>();

        // offer(E): Thêm phần tử vào hàng đợi (queue).
        // Trả về true nếu thêm thành công.
        // Trả về false nếu hàng đợi không còn chỗ.
        names.offer(4);
        names.offer(1);
        names.offer(2);

        // add(E): Thêm một phần tử vào hàng đợi (queue).
        // Trả về true nếu thành công.
        // Ném ra một Exception nếu hàng đợi đã đầy.
        names.offer(5);
        names.offer(3);
        names.offer(7);
        names.offer(6);

//        while (true) {
//            // poll(): Lấy ra và loại bỏ phần tử đầu tiên ra khỏi hàng đợi.
//            // Trả về null nếu không còn phần tử nào trong hàng đợi.
//            Integer name = names.poll();
//            if (name == null) {
//                break;
//            }
//            System.out.println("Name=" + name);
//        }
//        Integer e = names.poll();
//        e = names.poll();


         {
            System.out.println(names);
        }

    }
}