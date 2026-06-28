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


    public static void miniMaxSum(List<Integer> arr) {
        long minSum = 0 , maxSum = 0;
        int n = arr.size();
        Collections.sort(arr);
        
        for(int i=0 ;i<=n-2; i++){
            minSum += arr.get(i);
        }
        
        for(int i=n-1; i>0; i--){
            maxSum += arr.get(i);
        }
        
        System.out.println(minSum+" "+maxSum);

    }

}

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
