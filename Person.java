public class Person {
	
	int age;
	double weight;
	double height;

	public Person(){};

	public void setAge(int age)  {
 	 	this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}	

	public double getWeight() {
		return weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
 	}

	public double bmrConversion(int age, double weight, double height) {
		double total = (4.536 *(weight)) +(15.875 * (height)) - (5 *(age)) + 5;
		return total;
	}

	public double tdee() {
		bmrConversion(age, weight, height) * int ActivityFactor;
	}



}
