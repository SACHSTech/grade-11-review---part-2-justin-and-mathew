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

    File filename = new File("src/gr11review/part2/words.txt");

    BufferedReader keyboard = new BufferedReader(new FileReader(filename));

    String strCurrentWord;    
    String strLongWord;

    strLongWord = "";
    strCurrentWord = "";

    strCurrentWord = keyboard.readLine();
    while(strCurrentWord != null){
      if(strCurrentWord.length() > strLongWord.length()){
        strLongWord = strCurrentWord;
      }
      strCurrentWord = keyboard.readLine();
      }
      keyboard.close();
      
      return strLongWord;
  }

  public static int[] tenRun(int[] nums){

    int intCount;

    for (intCount = 0; intCount < nums.length - 1; intCount++) {
      if (nums[intCount] % 10 == 0 && nums[intCount + 1] % 10 != 0) {
        nums[intCount + 1] = nums[intCount];
      }
    }
    return nums;

  }
  // For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}

  // tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
  // tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
  // tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
}
