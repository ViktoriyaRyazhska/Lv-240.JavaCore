package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListType {
//	private static final String NameFileType = "ListType.txt";
	private static Scanner scanner= new Scanner(System.in);
	private ArrayList<String> list= new ArrayList<String>();

	public ListType(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String s = null;
		while ((s = br.readLine()) != null) {
			list.add(s);
		}
		br.close();
//		return list;
	}

	public int PrintList() {
		int count = 0;
//		list = getListType(NameFileType);
		for (Object obj:list){
		   System.out.println(++count + ". " + (String)obj+" "+obj.hashCode());
		}
		return count;
	}

	public void OpenType(int num){
		ViewTable viewTable= new ViewTable();
		viewTable.GetTeble(list.get(num-1).hashCode());
	}
	
	
	public void setAddType() throws IOException {
		System.out.println("Додавання елемента");
		System.out.print("Введіть назву елемента: ");
//		scanner = new Scanner(System.in);
//		list = getListType(NameFileType);
		list.add(scanner.nextLine());
		BufferedWriter bw = new BufferedWriter(new FileWriter(MainMenu.NameFileType));
		for (Object obj:list){
		bw.write((String)obj+"\n");
		}
		bw.close();
	}

	public void setDelType() throws IOException {
		System.out.println("Видалення елемента");
		System.out.print("Введіть номер елемента: ");
//		scanner = new Scanner(System.in);
//		list = getListType(NameFileType);
		try {
		  list.remove((scanner.nextInt()-1));
		} catch (IndexOutOfBoundsException e){
			System.out.println("Помилка!Невірний номер елемента.");
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter(MainMenu.NameFileType));
		for (Object obj:list){
		bw.write((String)obj+"\n");
		}
		bw.close();
	}
}
