import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Model {
    private int[] array;

    public Model(){
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public OptionalDouble average(){
        return Arrays.stream(array).average();
    }

    public OptionalInt min(){
        return Arrays.stream(array).min();
    }

    public int zeroQuantity(){
        return (int) Arrays.stream(array).filter(n -> n == 0).count();
    }

    public int positiveQuantity(){
        return (int) Arrays.stream(array).filter(n -> n > 0).count();
    }

    public int[] multiply(int multiplier){
        return Arrays.stream(array).map(n -> n * multiplier).toArray();
    }
}
