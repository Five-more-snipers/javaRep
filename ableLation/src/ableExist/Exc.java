package ableExist;
import java.util.Random;

public class Exc extends Eco implements PLongue {
	
	//Exclusie-Exclusie
	private String pin;

	public Exc(String dest, String end, double rPrice) {
		super(dest, end, rPrice);
		pin = genPIN();
	}
	
	
	public String getPin() {
		return pin;
	}


//	public void setPin(String pin) {
//		this.pin = pin;
//	}

	@Override 
	public double getP() {
		return rPrice + 150000 * 1.11;
	}
	
	@Override
	public String genPIN() {
		String tP = "";
		String h = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String a = "0123456789";
		
		Random rand = new Random();
		
		tP += h.charAt(rand.nextInt() % 26);
		tP += h.charAt(rand.nextInt() % 10);
		tP += h.charAt(rand.nextInt() % 10);
		tP += h.charAt(rand.nextInt() % 10);
		tP += h.charAt(rand.nextInt() % 10);
		tP += h.charAt(rand.nextInt() % 26);
		
		return tP;
	}
}
