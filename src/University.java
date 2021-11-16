public class University {
	//1. The university has an array of module descriptors, an array of students, and an array of modules.
	//2. The system must be able to initialise the array of module descriptors as shown in Table 1.
	//3. The system must be able to initialise the array of students as shown in Table 2.
	//4. The system must be able to initialise modules with their respective students and marks as shown in Table 3. 5. In order to generate reports, the UoK (University.java) must implement the following functions:
	//(a) public int getTotalNumberStudents(): return the number of students registered in the system. (b) public Student getBestStudent(): return the student with the highest GPA.
	//(c) public Module getBestModule(): return the module with the highest average score.

	private ModuleDescriptor[] moduleDescriptors;
	
	private Student[] students;
	
	private Module[] modules;

	int studentRecords[] = new int[10];

	/**
	 * @return The number of students registered in the system.
	 */
	public int getTotalNumberStudents() {
		// TODO - needs to be implemented
		return students.length;
	}

	/**
	 * @return The student with the highest GPA.
	 */
	public Student getBestStudent() {
		// TODO - needs to be implemented
		return null;
	}

	/**
	 * @return The module with the highest average score.
	 */
	public Module getBestModule() {
		// TODO - needs to be implemented
		return null;
	}
	
	public static void main(String[] args) {
		ModuleDescriptor ECM0002 = new ModuleDescriptor("Real World Mathematics", "ECM0002",new double []{0.1,0.3,0.6});
		ModuleDescriptor ECM1400 = new ModuleDescriptor("Programming", "ECM1400",new double[]{0.25,0.25,0.25,0.25});
		ModuleDescriptor ECM1406 = new ModuleDescriptor("Data Structures", "ECM1406",new double[]{0.25,0.25,0.5});
		ModuleDescriptor ECM1410 = new ModuleDescriptor("Object-Oriented Programming", "ECM1410",new double[]{0.2,0.3,0.5});
		ModuleDescriptor BEM2027 = new ModuleDescriptor("Information Systems", "BEM2027",new double[]{0.1,0.3,0.3,0.3});
		ModuleDescriptor PHY2023 = new ModuleDescriptor("Thermal Physics", "PHY2023",new double[]{0.4,0.6});

		Module math = new Module(ECM0002, 2020, (byte) 2);
		Module programming = new Module(ECM1400, 2019, (byte) 1);
		Module dataStructures = new Module(ECM1406, 2020, (byte) 2);
		Module objectOriented = new Module(ECM1410, 2020, (byte) 2);
		Module informationSystems = new Module(BEM2027, 2019, (byte) 2);
		Module thermalPhysics = new Module(PHY2023, 2019, (byte) 1);
		Module programmingTwo = new Module(ECM1400, 2020, (byte) 2);

		Student ana = new Student(1000, "Ana", 'F');
		Student oliver = new Student(1001, "Oliver", 'M');
		Student mary = new Student(1002, "Mary", 'F');
		Student john = new Student(1003, "John", 'M');
		Student noah = new Student(1004, "Noah", 'M');
		Student chico = new Student(1005, "Chico", 'M');
		Student maria = new Student(1006, "Maria", 'F');
		Student mark = new Student(1007, "Mark", 'X');
		Student lia = new Student(1008, "Lia", 'F');
		Student rachel = new Student(1009, "Rachel", 'F');

		University university = new University();

		university.moduleDescriptors[0] = ECM0002;
		university.moduleDescriptors[1] = ECM1400;
		university.moduleDescriptors[2] = ECM1406;
		university.moduleDescriptors[3] = ECM1410;
		university.moduleDescriptors[4] = BEM2027;
		university.moduleDescriptors[5] = PHY2023;
		university.moduleDescriptors[6] = ECM1400;

		university.students[0] = ana;
		university.students[1] = oliver;
		university.students[2] = mary;
		university.students[3] = john;
		university.students[4] = noah;
		university.students[5] = chico;
		university.students[6] = maria;
		university.students[7] = mark;
		university.students[8] = lia;
		university.students[9] = rachel;

		university.modules[0] = math;
		university.modules[1] = programming;
		university.modules[2] = dataStructures;
		university.modules[3] = objectOriented;
		university.modules[4] = informationSystems;
		university.modules[5] = thermalPhysics;
		university.modules[6] = programmingTwo;

		int[] codes = {1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1000, 1001, 1002, 1003, 1004, 1005,
		1006, 1007, 1008, 1009, 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1000, 1001, 1002, 1003, 1004,
		1005, 1006, 1007, 1008, 1009};

		String[] moduleCodes = {"ECM1400", "ECM1400","ECM1400", "ECM1400", "PHY2023", "PHY2023", "PHY2023", "PHY2023", "PHY2023",
				"BEM2027", "BEM2027", "BEM2027", "BEM2027", "BEM2027","ECM1400", "ECM1400", "ECM1400", "ECM1400", "ECM1400", "ECM1406",
				"ECM1406", "ECM1406", "ECM1406", "ECM1406", "ECM1406", "ECM1406", "ECM1406", "ECM1406", "ECM1406", "ECM1410", "ECM1410",
		"ECM1410", "ECM1410", "ECM1410", "ECM0002", "ECM0002", "ECM0002", "ECM0002", "ECM0002"};

		int[] year = {2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019, 2019,
		2019, 2019, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020, 2020,
		2020, 2020, 2020};

		byte[] term = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		1, 1, 2, 2, 2, 2, 2};

		double[][] marks = {{9, 10, 10, 10,}, {8, 8, 8, 9}, {5, 5, 6, 5}, {6, 4, 7, 9}, {10, 9, 10, 9}, {9, 9}, {6, 9}, {5, 6},
		{9, 7}, {8,5}, {10, 10, 9.5, 10}, {7, 8.5, 8.2, 8}, {6.5, 7.0, 5.5, 8.5}, {5.5, 5, 6.5, 7}, {7, 5, 8, 6},
		{9, 10, 10, 10}, {8, 8, 8, 9}, {5, 5, 6, 5}, {6, 4, 7, 9}, {10, 9, 8, 9}, {10, 10, 10}, {8, 7.5, 7.5},
				{9, 7, 7}, {9, 8, 7}, {2, 7, 7}, {10, 10, 10}, {8, 7.5, 7.5}, {10, 10, 10}, {9, 8, 7}, {8, 9, 10}, {10, 9, 10},
				{8.5, 9, 7.5}, {10, 10, 5.5}, {7, 7, 7}, {5, 6, 10}, {8, 9, 8}, {6.5, 9, 9.5}, {8.5, 10, 8.5}, {7.5, 8,10},
				{10, 6, 10}};



		for(int i = 0; i < university.students.length; i++){
			if(university.students.id[i] == codes[i]){
				studentRecords.add(students[i]);

			}
		}

	}

}


