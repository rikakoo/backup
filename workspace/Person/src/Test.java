
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);


		Person jiro = new Person(25);
		System.out.println(jiro.name);
		System.out.println(jiro.age);


		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);

		saburo.talk();
		saburo.walk();
		saburo.run();
	}

}
