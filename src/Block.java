import java.util.Arrays;
public class Block {
    private int[] numbers;

    public Block(int[] numbers){
        this.numbers = numbers;
    }

    public Block (int numNumbers) {
        if (numNumbers < 6) {
            numNumbers = 6;
        }
        if (numNumbers > 49) {
            numNumbers = 49;
        }
         numbers = new int[numNumbers];
         int notRepeatedNumbers = 0;
         while (notRepeatedNumbers < numNumbers) {
             int n = (int) (Math.random() * 49) + 1;
             boolean repeated = false;
             for (int i = 0; i < notRepeatedNumbers; i++) {
                 if (numbers[i] == n) {
                     repeated = true;
                     break;
                 }
             }
             if (!repeated) {
                 numbers[notRepeatedNumbers] = n;
                 notRepeatedNumbers++;
             }
         }
         Arrays.sort(numbers);
    }

    @Override
    public String toString() {
        boolean first = true;
        String s = "";
        for (int i = 0; i < numbers.length; i++) {
            if (first) {
                s += numbers[i];
                first = false;
            } else {
                s += "," + numbers[i];
            }
        }
        return s;
    }


    public int[] getNumbers() {
        return numbers;
    }


}
