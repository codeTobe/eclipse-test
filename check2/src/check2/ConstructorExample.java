package check2;

class ConstructorExample {
	int x;
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public ConstructorExample(int x) {
		this.x =x ;
	}
	public static void main(String[] args) {
		ConstructorExample a = new ConstructorExample(3);
		int n = a.getX();
	}
}
