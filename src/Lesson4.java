import java.util.Arrays;

public class Lesson4 {
    public static void main (String[] args) {
        char[] chars = {'a', 'b', 'g', 'c', 'd', 'e', 'а', 'o'};
        char[] charsCopied = {'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'};
        //Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(charsCopied));
        //before binarySearch method array must be sorted
        //System.out.println(Arrays.binarySearch(chars, 'e'));
        //System.out.println(Arrays.binarySearch(chars, 's'));
        System.arraycopy(chars, 0, charsCopied, 3,  6);
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(charsCopied));
        for (int i=0; i<charsCopied.length; i++) {
            System.out.println(charsCopied[i]);
            //Thread.sleep(1200);
        }
    }
}
