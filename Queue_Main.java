import java.util.*;

import javax.management.RuntimeErrorException;

public class Queue_Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sr.nextInt();

        Queue queue = new Queue(n);

        // for (int i = 0; i < n; i++) {
        //     int num = sr.nextInt();
        //     queue.enqueue(num);
        // }
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue());
        System.out.println("peek = "+queue.peek());

        queue.enqueue(50);

        queue.printQueue();
    }
}

class Queue{
    
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int[] arr;

    public Queue(int n){ // instance method
        arr = new int[n];
    }

    public void enqueue(int data){
        if(!isFull()){
            rear = (rear + 1) % arr.length;
        arr[rear] = data;
        size++;
        } else{
            System.out.println("Queue is full");
        }
    }

    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }

        int temp = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return temp;
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty");
            }
            return arr[front];
    }

    public boolean isFull(){
        return size == arr.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void printQueue(){
        for (int i = front; i < size; i++) {
            System.out.print(arr[(i + 1) % arr.length] + " ");
        }
        System.out.println();
    }
}