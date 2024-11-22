
public class ArcOut extends Arc{
	
	private Transition t;
	private Place p;
	
	
	public ArcOut(int poids, Transition t, Place p) {
		super(poids);
		this.t = t;
		this.p = p;
	}
	
	public void rajoute() {
		this.p.setJetons(this.p.getJetons()+this.getPoids());
	}
	
	

	
	
	

}
