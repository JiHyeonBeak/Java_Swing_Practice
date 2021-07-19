package Game;



public class Game {
	
	boolean gender;
	boolean body;
	int point = 3;
	int DE = 0;
	String name;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDE() {
		return DE;
	}
	public void setDE(int dE) {
		DE = dE;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public boolean isBody() {
		return body;
	}
	public void setBody(boolean body) {
		this.body = body;
	}

	
	
	
}

