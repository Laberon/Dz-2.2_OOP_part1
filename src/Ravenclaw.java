public class Ravenclaw extends Hogwarts{ //Когтевран
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;
    private int sumRav;

    public int getSumRav() {
        sumRav = smart + wise + witty + fullOfCreativity + getSumMagic();
        return sumRav;
    }
    public Ravenclaw(String nameStudent, int transgress, int magic, int smart, int wise, int witty, int fullOfCreativity) {
        super(nameStudent, transgress, magic);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }
}