
public class Ocean {
	
	Ship[][] ships = new Ship[10][10];
	int shotsFired;
	int hitCount;
	int shipsSunk;
	final int totalShips = 10;

	Ocean(){
		
		shotsFired = 0;
		hitCount = 0;
		shipsSunk = 0;
		
		//i is rows and j is columns.
		for(int i = 0; i<ships.length; i++){
			for(int j = 0; j<ships[i].length; j++){
				ships[i][j] = new EmptySea();
			}
		}		
	}
	
	void placeAllShipsRandomly(){
		
	}
	
	boolean isOccupied(int row, int column){
		
	}
	
	boolean shootAt(int row, int column){
		
		
	}
	
	
	int getShotsFired(){
		return shotsFired;
	}
	
	int getHitCount(){
		return hitCount;
	}
	
	int getShipsSunk(){
		return shipsSunk;
	}
	
	boolean isGameOver(){
		//int numSunk = getShipsSunk();
		if(getShipsSunk() == totalShips){
			return true;
		}
		else{
			return false;
		}
		
		
	}
	
	Ship[][] getShipArray(){
		return ships;
	}
	
	void print(){

		System.out.print("  ");
		
		for(int i = 0; i < ships.length; i++){
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int j = 0; j < ships.length; j++){
			System.out.print(j+" "); 
			
			for(int k=0; k<ships[0].length; k++){
				System.out.print("."+" ");
			}
			System.out.println("");
		}
	}
}
