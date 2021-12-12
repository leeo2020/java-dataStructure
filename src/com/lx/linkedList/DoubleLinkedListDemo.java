package com.lx.linkedList;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dNode h1=new dNode(1,"宋江","及时雨");
		dNode h2=new dNode(2,"卢俊义","玉麒麟");
		dNode h3=new dNode(3,"吴用","智多星");
		dNode h4=new dNode(4,"林冲","豹子头");
		dNode h5=new dNode(5,"公孙胜","入云龙");
		DoubleLinkedList sll=new DoubleLinkedList();
		sll.add(h1);
		sll.add(h2);
		sll.add(h3);
		sll.add(h4);
		sll.killNull();
		sll.insert(h5, 2);
		sll.delete(h3);
		sll.showAll();
		System.out.println(sll.get(4).toString());
	}

}
