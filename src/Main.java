import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String znaczek;
        znaczek = "*";
        int dlugoscBokow = 21;
        System.out.println("Podaj z ilu * ma składać się kwadrat");
        Scanner scanner = new Scanner(System.in);
        dlugoscBokow = scanner.nextInt();
        for (int i = 1; i <= dlugoscBokow; i++) {
            for (int j = 1; j <= dlugoscBokow; j++) {
                znaczek = "   ";
                if (i == 1 || i == dlugoscBokow) znaczek = " * "; //gorny bok
                if (j == 1 || j == dlugoscBokow) znaczek = " * ";  //dolny bok
                if (j == i) znaczek = " * "; //przekatna
                if (j == dlugoscBokow - i + 1) znaczek = " * "; //druga przekatna
                System.out.print(znaczek);
                if (j == dlugoscBokow) System.out.println("\n");
            }

        }

    }
}

