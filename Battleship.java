
public class Battleship extends Ship{
	
	Battleship(){
		length = 4;
	}
	
	@Override 
	String getShipType(){
		return "Battleship";
	}
	
	@Override
	public String toString(){
		return "S";
	}
	
}