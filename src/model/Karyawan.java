package model;

public class Karyawan {
	private int id;
	private String name;
	private String date;
	
	public Karyawan(int id, String name, String date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	
	public void show() {
		System.out.println("ID      : "+id);
		System.out.println("Nama    : "+name);
		System.out.println("Tanggal : "+date);
		System.out.println();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
