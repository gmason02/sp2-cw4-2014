
public class Cruiser extends Ship{
	
	Cruiser(){
		length = 3;
	}
	
	@Override 
	String getShipType(){
		return "Cruiser";
	}
	
	@Override
	public String toString(){
		return "S";
	}
	
}