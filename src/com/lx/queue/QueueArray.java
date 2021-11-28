package com.lx.queue;

import java.util.Scanner;

public class QueueArray {
	int arr[];
	int maxSize;
	int front;
	int rear;

	public QueueArray(int maxSize) {
		this.maxSize = maxSize;
		this.arr = new int[maxSize];
		this.front = -1;
		this.rear = arr[maxSize - 1];
	}
	
	boolean isEmpty(){
		return rear==front;
	}
	boolean isFull(){
		return rear==front;
	}
	void add() throws Throwable {
		
		if(isFull()) {
			throw new Exception("queue is full!");
		}
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
	}

}
