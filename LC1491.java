import java.util.Arrays;

public class LC1491 {
    public double average(int[] salary) {
        int max = Arrays.stream(salary).max().getAsInt();
        int min = Arrays.stream(salary).min().getAsInt();
        int sum = Arrays.stream(salary).sum();
        return (double) (sum - max - min) / (salary.length - 2);
    }
}
