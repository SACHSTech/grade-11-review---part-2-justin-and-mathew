package gr11review.part2;

import gr11review.part2.Utility.*;
import java.io.*;

public class Main{
  public static void main (String[] args) throws FileNotFoundException, IOException{

    String strMiddleRemover;

    strMiddleRemover = Utility.zipZap("zipXzap");

    System.out.println(strMiddleRemover);

    String strLongWords;

    strLongWords = Utility.longestword("words.txt");

    System.out.println(strLongWords);

    int[] intnums = {10, 1, 20, 2};

    intnums = Utility.tenRun(intnums);

    System.out.println(intnums);

  }
}