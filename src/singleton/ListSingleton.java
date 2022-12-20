package singleton;

import java.util.Vector;

import model.Karyawan;

public class ListSingleton {
	private static ListSingleton listSingleton;
	private Vector<Karyawan> listKaryawan = new Vector<>();;
	
	public static ListSingleton getInstance() {
		// TODO Auto-generated constructor stub
		if(listSingleton == null) {
			listSingleton = new ListSingleton();
		}
		return listSingleton;
	}
	public void add(Karyawan karyawan) {
		listSingleton.add(karyawan);
	}

}
