package jdbc06;

class PairClass<K, V>{
	private K key;
	private V value;
	public PairClass(K key, V value){
		this.key = key;
		this.value = value;
	}
	public void display(){
		System.out.println("key = " + key);
		System.out.println("value = " + value);
	}
}
public class Exam07 {
	public static void main(String[] ar){
		PairClass<Integer, String> pc_01 = new PairClass<>(1,"전용호");
		PairClass<String, Double> pc_02 = new PairClass<>("PI",3.141592);
		pc_01.display();
		pc_02.display();
	}

}
