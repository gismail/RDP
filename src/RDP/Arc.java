package RDP;

import java.util.ArrayList;

public class Arc {
	private int poids;
	private String label;
	private ArrayList<Noeud> source =new ArrayList<>();
	private ArrayList<Noeud> dest = new ArrayList<>();

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = "a" + label;
	}

	public Arc(String label, int poids) {
		this.poids = poids;
		this.label = "a" + label;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public ArrayList<Noeud> getSource() {
		return source;
	}

	public void addSource(Noeud n) {
		this.source.add(n);
	}

	public ArrayList<Noeud> getDest() {
		return dest;
	}

	public void addDest(Noeud n) {
		this.dest.add(n);
	}

	public void affich() {
		System.out.println(this.getLabel());
	}
}
