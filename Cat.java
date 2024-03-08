public class Cat extends Animal {
    private General general;

    public Cat(int age, String name, Color color, General general) {
        super(age, name, color);
        this.general = general;
    }

    public General getGeneral() {
        return general;
    }

    public final void catsActions() {
        System.out.println("Кошка прыгает");
    }

    public void catsActions(String place) {
        System.out.println("Кошка гуляет" + place);
    }

    public String getInfo() {
        return "Age: " + getAge() +
                "\nName: " + getName() +
                "\nColor: " + getColor() +
                "\nBreed: " + general.getBreed() +
                "\nActions: " + general.getHobby();
    }
}
