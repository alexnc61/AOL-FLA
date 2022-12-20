import java.util.Scanner;

import model.Karyawan;
import singleton.ListSingleton;

public class Main {
	Scanner scan = new Scanner(System.in);
	public void menu() {
		System.out.println("1. Absen Karyawan");
		System.out.println("2. Login Admin");
		System.out.println("3. Exit");
	}
	
	public void addKaryawan() {
		int id = 0;
		String name = "";
		String date = "";
		
		System.out.print("Input id: ");
		id = scan.nextInt();
		scan.nextLine();
		System.out.print("Input nama: ");
		name = scan.nextLine();
		System.out.print("Input tanggal: ");
		date = scan.nextLine();
		
		ListSingleton listSingleton = ListSingleton.getInstance();
		listSingleton.add(new Karyawan(id,name,date));
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		boolean isRun = true;
		int menu = 0;
		do {
			menu();
			do {
				try {
					System.out.print(">> ");
					menu = scan.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
					menu = -1;
				}
				switch (menu) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					System.exit(0);
					break;
				
				default:
					break;
				}
			} while (menu<1 || menu > 3);
		} while (isRun);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
