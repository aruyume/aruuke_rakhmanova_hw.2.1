public final class Kitty extends Cat {
    private String character;

    public String getCharacter() {
        return character;
    }

    public Kitty(int age, String name, Color color, General general, String character) {
        super(age, name, color, general);
        this.character = character;
    }

    public Kitty(int age, String name, Color color, General general) {
        super(age, name, color, general);
    }

    public String getInfo() {
        return "Age: " + getAge() +
                "\nName: " + getName() +
                "\nColor: " + getColor() +
                "\nBreed: " + getGeneral().getBreed() +
                "\nActions: " + getGeneral().getHobby() +
                "\nCharacter: " + getCharacter();
    }
}
