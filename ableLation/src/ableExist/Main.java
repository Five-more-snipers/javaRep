package ableExist;
import java.util.Scanner;
import java.util.Vector;
public class Main {
	
	Scanner scn;
	Vector<Eco> flg;
	
	public void menu1() {
		String tipe; String A; String B; double hg;
		do {
			System.out.print("Masukkan Tipe Penerbangan[Eco/Exe]: ");
			tipe = scn.nextLine();
		} while(!tipe.equals("eco")&&!tipe.equals("exe"));
		
		do {
			System.out.print("Masukkan Kode bandara asal(3 Char Kapital): ");
			A = scn.nextLine();
		} while(A.length() != 3 || !A.equals(A.toUpperCase()));
		
		do {
			System.out.print("Masukkan Kode bandara tujuan(3 Char Kapital): ");
			B = scn.nextLine();
		} while(A.equals(B) || B.length() != 3 || !B.equals(B.toUpperCase()));
		
		do {
			System.out.print("Masukkan Harga dasar (Kelipatan 10k): ");
			hg = scn.nextDouble(); scn.nextLine();
		} while(hg % 10000 != 0);		
		//Adding
		if(tipe.equals("eco")) {
			flg.add(new Eco(A,B,hg));
		} else if (tipe.equals("exe")) {
			flg.add(new Exc(A,B,hg));			
		}
		System.out.print("Penerbangan bertambah..");
		scn.nextLine();		
	}
	
	public void menu2() {
		for(int i = 0;i < flg.size();i++) {
			String tx = "Ekonomi";
			String p = "-";
			if(flg.get(i).getClass() == Exc.class) {
				tx = "Eksekutif";
				p = ((Exc)flg.get(i)).getPin();
			}
			System.out.printf("%s - $s | %.0f IDR | % s | %s\n",
					flg.get(i).getDest(),
					flg.get(i).getEnd(),
					flg.get(i).getP(),
					tx, p);
			
			scn.nextLine();
		}
	}
	public void menu3() {
		
	}
	public void menu () {
		int ip;
		do {
			System.out.println("1. Tambah Penerbangan");
			System.out.println("2. Lihat Penerbangan");
			System.out.println("3. Keluar");
			System.out.print("Input: ");
			ip = scn.nextInt();
			scn.nextLine(); //Flush Buffer
			
			if(ip == 1) {
				menu1(); break;
			} else if (ip == 2) {
				menu2(); break;
			} else if (ip == 3) {
				menu3(); break;
			} else {
				
			}
		} while(ip != 3);
	}
	
	public Main() {
		scn = new Scanner(System.in);
		flg = new Vector<Eco>();
		menu();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
