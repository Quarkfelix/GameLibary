package rendering;

public class Camera {
	int x = 0;
	int y = 0;
	int width = 1200;
	int height = 700;
	int cameraspeed = 3;
//Constructor ------------------------------------------------------------------------------------------

//run --------------------------------------------------------------------------------------------------

//methods ----------------------------------------------------------------------------------------------

	public boolean contains(int x, int y, int width, int height) {
		if (x + width < this.x) {
			return false;
		} else if (y + height < this.y) {
			return false;
		} else if (x > x + width) {
			return false;
		} else if (y > y + height) {
			return false;
		} else {
			return true;
		}
	}

	// moves camera at defined speed in given direction x/y/-x/-y
	public void move(String direction) {
		switch (direction) {
		case "x":
			this.x += cameraspeed;
			break;
		case "-x":
			this.x -= cameraspeed;
			break;
		case "y":
			this.y += cameraspeed;
			break;
		case "-y":
			this.y -= cameraspeed;
			break;
		default:
			break;
		}
	}

//getter-setter ----------------------------------------------------------------------------------------
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
