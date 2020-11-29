package gr11review.part2;

public class Utility {
  public static String zipZap(String strWord){

    // Create a method that for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

    // zipZap("zipXzap") → "zpXzp"
    // zipZap("zopzop") → "zpzp"
    // zipZap("zzzopzop") → "zzzpzp"
    // zipZap("zzzuzoz") → "zzzuzoz"

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
}
