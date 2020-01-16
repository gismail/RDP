package RDP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rdp rdp = new Rdp();
		Noeud p1 = new Place("1", 1);
		Noeud p2 = new Place("2", 0);
		Noeud p3 = new Place("3", 0);

		Noeud t1 = new Transition("1");
		Noeud t2 = new Transition("2");

		Arc a1 = new Arc("1", 1);
		Arc a2 = new Arc("2", 1);
		Arc a3 = new Arc("3", 1);
		Arc a4 = new Arc("4", 1);
		Arc a5 = new Arc("5", 1);
		Arc a6 = new Arc("6", 1);

		rdp.addNoueds(p1);
		rdp.addNoueds(p2);
		rdp.addNoueds(p3);

		rdp.addNoueds(t1);
		rdp.addNoueds(t2);

		rdp.addArcs(a1);
		rdp.addArcs(a2);
		rdp.addArcs(a3);
		rdp.addArcs(a4);
		rdp.addArcs(a5);
		rdp.addArcs(a6);

		p1.addEntree(a6);
		p1.addSortie(a1);
		p2.addEntree(a2);
		p2.addSortie(a4);
		p3.addEntree(a3);
		p3.addSortie(a5);
		t1.addEntree(a1);
		t1.addSortie(a2);
		t1.addSortie(a3);
		t2.addEntree(a4);
		t2.addEntree(a5);
		t2.addSortie(a6);

		for (Noeud n : rdp.getNoueds()) {
			n.affichEntSor();
		}

		//rdp.affich();

	}

}
