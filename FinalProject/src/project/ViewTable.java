package project;

import java.io.IOException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewTable {
	private static final String NameFileCollect = "price.csv";
	private static final String NameFileConfig = "config.csv";

	public ViewTable() {}
	

	public static void Table(String column[],String data[][]) {
			JFrame f;
			f = new JFrame();
			JTable jt = new JTable(data, column);
			jt.setBounds(30, 40, 300, 300);
			JScrollPane sp = new JScrollPane(jt);
			f.add(sp);
			f.setSize(800, 500);
			f.setVisible(true);
		
	}

	public void GetTeble(int heshKey) {
//		final int heshKey=1898905709;
		ListCollection listConfig = null;
		ListCollection listTabl = null;
		try {
			listConfig = new ListCollection(NameFileConfig);
			listTabl = new ListCollection(NameFileCollect);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		List<List<String>> list;
		list=listConfig.GetCollection(heshKey);
		String tcolumn[]= new String[list.size()];
		int i=0;
		int c=1;
		for (List<String> l : list) {
			tcolumn[i++]=l.get(c);
		}
		list= listTabl.GetCollection(heshKey);
		String tdata[][]= new String[list.size()][];
		i=0;
        for (i=0;i<list.size();i++){
			tdata[i]= new String[list.get(i).size()];
			for (int j=1;j<list.get(i).size();j++) {
				tdata[i][j-1]=(String)list.get(i).get(j);
			}
		}
	    Table(tcolumn,tdata);   
	}

}
