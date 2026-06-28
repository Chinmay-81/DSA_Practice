import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static String timeConversion(String s) {
        boolean day = false;
        String h = "";
        String hour = s.substring(0,2);
        
        if(s.contains("A")){
            day = true;
        }
        
        if(day){
            if(hour.equals("12")){
                h = "00";
            }else{
                h = hour;
            }
            
        }else {
        int timeConv = Integer.parseInt(hour);
        if (timeConv != 12) {
            timeConv += 12;
        }
        h = String.format("%02d", timeConv);
    }
        
        String conv = h + s.substring(2,8);
        return conv;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
