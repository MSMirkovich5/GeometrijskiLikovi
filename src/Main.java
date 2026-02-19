import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesite ime kruga: ");
        String imeKruga = input.nextLine();
        System.out.print("Unesite ime pravokutnika: ");
        String imePravokutnika = input.nextLine();
        System.out.print("Unesite ime trokuta: ");
        String imeTrokuta = input.nextLine();

        System.out.print("Unesite duljinu radijusa kruga: ");
        double radiusKruga = input.nextDouble();

        System.out.print("Unesite duljinu stranice A pravokutnika: ");
        double stranicaPravokutnikaA = input.nextDouble();
        System.out.print("Unesite duljinu stranice B pravokutnika: ");
        double stranicaPravokutnikaB = input.nextDouble();

        System.out.print("Unesite duljinu stranice A trokuta: ");
        double stranicaTrokutaA = input.nextDouble();
        System.out.print("Unesite duljinu stranice B trokuta: ");
        double stranicaTrokutaB = input.nextDouble();
        System.out.print("Unesite duljinu stranice C trokuta: ");
        double stranicaTrokutaC = input.nextDouble();

        Krug prviKrug = new Krug(imeKruga, radiusKruga);
        Pravokutnik prviPravokutnik = new Pravokutnik(imePravokutnika, stranicaPravokutnikaA, stranicaPravokutnikaB);
        Trokut prviTrokut = new Trokut(imeTrokuta, stranicaTrokutaA, stranicaTrokutaB, stranicaTrokutaC);
        System.out.println("Opseg kruga je: " + prviKrug.opsegKruga() + ", a površina je: " + prviKrug.povrsinaKruga());
        System.out.println("Opseg pravokutnika je: " + prviPravokutnik.opsegPravokutnika() + ", a površina je: " + prviPravokutnik.povrsinaPravokutnika());
        System.out.println("Opseg trokuta je: " + prviTrokut.opsegTrokuta() + ", a površina je: " + prviTrokut.povrsinaTrokuta());

    }
}
