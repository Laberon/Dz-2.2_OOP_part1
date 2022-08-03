public class Gryffindor extends Hogwarts {//Гриффиндор
    private int nobility;
    private int honor;
    private int bravery;
    private int sumGryf;

    public Gryffindor(String nameStudent, int transgress, int magic,int nobility,int honor,int bravery) {
        super(nameStudent, transgress, magic);
        this.nobility=nobility;
        this.honor=honor;
        this.bravery = bravery;
    }
    public int getSumGryf() {
        sumGryf = nobility + honor + bravery+getSumMagic();
        return sumGryf;
    }
}