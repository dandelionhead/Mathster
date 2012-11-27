package BackEnd;

/**
 * Given an array of data from one round, prints out the relevant information
 * needed so User can see how to improve on their skills.
 * 
 * Basic analysis algorithm that prints out all problems that took a standard
 * deviation above the average.
 */
public class Analysis {
	Data[] data;
	long total; // total time
	int num; // number of problems

	/**
	 * Calculates the mean of the time each problem takes.
	 * 
	 * @return
	 */
	long mean() {
		long sum = 0;
		for (Data d : data) {
			sum += d.getTime();
		}
		return sum / num;
	}

	/**
	 * Calculates the standard deviation for the list of times.
	 * 
	 * @return
	 */
	double standardDev() {
		long sum = 0;
		long mean = mean();
		for (Data d : data) {
			sum += Math.pow(d.getTime() - mean, 2);
		}
		return Math.sqrt((double) (sum) / (total - 1));
	}

	void analyze() {
		long mean = mean();
		double stand = standardDev();
		System.out.println("Problems that took longer:");
		for (Data d : data) {
			if (d.getTime() > mean + stand) {
				System.out.println(d.getProblem());
			}
		}
	}

	/**
	 * Constructor.
	 * 
	 * @param info
	 *            Data of individual problem and time
	 * @param t
	 *            Total time for one round
	 * @param n
	 *            Number of problems in one round
	 */
	Analysis(Data[] info, long t, int n) {
		data = info;
		total = t;
		num = n;
	}

}
