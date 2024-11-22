import java.util.List;

public interface PetriNet {
	
	
	//methods to add transitions, places and arcs
	public void addTransition(Transition t);
	
	public void addPlace(Place t);
	
	public void addArcOut(int poids, Transition t, Place p);
	
	public void addArcIn(int poids,Transition t,Place p);
	
	public void addArcZero(int poids,Transition t,Place p);
	
	public void addArcVideur(int poids,Transition t,Place p);
	
	//method to remove transitions, places or arcs
	public void remove(Object o);

}
