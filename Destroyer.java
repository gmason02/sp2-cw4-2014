
public class Destroyer extends Ship{
	
	Destroyer(){
		length = 2;
	}
	
	@Override 
	String getShipType(){
		return "Destroyer";
	}
	
	@Override
	public String toString(){
		return "S";
	}
	
}
