package com.lx.linkedList;

public class SingleLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroNode h1=new HeroNode(1,"宋江","及时雨");
		HeroNode h2=new HeroNode(2,"卢俊义","玉麒麟");
		HeroNode h3=new HeroNode(3,"吴用","智多星");
		HeroNode h4=new HeroNode(4,"林冲","豹子头");
		HeroNode h5=new HeroNode(5,"公孙胜","入云龙");
		SingleLinkedList sll=new SingleLinkedList();
		sll.add(h1);
		sll.add(h2);
		sll.add(h3);
		sll.add(h4);
		sll.killNull();
		sll.insert(h5, 2);
		sll.delete(h3);
		sll.showAll();
		sll.get(4).toString();
	}

}
