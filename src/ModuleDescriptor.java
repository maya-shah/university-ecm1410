public class ModuleDescriptor {
	//1. A module descriptor must have a code, a name, and a double array to store the weights of the continuous assessments.
	//2. The code and the name can never be null.
	//3. The code must be unique.
	//4. The Continuous Assessment (CA) weights must sum up to 1, and must be non-negative.

	private final String code;

	private final String name;

	private final double [] continuousAssignmentWeights;


	public ModuleDescriptor(String n, String c, double[] w){
		code = c;
		name = n;
		if((checker(w)) == true){
			continuousAssignmentWeights = w;
		} else{
			continuousAssignmentWeights = null;
			System.out.println("incorrect weights");
			System.exit(0);
		}

	}


	public boolean checker(double[] weights){
		//adds to 1 and none are negative
		double counter = 0.0;
		for(int i = 0; i < weights.length-1; i++){
			if(weights[i] < 0) {
				return false;
			}
			counter += weights[i];

		}
		if(counter != 1){
			return false;
		}
		return true;

	}


	public String toString(){
		return "Name:"+name+"Code"+code+"weight"+continuousAssignmentWeights;
	}

	public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	public double[] getContinuousAssignmentWeights(){
		return continuousAssignmentWeights;
	}

}
//string code
//string name
//double [] weights
//constructor
//setters and getters for each variable
//toString
//some way of checking if the weights are valid. i put this in my descriptor class