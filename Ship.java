
public class Ship {
	private int bowRow;
	private int bowColumn;
	public int length;
	private boolean horizontal;
	private boolean [] hit = new boolean[4];
	
	//Getters
	//Returns int bow row
	int getBowRow(){
		return bowRow;
	}
	
	//Returns int bow column
	int getbowColumn(){
		return bowColumn;
	}

	//Returns int horizontal
	boolean isHorizontal(){
		return horizontal;
	}

	//Returns ship type. Must be overwritten
	String getShipType(){
		return "Anything";
	}

	//Return length of ship. Must be overwritten.
	//Maybe return int length from above?
	int getLength(){
		return length;
	}

	//Setters
	//Sets value of int bowRow.
	void setBowRow(){
		this.bowRow = bowRow;
	}
	
	void setBowColumn(){
		this.bowColumn = bowColumn;
	}
	
	boolean setHorizontal(){
		return horizontal;
	}

	//Instance
	boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean){
		//Returns True if ship can fit with bow in this location going up or down
		//Not to change array just return the go ahead to place.
	}

	void placeShipAt(int row, int column, boolean horizontal, Ocean ocean){
		//Puts ship in Ocean. Give values to bowRow, columnRow and horizontal
		//Also ref to ship in up to 4 locations in ships array in Ocean obj.
	}

	boolean shootAt(int row, int column){
		//If ship occupies row or column AND ship has not been sunk mark part of ship hit
		//0 indicates bow in hit array return true for hit otherwise false
	}

	boolean isSunk(){
		//return true if all ship has been hit
		//false otherwise
	}
}