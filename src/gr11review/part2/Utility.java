package gr11review.part2;

import java.io.*;
import java.io.FileNotFoundException;

public class Utility {
  public static String zipZap(String strWord){

    int intCount;
    String strNewWord;

    strNewWord = "";

    if(strWord.length() <= 2){
      return strWord;
    }

    for(intCount = 0; intCount < strWord.length(); intCount++){
      if(strWord.substring(intCount, intCount + 1).equalsIgnoreCase("z") && strWord.substring(intCount + 2, intCount + 3).equalsIgnoreCase("p")){
        strNewWord = strNewWord + strWord.substring(intCount, intCount + 1) + strWord.substring(intCount + 2, intCount + 3);
        intCount = intCount + 2;
      }else{
        strNewWord = strNewWord + strWord.substring(intCount, intCount + 1);
      }
    }

    return strNewWord;

  }

  public static String longestword(String filenametxt) throws FileNotFoundException, IOException{

    File filename = new File(filenametxt);

    BufferedReader keyboard = new BufferedReader(new FileReader(filename));

    String strCurrentWord;    
    String strLongWord;

    strLongWord = "";
    strCurrentWord = "";

    strCurrentWord = keyboard.readLine();
    while(strCurrentWord != null){
      System.out.println(strCurrentWord);
      System.out.println(strLongWord);
      if(strCurrentWord.length() > strLongWord.length()){
        strLongWord = strCurrentWord;
      }
      strCurrentWord = keyboard.readLine();
      }
      keyboard.close();
      
      return strLongWord;
  }
}
