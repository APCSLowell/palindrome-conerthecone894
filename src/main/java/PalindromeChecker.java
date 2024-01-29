import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
    String placeholder = word.toLowerCase();
    String cool = "";
      //lowercase version of the original string & string to be checked
    
    for(int i = 0; i < placeholder.length(); i++){
      if((int)placeholder.charAt(i) >= 97 && (int)placeholder.charAt(i) <= 122)
        cool += placeholder.charAt(i);
    }
      //making the string that will be checked
    
    for(int i = 0; i < cool.length(); i++){
      if(cool.charAt(i) != cool.charAt(cool.length()-(1+i)))
        return false;
    }
    return true;
    //checking the new string & returning the result
}
/* public String reverse(String str)
{
    String sNew = new String();
    //your code here
    return sNew;
} */
  
}
