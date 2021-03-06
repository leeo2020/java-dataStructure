package com.lx.queue;

public class QueueArray {

	private int arr[];
	private int maxSize;
	private int front;
	private int rear;

	public QueueArray(int maxSize) {
		this.maxSize = maxSize;
		this.arr = new int[this.maxSize];
		this.front = -1;
		this.rear = -1;
	}

	public boolean isEmpty() {
		return rear == front;
	}

	public boolean isFull() {
		return rear == maxSize - 1;
	}

	public int size() {
		return rear - front + 1;
	}

	public void add(int n) throws Throwable {

		if (isFull()) {
			System.out.print("queue is full");
			throw new RuntimeException("queue is full!");
		}
		arr[++rear] = n;
	}

	public int get() throws Throwable {
		if (isEmpty()) {
			System.out.print("queue is empty");
			throw new RuntimeException("queue is empty!");
		}
		return arr[++front];

	}

	public void show() throws Throwable {
		if (isEmpty()) {
			System.out.print("queue is empty");
			throw new RuntimeException("queue is empty!");
		}
		for (int i : arr) {
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
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
