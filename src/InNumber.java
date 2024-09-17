import java.util.Scanner;
/** метод який буде передавати як аргумент число взяте з консолі*/
public class InNumber {
    public static int innumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("введіть ціле число :");
        int num = in.nextInt();

        return  num;
    }

}
