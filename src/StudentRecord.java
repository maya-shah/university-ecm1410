public class StudentRecord {
	//1. A student record refers to a student in a module, and contains an array of marks, a final score, and a Boolean
	//to indicate whether the student was above the average.
	//2. The final score is a weighted average calculated based on the arrays of marks and the array of weights of
	//the module descriptor of the respective module.
	//3. Marks and the final score must range between 0 and 100.
	//4. Above the average should be true if the student final score is greater
	// than the average final scores in that particular module.
	//5. A student can only have one record per module.
	private Student student;
	
	private Module module;
	
	private double[] marks;
	
	private double finalScore;
	
	private Boolean isAboveAverage;

	public StudentRecord(Student s, Module m, double[] r){
		student = s;
		module = m;
		marks = r;
	}

	public Module getModule(){
		return module;
	}

	public Student getStudent(){
		return student;
	}

	public double[] getMarks(){
		return marks;
	}

	public boolean getIsAboveAverage(){
		return isAboveAverage;
	}


	
}
