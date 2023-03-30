import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, Comparator.comparingInt((int[] a) -> a[k]).reversed());
        return Arrays.copyOf(score, score.length);
    }
}
