public class App {
    public static void main(String[] args) throws Exception {
        String tekija = "Wilma";
        double luku1 = 10;
        double luku2 = 20;
        double tulo = 0;
        double erotus = 0;
        double summa = 0;
        double jako = 0;
        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.print("Ohjelman tekijä: ");
        System.out.println(tekija);
        System.out.println("Luku1-muuttujan arvo on " + luku1);
        System.out.println("Luku2-muuttujan arvo on " + luku2);
        tulo = luku1 * luku2;
        System.out.println(luku1 + "*" + luku2 + "=" + tulo);
        erotus = luku1 - luku2;
        System.out.println(luku1 + "-" + luku2 + "=" + erotus);
        summa = luku1 + luku2;
        System.out.println(luku1 + "+" + luku2 + "=" + summa);
        jako = luku1 / luku2;
        System.out.println(luku1 + "/" + luku2 + "=" + jako);
    }
}
