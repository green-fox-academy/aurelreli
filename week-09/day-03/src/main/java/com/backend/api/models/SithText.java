package com.backend.api.models;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SithText {
  @Id
  private String sith_text;

  public SithText() {}

  public SithText(String text) {
    Random random = new Random();
    String[] randomSentences = {"Arrgh. ", "Uhmm. ", "Err..err.err. "};
    sith_text = text;
    String[] sentences = sith_text.split("\\.");
    for (int i = 1; i < sentences.length; i++) {
      sentences[i] = sentences[i].substring(1);
    }
    String[][] words = new String[sentences.length][];
    for (int i = 0; i < sentences.length; i++) {
        words[i] = sentences[i].split(" ");
    }
    String temp;
    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < words[i].length; j++) {
        if ((j % 2) == 1) {
          temp = words[i][j];
          words[i][j] = words[i][j - 1];
          words[i][j - 1] = temp;
        }
      }
    }
    String finalText = "";
    for (int i = 0; i < words.length; i++) {
      String sentence = "";
      for (int j = 0; j < words[i].length; j++) {
        if (j < words[i].length -1) {
          sentence += words[i][j] + " ";
        } else {
          sentence += words[i][j] + ". ";
          j++;
        }
      }
      finalText += sentence;
      int r = random.nextInt(3);
      finalText += randomSentences[r];
    }
    sith_text = finalText.toLowerCase();
    char character = Character.toUpperCase(sith_text.charAt(0));
    sith_text = character + sith_text.substring(1);

    for (int i = 0; i < sith_text.length(); i++) {
      if ((sith_text.charAt(i) == '.') && (i != sith_text.length() - 2)) {
        char c = Character.toUpperCase(sith_text.charAt(i + 2));
        sith_text = sith_text.substring(0, i) + ". " + c + sith_text.substring(i + 3);
      }
    }

    sith_text = sith_text.substring(0, sith_text.length()-1);

  }
  public String getSith_text() {
    return sith_text;
  }
}
