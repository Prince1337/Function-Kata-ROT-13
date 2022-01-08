package main;

public class ROT13 {

  public String replaceMutatedVowels(String text){
    String newText;
    newText = text.replaceAll("[Ä|ä]", "AE");
    newText = newText.replaceAll("[Ö|ö]", "OE");
    newText = newText.replaceAll("[Ü|ü]", "UE");

    return newText;
  }

  public String encrypt(String text, int offset){
    text = replaceMutatedVowels(text);
    text = text.toUpperCase();
    StringBuilder stringBuilder = new StringBuilder();

    int length = text.length();
    for(int i = 0; i < length; i++){
      char currentChar = text.charAt(i);

      if  (currentChar >= 'A' && currentChar <= 'M')
        currentChar += offset;

      else if  (currentChar >= 'N' && currentChar <= 'Z')
        currentChar -= offset;

      stringBuilder.append(currentChar);
    }

    return stringBuilder.toString();
  }




}
