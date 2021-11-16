public class Module {
	//1. A module must refer to a module descriptor in a specific year and term.
	// It contains an array of student records, and average score.
	//2. The average score of a module is the mean of the student record final scores for that module.
	//3. A module descriptor can only be o↵ered once per year and term.
	// In other words, at most, there will be only one instance of a module with the same descriptor, year, and term.

	private int year;
	
	private byte term;
	
	private ModuleDescriptor module;
	
	private StudentRecord[] records;
	
	private double finalAverageGrade;

	public Module(ModuleDescriptor m, int y, byte t){
		module = m;
		year = y;
		term = t;

	}

	public int getYear(){
		return year;
	}

	public byte getTerm(){
		return term;
	}

	public void setRecords(StudentRecord[] r){
		records = r;
	}
//way to calculate average frade
}
