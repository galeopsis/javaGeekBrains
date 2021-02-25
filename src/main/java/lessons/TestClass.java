package lessons;

public class TestClass {
    static int size = 3;
    static int row = size;
    static int col = size;
    static int sym_count = 0;
    static char human = 'x';
    static char ai = '0';
    static char[][] test = new char[size][size];

    public static void main(String[] args) {

        test[2][0] = human;
        test[1][1] = human;
        test[0][2] = human;

        checkEnd(human);
//        checkEnd(ai);
    }
    private static void checkEnd(char symbol) {

        if (checkWin(symbol)) {
            if (symbol == human) {
                System.out.println("Ура! Вы победили!");
            } else {
                System.out.println("Восстание близко... ИИ победил...");
            }
            System.exit(0);
        }
    }
    private static boolean checkWin(char symbol) {

        /* for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                if (test[row][col] == symbol) {
                    sym_count++;
                }
            }
        }*/

        return sym_count == size;
    }
}




