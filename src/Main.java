import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] arr = {5,3,4,9};
        int [] arrs = arr;

        arr[0] = 15;
        System.out.println(Arrays.toString(arrs));
    }
}