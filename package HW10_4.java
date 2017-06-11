
package HW10_4;

import java.io.*;

public class Main4 {

	public static void main(String[] args) {
		String fileName = "file1.txt";
		String text = "1996-2001\n" 
		        + "University:Ivan Franko Lviv National University\n"
				+ "Faculty: physics and electronics\n" 
				+ "Specialist Degree\n\n" 
				+ "2013 – to present\n"
				+ "Company: Bank of Ukraine Oschadbank\n"
				+ "Position: Senior Technical Support Engineer & Systems Administrator\n"
				+ "Tools and Technologies: Windows Server 2008, Windows Server 2012, "
				+ "Failover Cluster, Hyper-V, MS SQL 2008, T-SQL, storage solutions\n\n" 
				+ "2008 – 2013\n"
				+ "Company: Bank of Ukraine Oschadbank\n" 
				+ "Position: Team Leader of Administrators\n"
				+ "Tools and Technologies: Windows Server 2008, Active Directory,MS SQL, Networking\n\n"
				+ "2001 – 2008\n" + "Company: Bank of Ukraine Oschadbank\n" 
				+ "Position: Desktop Support Engineer\n";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			bw.write(text);
			bw.close();

			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String s = null;
			int count = 0;
			while ((s = br.readLine()) != null) {
				System.out.println(++count + ": " + s);
			}
			br.close();

			fileName = "file2.txt";
			text = "number of lines in file1.txt=" + count + "\n" 
			        + "--------------------------------------\n"
					+ "Volodimir Fedak - 19/10/1979";

			BufferedWriter bw2 = new BufferedWriter(new FileWriter(fileName));
			bw2.write(text);
			bw2.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
