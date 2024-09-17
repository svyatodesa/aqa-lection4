import java.util.Scanner;
/** Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).*/
public class InDegree {
    public static int indegree(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ведіть число");
        int a = in.nextInt();
        System.out.println("Ведіть степінь числа");
        int b = in.nextInt();
        System.out.println("число  "+ a + " в степені "+ b + " : "+(int) Math.pow(a,b));
        return (int)Math.pow(a,b);

    }
}
