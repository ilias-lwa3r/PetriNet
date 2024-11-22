
public class ArcIn extends Arc {
	
	private Transition t;
	private Place p;
	
	//Constructor
	public ArcIn(int poids, Transition t, Place p) {
		super(poids);
		this.t = t;
		this.p = p;
	}
	
	public boolean estTirable() {
		return this.p.getJetons()>super.getPoids();
	}
	
	public void retire() {
		if(this.estTirable()) {
			this.p.setJetons(this.p.getJetons()-super.getPoids());
		}
	}
	
	

}
