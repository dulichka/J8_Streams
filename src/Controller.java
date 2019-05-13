import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
    Model model = new Model();

    public void processUser(){
        int[] array = {6, -7, -1, 3, -5, 0, 2, -3, 1, 9};
        int multiplier = 7;
        model.setArray(array);
        System.out.println("Initial array:" + Arrays.toString(model.getArray()));
        System.out.println("Average: " + model.average());
        System.out.println("Minimum: " + model.min());
        System.out.println("Equal zero elements amount: " + model.zeroQuantity());
        System.out.println("More than zero elements amount: " + model.positiveQuantity());
        System.out.println("Multiplied on " + multiplier + ": " + Arrays.toString(model.multiply(multiplier)));
    }
}
