import java.util.Arrays;

public class Ticket {
    private Block[] blocks;

    public Ticket(int numBlocks) {
        blocks = new Block[numBlocks];
        for (int i = 0; i < blocks.length; i++) {
            blocks[i] = new Block(6);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < blocks.length; i++) {
            s += blocks[i] +"\n";
        }
        return s;
    }

    public void printUsedNumbers() {
        boolean [] used = new boolean[50];
        for (int i = 0; i < used.length; i++) {
            used [i] = false;
        }

        for (int i = 0; i < blocks.length; i++) {
            int[] ns = blocks[i].getNumbers();
            for (int j = 0; j< ns.length; j++) {
                int number = ns[j];
                used[number]= true;
            }
        }

        boolean first = true;
        for (int i = 1; i < used.length; i ++) {
            if (used[i]) {
                if (first) {
                    System.out.print(i);
                    first = false;
                } else {
                    System.out.print(", " + i);
                }
            }
        }
    }
}

