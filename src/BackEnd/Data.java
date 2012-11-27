package BackEnd;

/**
 * Keeps track of the problem as well as the time needed for a specific problem.
 */
public class Data {
	private String problem;
	private long time;

	Data(String s, long t) {
		problem = s;
		time = t;
	}

	long getTime() {
		return time;
	}

	String getProblem() {
		return problem;
	}

}
