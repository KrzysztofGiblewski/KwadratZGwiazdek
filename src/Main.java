public class Main {

    public static void main(String[] args) {
        String znaczek;
        znaczek = "*";

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                znaczek = "   ";
                if (i == j) znaczek = " * ";
                if (i == 1 || i == 5) znaczek = " * ";
                if (j == 1 || j == 5) znaczek = " * ";
                if (j == i || j - i == i) znaczek = " * ";
                if (i - j == j) znaczek = " * ";
//                if (j == 2 && i == 2 || j == 4 && i == 2) znaczek = " * ";
//                if (j == 3 && i == 3 || j == 3 && i == 3) znaczek = " * ";
//                if (j == 2 && i == 4 || j == 4 && i == 4) znaczek = " * ";
                System.out.print(znaczek);
                if (j == 5) System.out.println("\n");
            }

        }

    }
}

