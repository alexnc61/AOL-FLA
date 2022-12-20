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
	
	public void adminMenu() {
		System.out.println("1. Liat Absen");
		System.out.println("2. Update Absen");
		System.out.println("3. Delete Absen");
		System.out.println("4. Return");
		
	}
	
	public void admin() {
		ListSingleton listSingleton = ListSingleton.getInstance();
		adminMenu();
		System.out.print("Choose: ");
		int choose = scan.nextInt();
		if(choose == 1) {
			listSingleton.view();
		}
		if(choose == 2) {
			listSingleton.update();
		}
		if(choose == 3) {
			listSingleton.delete();
		}
		if(choose == 4) {
			return;
		}
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
		
		Karyawan karyawan = new Karyawan(id, name, date);
		ListSingleton listSingleton = ListSingleton.getInstance();
		listSingleton.add(karyawan);
		System.out.println();
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
					addKaryawan();
					break;
				case 2:
					admin();
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
