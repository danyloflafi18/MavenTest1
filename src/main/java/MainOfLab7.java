package main.java.ua.lviv.iot;

import java.io.IOException;
import java.net.MalformedURLException;

public class MainOfLab7 {
    public static void main(final String[] args) throws MalformedURLException, IOException {
         System.out.println("Type please your text: ");
         String inputText = StringProcessor.readInputText();
         StringProcessor stringProcessor = new StringProcessor();
         System.out.println(stringProcessor.checkUrlAddress(inputText));
    }
     }