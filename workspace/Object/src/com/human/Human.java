package com.human;

public class Human {

	public static String say;
	public static String mei;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("HelloWorld");
		say="onai";
		mei="rikako";
			System.out.println(say + mei);
			HumanName humanName = new HumanName ();
			System.out.println(humanName.getName());
			String say=humanName.say;
			String mei=humanName.getmei();

			String say1=Human.say;

			HumanName HumanName2 =new HumanName("tanaka","taro");
			System.out.println(HumanName2.getName());
	}

}
