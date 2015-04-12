
public class Submarine extends Ship{
	
	Submarine(){
		length = 2;
	}
	
	@Override 
	String getShipType(){
		return "Submarine";
	}
	
	@Override
	public String toString(){
		return "S";
	}
	
}