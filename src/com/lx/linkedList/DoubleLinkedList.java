package com.lx.linkedList;

public class DoubleLinkedList {
	private dNode head = new dNode();

	public DoubleLinkedList() {
		super();
	}

	public dNode get(int p) {
		dNode temp = head;
		while (temp != null) {
			if (temp.no == p) {
				break;
			}
			temp = temp.next;
		}
		return temp;
	}

	public void add(dNode h) {
		dNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = h;
		h.pre=temp;
	}

	public void delete(dNode h) {
		dNode temp = head;
		if(temp.next==null) {
			System.out.println("链表为空");
			return;
		}
		if(head.no!=h.no) {
			while (temp.next != null) {
				if (temp.next.no == h.no) {
					temp.next=temp.next.next;
					if(temp.next.next!=null) {
						temp.next.next.pre = temp;
					}
					break;
				}
				temp = temp.next;
			}
		}else {
			head=head.next;
			head.next.pre=null;
		}
		
	}

	public void killNull() {
		dNode temp = head;
		while (temp.next != null) {
			if (temp.name == null) {
				if (head == temp) {
					head = temp = temp.next;
				}
				temp = temp.next;
				break;
			}
			temp = temp.next;
		}
	}

	public void insert(dNode h, int p) {
		dNode temp = head;
		if (p == 0) {
			h.next = head;
		} else if (p > size()) {
			add(h);
		} else {
			while (temp.next != null) {
				if (temp.next.no == p) {
					h.next = temp.next;
					temp.next = h;
					break;
				}
				temp = temp.next;
			}
		}
	}

	public void reverse() {
		dNode temp = head;
		dNode tail = null;
		temp.next = tail;
		while (temp != null) {
			temp.next = tail;
			insert(temp, temp.no);
			temp = temp.next;

		}
	}

	public int size() {
		dNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void showAll() {
		dNode temp = head;
		while (temp != null) {
			System.out.println(temp.no + ":" + temp.name + temp.nickName);
			temp = temp.next;
		}
	}

}

class dNode {
	int no;
	String name;
	String nickName;
	dNode next;
	dNode pre;

	public dNode() {
		super();
	}

	@Override
	public String toString() {
		return "dNode [no=" + no + ", name=" + (name!=null?name:"") + ", nickName=" + (nickName!=null?nickName:"") + "]";
	}

	public dNode(int no, String name, String nickName) {
		super();
		this.no = no;
		this.name = name;
		this.nickName = nickName;
	}

	public dNode(int no, String name, String nickName, dNode pre,dNode next) {
		super();
		this.no = no;
		this.name = name;
		this.nickName = nickName;
		this.pre = pre;
		this.next = next;
	}

}