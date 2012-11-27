package BackEnd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Keeps track of all the users and their files.
 * 
 */
public class Database implements Backend {

	@Override
	public String[] getSlots() {
		String[] names = new String[3];
		
		for(int i = 1; i <= 3; i++){
			File f = new File("slot" + i + ".txt");
			BufferedReader input;
			try {
				input = new BufferedReader(new FileReader(f));
				names[i] = input.readLine();
				input.close();			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return names;
	}

	@Override
	public String getPlayer(int i) {
		String name = "";
		File f = new File("slot" + i + ".txt");
		BufferedReader input;
		try {
			input = new BufferedReader(new FileReader(f));
			name = input.readLine();
			input.close();
		} catch (IOException exception1) {
			exception1.printStackTrace();
		}
		return name;
	}


	@Override
	public void addInfo(int i, double average) {
		try{
			FileWriter f = new FileWriter("slot" + i + ".txt");
			PrintWriter out = new PrintWriter(f);	
			out.println(average);
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	@Override
	public double[] getAverages(int i) throws IOException {
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
			input.close();
			return averages;
		} catch (IOException e) {
			System.out.println(i + ":file has not length");
		}
		return null;

	}

	@Override
	public void setPlayer(int i, String name) {
		File old = new File("slot" + i + ".txt");
		old.delete();
		File newFile = new File("slot" + i + ".txt");
		try {
			newFile.createNewFile();
			FileWriter f = new FileWriter("slot" + i + ".txt");
			PrintWriter out = new PrintWriter(f);	
			out.println(name);
			out.println(0);
			out.close();
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}		
	}

}
