public class Hufflepuff extends Hogwarts {//Пуффендуй
    private int hardworking;
    private int loyalty;
    private int honesty;
    private int sumHuff;

    public Hufflepuff(String nameStudent, int transgress, int magic,int hardworking,int loyalty,int honesty) {
        super(nameStudent, transgress, magic);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int getSumHuff() {
        sumHuff = hardworking+loyalty+honesty+getSumMagic();
        return sumHuff;
    }
}