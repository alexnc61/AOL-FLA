package singleton;

import java.util.Scanner;
import java.util.Vector;

import model.Karyawan;

public class ListSingleton {
	Scanner scan = new Scanner(System.in);
	private static ListSingleton listSingleton;
	private Vector<Karyawan> listKaryawan = new Vector<>();
	
	public static ListSingleton getInstance() {
		// TODO Auto-generated constructor stub
		if(listSingleton == null) {
			listSingleton = new ListSingleton();
		}
		return listSingleton;
	}
	public void add(Karyawan karyawan) {
		listKaryawan.add(karyawan);
	}
	
	public void view() {
		System.out.println("Absen Karyawan Hari Ini");
		System.out.println("=======================");
		int count = 1;
		for(Karyawan karyawan : listKaryawan) {
			System.out.print(count+ ". "); karyawan.show();
			count++;
		}
	}
	
	public boolean isValidChoice(String choice) {
		if(choice.equals("ID")||choice.equals("Name")||choice.equals("Date")) {
			return true;
		}
		return false;
	}
	
	public void update() {
		view();
		int num = 0;
		String newName= "";
		int newId= 0;
		String newDate= "";
		String choice = "";
		do {
			System.out.print("Enter the number of list you want to update[1-"+listKaryawan.size()+"]: ");
			num = scan.nextInt();
		} while (num<1 || num > listKaryawan.size());
		
		num-=1;
		do {
			System.out.print("Which one do you want to update [ID | Name | Date](case sensitive): ");
			choice = scan.nextLine();
		} while (!isValidChoice(choice));
		
		if(choice.equals("Name")) {
			System.out.print("Enter the updated name: ");
			newName = scan.nextLine();
			
			
			listKaryawan.get(num).setName(newName);
		}
		if(choice.equals("ID")) {
			System.out.println("Enter the updated ID: ");
			newId = scan.nextInt();
			
			listKaryawan.get(num).setId(newId);
		}
		if(choice.equals("Date")) {
			System.out.println("Enter the updated date: ");
			newDate = scan.nextLine();
			
			listKaryawan.get(num).setDate(newDate);
		}
		
		
	}
	public void delete() {
		view();
		int num = 0;
		do {
			System.out.print("Choose the list of absence you want to delete [1-"+listKaryawan.size()+"]: ");
			num = scan.nextInt();
		} while (num>1 || num < listKaryawan.size());
		
		
		num-=1;
		listKaryawan.remove(num);
		
	}
}


