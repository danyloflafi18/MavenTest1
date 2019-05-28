package main.java.ua.lviv.iot;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringProcessor {

    public static String readInputText() throws IOException {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public final String checkUrlAddress(final String string)  {
        final Pattern pattern = Pattern.compile(
                "(charmes)|(hacking)|(crack)|(xxx)");
        Matcher matcher = pattern.matcher(string);
        int i = 0;
        while (matcher.find()) {
           String commentstr = string.replaceAll(matcher.group(i),"").trim();
            i++;
        }
        return string;
    }
        


    public final String showResults(final StringBuilder stringBuilder) {
        return stringBuilder.toString();
    }
}