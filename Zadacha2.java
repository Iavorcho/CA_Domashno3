//Калкулус за начинаещи
// Все още не зная точно по какъв начин работи скенера, но това не пречи да го ползваме.
import java.util.Scanner;
public class Zadacha2 {
    public static void main(String[] args) {
        System.out.printf("Помните ли основните аритметични операции? %nНе, ще ви помогнем!%n%nПърви урок, събиране.%nВъведете едно след друго две числа%n");
        System.out.println("Въведете първото число: ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        System.out.println("Въведете второто число: ");
        Scanner sc2 = new Scanner(System.in);
        int inputNumber2 = sc2.nextInt();
        System.out.println("Сборът на двете числа е: "+(inputNumber+inputNumber2) );

    }
}