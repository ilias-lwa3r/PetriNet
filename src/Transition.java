import java.util.List;

public class Transition {
	
	private List<ArcIn> arcsIn;
	private List<ArcOut> arcsOut;
	
	public Transition(List<ArcIn> arcsIn, List<ArcOut> arcsOut) {
		super();
		this.arcsIn = arcsIn;
		this.arcsOut = arcsOut;
	}
	
	public void step() {
		boolean triggable = true;
		for(ArcIn arc: this.arcsIn) {
			if(!arc.estTirable()) {
				triggable = false;
				break;
			}
		}
		
		if(triggable) {
			for(ArcIn arc : this.arcsIn) {
				arc.retire();
			}
			for(ArcOut arc : this.arcsOut) {
				arc.rajoute();
			}
		}
	}

}
