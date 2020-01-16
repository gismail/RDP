package RDP;

public class Transition extends Noeud {

	public Transition(String label) {
		super.label = "T" + label;
	}

	public void affichEntSor() {
		System.out.println("Les entrees de la transition" + this.getLabel() + " sont : ");
		for (Arc a : getEntree()) {
			System.out.println(a.getLabel());
		}
		System.out.println("Les sortées de la transition" + this.getLabel() + " sont : ");
		for (Arc a : getSortie()) {
			System.out.println(a.getLabel());
		}
	}
}
