package RDP;
public class Place extends Noeud {
	private int marq;


	public Place(String label, int marq) {
		super.label="P"+label;
		this.marq = marq;
		// you should add this to the part where you can 
	}

	public int getMarq() {
		return marq;
	}

	public void setMarq(int marq) {
		this.marq = marq;
	}


}
