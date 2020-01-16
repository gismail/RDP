package RDP;

import java.util.ArrayList;

public abstract class Noeud {
	private ArrayList<Arc> sortie = new ArrayList<>();
	private ArrayList<Arc> entree = new ArrayList<>();
	protected String label;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public ArrayList<Arc> getSortie() {
		return sortie;
	}

	public void addSortie(Arc a) {
		this.sortie.add(a);
		a.addSource(this);
	}

	public ArrayList<Arc> getEntree() {
		return entree;
	}

	public void addEntree(Arc a) {
		this.entree.add(a);
		a.addDest(this);
	}

	public void affich() {
		System.out.println(this.getLabel());
	}

	public void affichEntSor() {
		if (this instanceof Place)
			System.out.println("Les entrees de la palce " + this.getLabel() + " sont : ");
		else 
			System.out.println("Les entrees de la transition" + this.getLabel() + " sont : ");
		for (Arc a : getEntree()) {
			System.out.println(a.getLabel());
		}
		if (this instanceof Place)
			System.out.println("Les sortées de la palce " + this.getLabel() + " sont : ");
		else 
			System.out.println("Les sortées de la transition " + this.getLabel() + " sont : ");
		for (Arc a : getSortie()) {
			System.out.println(a.getLabel());
		}
	}
}
