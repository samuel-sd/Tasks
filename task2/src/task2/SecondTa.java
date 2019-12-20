package task2;

public class SecondTa {
	 public String name;
	 public	char grade;
	 public	int age;
	 public int roll_no;

	

	@Override
	public String toString() {
		return "Student [roll no= "+roll_no+", name= " + name + ", grade= " + grade + ", age= " + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}



	}
