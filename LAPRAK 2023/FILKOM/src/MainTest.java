import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("======================================");
        Manusia a = new Manusia("samsul", "10329487832", true, true);
        System.out.println(a);
        System.out.println("======================================");
        System.out.println();
        System.out.println("======================================");
        Manusia b = new Manusia("zaenab", "39443968305", false, true);
        System.out.println(b);
        System.out.println("======================================");
        System.out.println();
        System.out.println("======================================");
        Manusia c = new Manusia("Aldo", "225150401111016", true, false);
        System.out.println(c);
        System.out.println("======================================");
        System.out.println();

        System.out.println("======================================");
        MahasiswaFILKOM d = new MahasiswaFILKOM("225150401111008", 2.5, "Aldo", "225150401111016", true, false);
        System.out.println(d);
        System.out.println("======================================");
        System.out.println();

        System.out.println("======================================");
        MahasiswaFILKOM e = new MahasiswaFILKOM("225150401111008", 3.3, "Aldo", "225150401111016", true, false);
        System.out.println(e);
        System.out.println("======================================");
        System.out.println();

        System.out.println("======================================");
        MahasiswaFILKOM f = new MahasiswaFILKOM("225150401111008", 3.89, "Aldo", "225150401111016", true, false);
        System.out.println(f);
        System.out.println("======================================");
        System.out.println();

        System.out.println("======================================");
        Pekerja g = new Pekerja(1000, LocalDate.of(2021, 2, 15), 2, "zukifli", "10329487832", true, true);
        System.out.println(g);
        System.out.println("======================================");
        System.out.println();

        System.out.println("======================================");
        Pekerja h = new Pekerja(1000, LocalDate.of(2014, 3, 15), 0, "agus", "2876153453", true, true);
        System.out.println(h);
        System.out.println("======================================");
        System.out.println();

        System.out.println("======================================");
        Pekerja i = new Pekerja(1000, LocalDate.of(2003, 4, 5), 10, "jubaedah", "2876159876", false, true);
        System.out.println(i);
        System.out.println("======================================");
        System.out.println();

        Manager j = new Manager("Aldo", "1234512345", true, true, 7500, LocalDate.of(2008, 4, 1), 0, "HRD");
        System.out.println(j);
    }
}
