import java.util.Vector;

public class Main {

	public Main() {
		Bunga melati = new Bunga("Melati", "Serabut", 3213, 5, 35000, "Putih");
		Tanaman mawar = new Tanaman("Mawar", "Tunggang", 2434);
//		mawar.setNama("Rose");
//		System.out.println(mawar.getNama());
		
//		//overloading
//		melati.hitung();
//		melati.hitung(9);
//		melati.hitung("Bunga putih");
//		
//		System.out.println();
//		//Overriding
//		melati.printInformasi();
//		System.out.println();
//		mawar.printInformasi();
//		
		
//		ClassInteger angkaBulat = new ClassInteger(90);
//		ClassDouble angkaKoma = new ClassDouble(3.14);
//		angkaBulat.printValue();
//		angkaKoma.printValue();
		
		//Java generic
		ClassGeneric<Integer> angkaBulat = new ClassGeneric<Integer>(100);
		ClassGeneric<Double> angkaKoma = new ClassGeneric<Double>(3.14);
		angkaBulat.printValue();
		angkaKoma.printValue();
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
