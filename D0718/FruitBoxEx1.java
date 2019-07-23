//package D0718;
//
//import java.util.ArrayList;
//
//public class FruitBoxEx1 {
//
//	public static void main(String[] args) {
//		Box<Fruit> fruitBox = new Box<Fruit>();
//		Box<Apple> appleBox = new Box<Apple>();
//		Box<Toy> toyBox = new Box<Toy>();
//		Box<Toy> toyBox2 = new Box<>(); //�����ڿ� Ÿ�Ի�������, j�� 1.7
//		//Box<Grape> grapeBox = new Box<Apple>(): //����, Ÿ�� ����ġ, �����ÿ��� Ÿ���� ��ġ�ؾ� �Ѵ�.
//		
//		fruitBox.add(new Fruit());
//		fruitBox.add(new Apple()); //OK, void add(Fruit item), Apple�� Fruit�� �ڽ�
//		
//		appleBox.add(new Apple());
//		appleBox.add(new Apple());
//		//appleBox.add(new Toy()); //����, Box<Apple>���� Apple�� ���� �� ����
//		
//		toyBox.add(new Toy());
//		//toyBox.add(new Apple()); //����, Box<Toy>���� Apple�� ���� �� ����
//		
//		System.out.println(fruitBox);
//		System.out.println(appleBox);
//		System.out.println(toyBox);
//	}
//
//}
//
//class Box<T> {
//	ArrayList<T> list = new ArrayList<T>();
//	void add(T item) {
//		list.add(item);
//	}
//	int size() {
//		return list.size();
//	}
//	public String toString() {
//		return list.toString();
//	}
//}
//
//class Fruit {
//	public String toString() {
//		return "Fruit";
//	}
//}
//
//class Apple extends Fruit {
//	public String toString() {
//		return "Apple";
//	}
//}
//
//class Grape extends Fruit {
//	public String toString() {
//		return "Grape";
//	}
//}
//
//class Toy {
//	public String toString() {
//		return "Toy";
//	}
//}