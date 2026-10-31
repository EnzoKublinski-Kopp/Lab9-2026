import java.util.Arrays;
/**
 * A class that provides various methods for an integer array to analyze the array, and produce results based on its contents.
 *
 * @author Enzo Kublinski-Kopp
 * @version v1.0
 * @since 10/31/2026
 */
public class ArrayMethods
{
    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * Counts the number of values in the array
     *
     * @return The number of values in the array.
     */
    public int count()
    {
        int count = 0;
        for (int val : myArray) {
            count++;
        }
        return count;
    }
    
    /**
     * Calculates and returns the sum of all values in the array.
     *
     * @return The sum of the array values.
     */
    public int sum()
    {
        int sum = 0;
        for (int val : myArray) {
            sum += val;
        }
        return sum;
    }
    
    /**
     * Calculates and returns the average of the array elements as a double.
     *
     * @return The average of the values.
     */
    public double average()
    {
        double average;
        int count = 0;
        int sum = 0;
        for (int val : myArray) {
            sum += val;
            count++;
        }
        average = (double)sum/count;
        return average;
    }
    
    /**
     * Finds and returns the maximum value in the array.
     *
     * @return The largest integer in the array.
     */
    public int findMax()
    {
        int max = myArray[0];
    for (int i = 0; i < myArray.length; i++)
        {
            if (myArray[i] > max)
            max = myArray[i];
        }
        return max;
    }
    
    /**
     * Finds and returns the index of the largest value in the array.
     *
     * @return The index of the largest integer.
     */
    public int findIndexOfMax()
    {
        int max = myArray[0];
        int indexOfMax = 0;
        for (int i = 0; i < myArray.length; i++)
        {
            if (myArray[i] > max)
            {
            max = myArray[i];
            indexOfMax = i;
            }
        }
        return indexOfMax;
    }
    
    /**
     * Prints a formatted int array.
     *
     * @param inArray int array to print
     */
    public void print(int[] inArray)
    {
        System.out.print("{");
        int i;
        // print elements before the last, separated by commas
        for (i = 0; i < inArray.length - 1; i++)
        System.out.print(inArray[i] + ", ");
        // print last element. Careful here to handle length 0
        if (inArray.length > 0)
        System.out.print(inArray[i]);
        System.out.println("}");
    }
}