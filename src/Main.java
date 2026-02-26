import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ucilica u = new Ucilica();

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

        u.getGeolikovi().add(prviKrug);
        u.getGeolikovi().add(prviPravokutnik);
        u.getGeolikovi().add(prviTrokut);

        u.getGeolikovi().sort(GeometrijskiLik::compareTo);

        for (GeometrijskiLik geolikovi : u.getGeolikovi()) {
            System.out.println(geolikovi);
        }

    }
}
