package matma;
import java.util.Scanner;
/**
 * Created by Anna Kacprzak on 2016-07-20.
 */
public class Matematyk {
    public static void main (String [] args) {

        System.out.println("Podaj swoje imię");
        String imie;
        Scanner input = new Scanner(System.in);
        imie = input.nextLine();


        System.out.println(imie + " podaj dwie dowolne liczby ");
        double liczba1;
        double liczba2;
        Scanner input1 = new Scanner(System.in);
        liczba1 = input1.nextDouble();
        liczba2 = input1.nextDouble();
        System.out.println(imie + " twoje liczby to " + liczba1 + " i " + liczba2);

        double wynik = Kalkulator.dodawaj(liczba1, liczba2);
        System.out.println("Suma Twoich liczb to " + wynik );
        double wynik2 = Kalkulator.odejmuj(liczba1, liczba2);
        System.out.println ( "Wynik odejmowania Twoich liczb to " + wynik2);

        double wynik3=Kalkulator.mnoz(liczba1,liczba2);
        System.out.println("Iloczyn Twoich liczb to " + wynik3 );

        double wynik4=Kalkulator.dziel(liczba1, liczba2);
        System.out.println("Iloraz Twoich liczb to " + wynik4 );

    }


    }


