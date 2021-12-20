
class Bunga extends Tanaman{
	Integer jumlahKelopak;
	Integer Harga;
	String warnaBunga;
	
	//Ad-hoc polymorphism (Overloading) ==> satu nama method yang sama dapat melakukan lebih dari satu pekerjaan
	public void hitung() {
		System.out.println(Harga);
	}
	
	public void hitung(Integer pengkalian) {
		System.out.println(Harga*pengkalian);
	}
	
	public void hitung(String namaAlias) {
		System.out.println(namaAlias + Harga);
	}
	
	//Overriding ==> menimpa method yang berada di parent class (super class)
	public void printInformasi() {
		System.out.println("Nama: " + nama);
		System.out.println("Jumlah Kelopak: " + jumlahKelopak);
		System.out.println("Warna bunga: " + warnaBunga);
	}
	
	
	//Short cut membuat constructor: Alt + Shift + S + O
	public Bunga(String nama, String jenisAkar, Integer nomorSeri, Integer jumlahKelopak, Integer harga,
			String warnaBunga) {
		super(nama, jenisAkar, nomorSeri);
		this.jumlahKelopak = jumlahKelopak;
		Harga = harga;
		this.warnaBunga = warnaBunga;
	}
	
	//setter getter short cut: Alt + Shift + S + R
	public Integer getJumlahKelopak() {
		return jumlahKelopak;
	}

	public void setJumlahKelopak(Integer jumlahKelopak) {
		this.jumlahKelopak = jumlahKelopak;
	}

	public Integer getHarga() {
		return Harga;
	}

	public void setHarga(Integer harga) {
		Harga = harga;
	}

	public String getWarnaBunga() {
		return warnaBunga;
	}

	public void setWarnaBunga(String warnaBunga) {
		this.warnaBunga = warnaBunga;
	}
	
}
