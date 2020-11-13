package GenericConcept;

public class Location {
	
	String loctionId;
	String locationtype;
	
	
	public Location(String loctionId, String locationtype) {
		super();
		this.loctionId = loctionId;
		this.locationtype = locationtype;
	}


	@Override
	public String toString() {
		return "Location [loctionId=" + loctionId + ", locationtype=" + locationtype + "]";
	}
	
	
	

}
