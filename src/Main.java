
import kLn.Order.ControllerOrdenacao;

public class Main {
    public static void main(String[] args) {

        ControllerOrdenacao co = new ControllerOrdenacao();

        int[] v = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};

        v = co.quickSort(v, 0, v.length - 1);

        for (int i: v) {

            System.out.print(i + " ");
        }


    }

}
