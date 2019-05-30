import java.util.Scanner;

public class Main {
    public static String gwiazdka = " * ";
    public static String spacja = "   ";

    public static void main(String[] args) {
        String znaczek;
        int dlugoscBokow = 21;
        System.out.println("Podaj z ilu * ma składać się kwadrat");
        Scanner scanner = new Scanner(System.in);
        dlugoscBokow = scanner.nextInt();
        for (int i = 1; i <= dlugoscBokow; i++) {
            for (int j = 1; j <= dlugoscBokow; j++) {
                znaczek = spacja;
                if (i == 1 || i == dlugoscBokow) znaczek = gwiazdka; //gorny bok
                if (j == 1 || j == dlugoscBokow) znaczek = gwiazdka;  //dolny bok
                if (j == i) znaczek = gwiazdka; //przekatna
                if (j == dlugoscBokow - i + 1) znaczek = gwiazdka; //druga przekatna
                System.out.print(znaczek);
                if (j == dlugoscBokow) System.out.println("\n");
            }

        }

    }
}

