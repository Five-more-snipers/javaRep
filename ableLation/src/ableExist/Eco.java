package ableExist;

public class Eco {
	protected String dest;
	protected String end;
	protected double rPrice;
	
	public Eco(String dest, String end, double rPrice) {
		this.dest = dest;
		this.end = end;
		this.rPrice = rPrice;
	}

	//UniqueFunc
	public double getP() {
		return rPrice * 1.11;
	}
	
	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public double getrPrice() {
		return rPrice;
	}

	public void setrPrice(double rPrice) {
		this.rPrice = rPrice;
	}
	
	
}
