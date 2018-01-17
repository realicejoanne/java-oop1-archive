class Manajer extends Pegawai {
	private int tunjangan;
	public Manajer(String nama, int gaji, int tunjangan){
		super(nama, gaji);
		this.tunjangan = tunjangan;
	}
	public int infoGaji(){
		return gaji;
	}
	public int infoTunjangan(){
		return tunjangan;
	}
}