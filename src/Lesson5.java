public class Lesson5 {
    public static void main(String[] args) {
        System.out.println("Lesson 5");

        char[][] charsTable = new char[5][5];

        char charForTable = 'a';

        for (int x=0; x<5; x++) {
            for (int y=0; y<5; y++) {
                charsTable[x][y] = charForTable;
                charForTable++;
            }
        }

        for (int x=0; x<5; x++) {
            for (int y=0; y<5; y++) {
                System.out.println(charsTable[x][y]+" ");
            }
            System.out.println("\n");
        }
    }
}
