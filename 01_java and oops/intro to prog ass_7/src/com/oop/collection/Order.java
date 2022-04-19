package com.oop.collection;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.TreeSet;

public class Order implements Comparable<Order> {
	private Integer id;
	private LocalDate orderDate;
	private Integer amount;

	public Order(int id, LocalDate orderDate, int amount) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.amount = amount;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Order order = (Order) obj;
		return (order.id.equals(this.id) && order.orderDate.equals(this.orderDate) && order.amount.equals(this.amount));
	}

	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	@Override
	public int compareTo(Order o) {
		return this.orderDate.compareTo(o.orderDate);
	}

	public static void main(String[] args) {

		Order order1 = new Order(1, LocalDate.of(2018, 12, 10), 200);
		Order order2 = new Order(1, LocalDate.of(2018, 12, 10), 200);
		Order order3 = new Order(2, LocalDate.of(2017, 10, 20), 400);
		Order order4 = new Order(2, LocalDate.of(2017, 10, 20), 400);
		Order order5 = new Order(3, LocalDate.of(2020, 4, 25), 600);
		Order order6 = new Order(3, LocalDate.of(2020, 4, 25), 600);

		HashSet<Order> hashSet = new HashSet<Order>();
		hashSet.add(order1);
		hashSet.add(order2);
		hashSet.add(order3);
		hashSet.add(order4);
		hashSet.add(order5);
		hashSet.add(order6);

		System.out.println(order1.equals(order2));

//		System.out.println(order1.hashCode());
//		System.out.println(order2.hashCode());

		System.out.println(hashSet);

		TreeSet<Order> treeSet = new TreeSet<Order>();
		treeSet.add(order1);
		treeSet.add(order2);
		treeSet.add(order3);
		treeSet.add(order4);
		treeSet.add(order5);
		treeSet.add(order6);

		System.out.println(treeSet);

		for (Order ob : treeSet) {
			System.out.println(ob.id + " " + ob.orderDate + " " + ob.amount);
		}

	}

}
