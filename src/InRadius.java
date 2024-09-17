import java.util.Scanner;
/** метод який буде передавати як аргумент висоту та радіус взяте з консолі*/
public class InRadius {
    public static double inradius(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ведіть радіус");
        double a = in.nextDouble();
        System.out.println("Ведіть Висоту");
        double b = in.nextDouble();
        System.out.println("об'єм дорівнюе :"+a * b);
        return a * b;

    }

}
