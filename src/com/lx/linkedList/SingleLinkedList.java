package com.lx.linkedList;

public class SingleLinkedList {
	private HeroNode head = new HeroNode();

	public SingleLinkedList() {
		super();
	}

	public HeroNode get(int p) {
		HeroNode temp = head;
		while (temp != null) {
			if (temp.no == p) {
				break;
			}
			temp = temp.next;
		}
		return temp;
	}

	public void add(HeroNode h) {
		HeroNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = h;
	}

	public void delete(HeroNode h) {
		HeroNode temp = head;
		if(head.no!=h.no) {
			while (temp.next != null) {
				if (temp.next.no == h.no) {
					temp.next = temp.next.next;
					break;
				}
				temp = temp.next;
			}
		}else {
			head=head.next;
		}
		
	}

	public void killNull() {
		HeroNode temp = head;
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

	public void insert(HeroNode h, int p) {
		HeroNode temp = head;
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
		HeroNode temp = head;
		HeroNode tail = null;
		temp.next = tail;
		while (temp != null) {
			temp.next = tail;
			insert(temp, temp.no);
			temp = temp.next;

		}
	}

	public int size() {
		HeroNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void showAll() {
		HeroNode temp = head;
		while (temp != null) {
			System.out.println(temp.no + ":" + temp.name + temp.nickName);
			temp = temp.next;
		}
	}

}

class HeroNode {
	int no;
	String name;
	String nickName;
	HeroNode next;

	public HeroNode() {
		super();
	}

	@Override
	public String toString() {
		return "HeroNode [no=" + no + ", name=" + name!=null?name:"" + ", nickName=" + nickName!=null?nickName:"" + "]";
	}

	public HeroNode(int no, String name, String nickName) {
		super();
		this.no = no;
		this.name = name;
		this.nickName = nickName;
	}

	public HeroNode(int no, String name, String nickName, HeroNode next) {
		super();
		this.no = no;
		this.name = name;
		this.nickName = nickName;
		this.next = next;
	}

}