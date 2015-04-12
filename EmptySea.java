public class EmptySea extends Ship {
	
	boolean beenShot;
	
	EmptySea(){
		length = 1;
		beenShot=false;
	}
	
	@Override
	public boolean shootAt(int row, int column){
		return false;
	}
	
	@Override
	public boolean isSunk(){
		return false;
	}
	
	@Override
	public String toString(){
		
		if (beenShot=false){
			return ".";
		}
		else{
			return "-";
		}
	}
}