
public class EmptySea extends Ship {

	EmptySea(){
		length = 1;
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
		boolean beenShot = false;
		if (beenShot=false){
			return ".";
		}
		else{
			return "-";
		}
	}
	
}
