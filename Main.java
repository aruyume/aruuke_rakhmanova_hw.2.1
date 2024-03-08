public class Main {
    public static void main(String[] args) {
        General general = new General("Siamese cat", "Sleep");
        Cat cat = new Cat(10, "Rixy", Color.BLACK, general);
        System.out.println(cat.getInfo());
        cat.catsActions();
        cat.catsActions(" по парку");

        System.out.println();
        General general1 = new General("Persian cat", "Playing");
        Kitty kitty = new Kitty(2, "Remi", Color.GREY, general1, "Calm");
        System.out.println(kitty.getInfo());
        kitty.catsActions(" по Америке");
    }
}