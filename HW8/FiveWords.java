package homework;

import java.util.Scanner;

public class FiveWords {
    void shortAndLongWord(String str)
    {
        if (str == null)
            return;
        String sw="",lw="";
        int s=str.length(),l=0;
        String words[]=str.split(" ");
        for(String word:words)
        {
               
                
                if (word.length() < s) {
                    sw = word;
                    s = word.length();
                } else if (word.length() > l) {
                    lw = word;
                    l = word.length();
                }
        }
        System.out.println("LONGEST WORD : "+lw);
        System.out.println("SHORTEST WORD : "+sw);
        
        // getting number of letters in words 
        String[] wordsArr = str.split("[^a-zA-Z]+");
        for(int i=0;i<words.length;i++)
            if(words[i].length()>0)
                System.out.print("LettersNum: " + wordsArr[i].length()+"; ");
        		System.out.println();
        
        //reversing sentence
        String reverse = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse += words[i].charAt(j);
            }
            System.out.print(reverse + " ");
            reverse = "";
        }
}
    
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        FiveWords obj=new FiveWords();
        System.out.println("Enter a sentence to get shortest and longest word:");
        String str=scr.nextLine();
        str+=" ";
        obj.shortAndLongWord(str);
    }
}


