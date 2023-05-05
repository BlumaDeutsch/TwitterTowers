
public class Tower {
	protected int width, height;
	
	public Tower(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Tower() {
		this.setWidth(0);
		this.height = 0;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}