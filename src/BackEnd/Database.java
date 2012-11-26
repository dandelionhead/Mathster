package BackEnd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Keeps track of all the users and their files.
 * 
 */
public class Database implements Backend {

	@Override
	public String[] getSlots() {

		// TODO Auto-generated method stub.
		return null;
	}

	@Override
	public String getPlayer(int i) {
		// TODO Auto-generated method stub.
		return null;
	}

	@Override
	public String setPlayer(int i) {
		// TODO Auto-generated method stub.
		return null;
	}

	@Override
	public void addInfo(int i, double average) {
		// TODO Auto-generated method stub.
		File f = new File("slot" + i + ".txt");

	}

	/**
	 * Returns a list of all the averages for the slot i.
	 * 
	 * @param i
	 * @return
	 * @throws IOException
	 */
	double[] getAverages(int i) throws IOException {
		File f = new File("slot" + i + ".txt");
		BufferedReader input = new BufferedReader(new FileReader(f));
		String name = input.readLine();
		if (name == null) {
			System.out.println(i + ": null name");
			return null;
		}

		int length;
		try {
			length = Integer.parseInt(input.readLine());
			double[] averages = new double[length];

			for (int k = 0; k < length; k++) {
				averages[k] = Integer.parseInt(input.readLine());
			}

			return averages;
		} catch (IOException e) {
			System.out.println(i + ":file has not length");
		}
		return null;

	}

}
