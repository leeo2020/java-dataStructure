package com.lx.linkedList;

public class CircleLinkedList {
	private Boy first=new Boy(0);
	
	public void addBoy(int num) {
		if(num<1) {
			System.out.println("入参不正确");
		}else {
			Boy curBoy=null;
			for(int i=1;i<=num;i++) {
				Boy boy=new Boy(i);
				if(i==1) {
					curBoy=boy;
					first.setNext(boy);
					curBoy.setNext(first);
					
				}else {
					curBoy.setNext(boy);
					boy.setNext(first);
					curBoy=boy;
				}
			}
		}
	}
	public void show() {
		Boy b=first;
		if(b==null) {
			System.out.println("链表为空");
		}else {
			while(b!=null) {
				System.out.println(b.getNo());
				if((b=b.getNext())==first) {
					break;
				}
			}
		}
	}
}

class Boy{
	private int no;
	private Boy next;
	
	public Boy(int no) {
		super();
		this.no= no;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Boy getNext() {
		return next;
	}
	public void setNext(Boy next) {
		this.next = next;
	}
	
}