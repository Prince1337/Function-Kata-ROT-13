package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ROT13Test {

  @Test
  void replaceMutatedVowelsA(){
    String actual = "äpfel";
    String expected = "AEpfel";

    ROT13 rot13 = new ROT13();
    actual = rot13.replaceMutatedVowels(actual);

    assertEquals(expected, actual);
  }

  @Test
  void replaceMutatedVowelsO(){
    String actual = "wörter";
    String expected = "wOErter";

    ROT13 rot13 = new ROT13();
    actual = rot13.replaceMutatedVowels(actual);

    assertEquals(expected, actual);
  }

  @Test
  void replaceMutatedVowelsU(){
    String actual = "brücke";
    String expected = "brUEcke";

    ROT13 rot13 = new ROT13();
    actual = rot13.replaceMutatedVowels(actual);

    assertEquals(expected, actual);
  }

  @Test
  void replaceMutatedVowelsInUEberlebt(){
    String actual = "Überlebt";
    String expected = "UEberlebt";

    ROT13 rot13 = new ROT13();
    actual = rot13.replaceMutatedVowels(actual);

    assertEquals(expected, actual);
  }

  @Test
  void encryptText(){
    String text = "Was ist Lorem Ipsum?\n" +
        "Lorem Ipsum ist ein einfacher Demo-Text für die Print- und Schriftindustrie. Lorem Ipsum ist in der Industrie bereits der Standard Demo-Text seit 1500, als ein unbekannter Schriftsteller eine Hand voll Wörter nahm und diese durcheinander warf um ein Musterbuch zu erstellen. Es hat nicht nur 5 Jahrhunderte überlebt, sondern auch in Spruch in die elektronische Schriftbearbeitung geschafft (bemerke, nahezu unverändert). Bekannt wurde es 1960, mit dem erscheinen von \"Letraset\", welches Passagen von Lorem Ipsum enhielt, so wie Desktop Software wie \"Aldus PageMaker\" - ebenfalls mit Lorem Ipsum.";

    ROT13 rot13 = new ROT13();
    String actual = rot13.encrypt(text, 13);

    String expected = "JNF VFG YBERZ VCFHZ?\n" +
        "YBERZ VCFHZ VFG RVA RVASNPURE QRZB-GRKG SHRE QVR CEVAG- HAQ FPUEVSGVAQHFGEVR. YBERZ VCFHZ VFG VA QRE VAQHFGEVR ORERVGF QRE FGNAQNEQ QRZB-GRKG FRVG 1500, NYF RVA HAORXNAAGRE FPUEVSGFGRYYRE RVAR UNAQ IBYY JBREGRE ANUZ HAQ QVRFR QHEPURVANAQRE JNES HZ RVA ZHFGREOHPU MH REFGRYYRA. RF UNG AVPUG AHE 5 WNUEUHAQREGR HROREYROG, FBAQREA NHPU VA FCEHPU VA QVR RYRXGEBAVFPUR FPUEVSGORNEORVGHAT TRFPUNSSG (ORZREXR, ANURMH HAIRENRAQREG). ORXNAAG JHEQR RF 1960, ZVG QRZ REFPURVARA IBA \"YRGENFRG\", JRYPURF CNFFNTRA IBA YBERZ VCFHZ RAUVRYG, FB JVR QRFXGBC FBSGJNER JVR \"NYQHF CNTRZNXRE\" - RORASNYYF ZVG YBERZ VCFHZ.";

    assertEquals(expected, actual);
  }


}