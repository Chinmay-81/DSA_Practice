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

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double neg = 0 , pos = 0 , z = 0;
        double n = arr.size();
        
        for(int i=0; i<n; i++){
            if(arr.get(i)<0){
                neg++;
            }else if(arr.get(i)>0){
                pos++;
            }else{
                z++;
            }
        }
        
        double negRatio = neg/n;
        double posRatio = pos/n;
        double zeroRatio = z/n;
        
        System.out.printf("%.6f\n",posRatio);
        System.out.printf("%.6f\n",negRatio);
        System.out.printf("%.6f\n",zeroRatio);
        
    
    }

}

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
