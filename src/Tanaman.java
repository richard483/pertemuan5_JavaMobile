
class Tanaman {
	protected String nama;
	String jenisAkar;
	private Integer nomorSeri;
	
	//final ==> method tidak dapat di override (timpa) di class lain, atau class tidak dapat di extend ke calss lain
//	final public void printInformasi() {
//		System.out.println("Nama: " + nama);
//		System.out.println("Jenis akar: " + jenisAkar);
//		System.out.println("Nomor Seri: " + nomorSeri);
//	}
	
	public void printInformasi() {
		System.out.println("Nama: " + nama);
		System.out.println("Jenis akar: " + jenisAkar);
		System.out.println("Nomor Seri: " + nomorSeri);
	}
	
	public Tanaman(String nama, String jenisAkar, Integer nomorSeri) {
		super();
		this.nama = nama;
		this.jenisAkar = jenisAkar;
		this.nomorSeri = nomorSeri;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJenisAkar() {
		return jenisAkar;
	}

	public void setJenisAkar(String jenisAkar) {
		this.jenisAkar = jenisAkar;
	}

	public Integer getNomorSeri() {
		return nomorSeri;
	}

	public void setNomorSeri(Integer nomorSeri) {
		this.nomorSeri = nomorSeri;
	}

}
