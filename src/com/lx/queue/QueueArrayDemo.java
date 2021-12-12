package com.lx.queue;

import java.util.Scanner;

public class QueueArrayDemo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		QueueArray q = new QueueArray(5);
		boolean b = true;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		tip();
		while (b) {
			char c = sc.next().charAt(0);
			switch (c) {
			case 'g':
				System.out.println(q.get());
				break;
			case 'a':
				System.out.println("please input a num");
				q.add(sc.nextInt());
				tip();
				break;
			case 's':
				q.show();
				tip();
				break;
			case 'd':
				q.del();
				tip();
				break;
			case 'e':
				b = false;
				break;
			default:
				tip();
				break;
			}
		}
	}
	
	public static void tip(){
		System.out.println("please input one of g/a/s/d/e");
	}

}
