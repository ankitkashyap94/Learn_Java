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
     * Complete the 'Multiplyarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY intinputarr as parameter.
     */

    public static List<Integer> Multiplyarray(List<Integer> intinputarr) {
        int n = intinputarr.size();
        List<Integer> result = new ArrayList<>(Collections.nCopies(n, 1));

        // Calculate the product of elements to the left of each index
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result.set(i, leftProduct);
            leftProduct *= intinputarr.get(i);
        }

        // Calculate the product of elements to the right of each index
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result.set(i, result.get(i) * rightProduct);
            rightProduct *= intinputarr.get(i);
        }

        return result;
    }

}



public class MultiplyArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int intinputarrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> intinputarr = IntStream.range(0, intinputarrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.Multiplyarray(intinputarr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
