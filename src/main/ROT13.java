package main;

public class ROT13 {

  public String replaceMutatedVowels(String text){
    String newText;
    newText = text.replaceAll("[Ä|ä]", "AE");
    newText = newText.replaceAll("[Ö|ö]", "OE");
    newText = newText.replaceAll("[Ü|ü]", "UE");

    return newText;
  }

  public String encrypt (String text){
    text = replaceMutatedVowels(text);
    text = text.toUpperCase();
    StringBuilder stringBuilder = new StringBuilder();

    int length = text.length();
    for(int i = 0; i < length; i++){
      char currentChar = text.charAt(i);
      if       (currentChar >= 'a' && currentChar <= 'm') currentChar += 13;
      else if  (currentChar >= 'A' && currentChar <= 'M') currentChar += 13;
      else if  (currentChar >= 'n' && currentChar <= 'z') currentChar -= 13;
      else if  (currentChar >= 'N' && currentChar <= 'Z') currentChar -= 13;
      stringBuilder.append(currentChar);
    }

    return stringBuilder.toString();
  }




}
