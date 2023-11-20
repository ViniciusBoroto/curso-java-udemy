package entities;

public class Student {

	public String name;
	public double quarter1;
	public double quarter2;
	public double quarter3;
	
	public boolean passed() {
		if (finalGrade() > 60) {
			return true;
		} else {
			return false;
		}
	}
	
	public double finalGrade() {
		return quarter1 + quarter2 + quarter3;
	}
	
	
//	public boolean passed() {
//		if (finalGrade() > 60.00) {
//			return true;
//		} else {
//			return false;
//		}
//	}
}
