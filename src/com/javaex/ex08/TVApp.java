package com.javaex.ex08;

public class TVApp {

	public static void main(String[] args) {

		TV tv = new TV(7, 20, true); // 초기값

		tv.status();

		System.out.println("================");
		tv.channel(300); // 255
		tv.status();

		tv.channel(0); // 1
		tv.status();

		tv.channel(237); // 237
		tv.status();

		System.out.println("================");
		tv.channel(true); // 238
		tv.status();

		tv.channel(false); // 237
		tv.status();

		tv.channel(255);
		tv.status();
		tv.channel(true); // 255
		tv.status();

		tv.channel(1);
		tv.status();
		tv.channel(false); // 1
		tv.status();

		System.out.println("================");

		tv.volume(120); // 100
		tv.status();

		tv.volume(-1); // 0
		tv.status();

		tv.volume(77); // 77
		tv.status();

		System.out.println("================");

		tv.volume(true); // 78
		tv.status();

		tv.volume(false); // 77
		tv.status();

		tv.volume(100);
		tv.status();
		tv.volume(true); // 100
		tv.status();

		tv.volume(0);
		tv.status();
		tv.volume(false); // 0
		tv.status();

	}
}
