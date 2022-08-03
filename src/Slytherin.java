public class Slytherin extends Hogwarts {//Слизерин
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    private int sumSly;

    public Slytherin(String nameStudent, int transgress, int magic, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(nameStudent, transgress, magic);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public int getSumSly() {
        sumSly = trick + determination + ambition + resourcefulness + lustForPower+ getSumMagic();
        return sumSly;
    }
}