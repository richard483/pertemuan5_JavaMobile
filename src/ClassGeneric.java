
public class ClassGeneric <T>{//T ==> type
	T value;
	public ClassGeneric(T input) {
		this.value = input;
	}
	
	public void printValue() {
		System.out.println(value);
	}

}
