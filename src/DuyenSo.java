public class DuyenSo {
	public String ten;
	public int tuoi;

	public DuyenSo(String ten, int tuoi) {
		this.ten = ten;
		this.tuoi = tuoi;
	}

	public static boolean hopHayKhong(DuyenSo banTrai, DuyenSo banGai) {
		if (banTrai.tuoi == banGai.tuoi) return true;
		else return false;
	}
}
