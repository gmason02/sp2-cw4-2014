
public class Ocean {
	
	Ship[][] ships = new Ship[10][10];
	int shotsFired = 0;
	int hitCount = 0;
	public int shipsSunk =0;
	
	Ocean(){
		//initialising variables as per instructions. Initialisation above redundant REMOVE
		shotsFired = 0;
		hitCount = 0;
		shipsSunk = 0;
		
		//i is rows and j is columns.
		for(int i = 0; i<ships.length; i++){
			for(int j = 0; j<ships.length; j++){
				ships[i][j] = new EmptySea();
			}
		}
	}
}
