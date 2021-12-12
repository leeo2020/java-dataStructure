package com.lx.queue;

public class CircleQueueArray {
	private int arr[];
	private int maxSize;
	private int front;
	private int rear;

	public CircleQueueArray(int maxSize) {
		this.maxSize = maxSize;
		this.arr = new int[this.maxSize];
		this.front = 0;// 默认也是0
		this.rear = 0;// 默认也是0
	}

	public boolean isEmpty() {
		return rear == front;
	}

	public boolean isFull() {
		return (rear + 1) % maxSize == front;
	}

	public int size() {
		return (rear - front + maxSize) % maxSize;
	}

	public void add(int n) throws Throwable {

		if (isFull()) {
			System.out.print("queue is full");
			throw new RuntimeException("queue is full!");
		}
		arr[(rear++) % maxSize] = n;
	}

	public int get() throws Throwable {
		if (isEmpty()) {
			System.out.print("queue is empty");
			throw new RuntimeException("queue is empty!");
		}
		return arr[(front++) % maxSize];
	}

	public void show() throws Throwable {
		if (isEmpty()) {
			System.out.print("queue is empty");
			throw new RuntimeException("queue is empty!");
		}
//		for (int i : arr) {
//			System.out.printf("arr[%d]=%d\n", i, arr[i]);
//		}
		for (int i = front; i < front + size(); i++) {
			System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
		}
	}

	public void del() throws Throwable {
		if (isEmpty()) {
			System.out.print("queue is empty");
			throw new RuntimeException("queue is empty!");
		}
		front++;
	}
}
