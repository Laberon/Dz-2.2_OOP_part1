public class Hogwarts {
    private String nameStudent;
    private int transgress;
    private int magic;
    private int sumMagic;

    public Hogwarts(String nameStudent, int transgress, int magic) {
        this.nameStudent = nameStudent;
        this.transgress = transgress;
        this.magic = magic;
    }

    public int getSumMagic() {
        sumMagic = transgress + magic;
        return sumMagic;
    }

    public void setSumMagic(int sumMagic) {
        this.sumMagic = sumMagic;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public int getTransgress() {
        return transgress;
    }

    public int getMagic() {
        return magic;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public static void getSumGryff(Gryffindor[] studentGryff) {
        if (studentGryff[1].getSumGryf() < studentGryff[0].getSumGryf()) {
            System.out.println(studentGryff[0].getNameStudent() + " лучший Гриффиндорец, чем " + studentGryff[1].getNameStudent());
        } else {
            System.out.println(studentGryff[1].getNameStudent() + " лучший Гриффиндорец, чем " + studentGryff[0].getNameStudent());
        }
    }
    public static void getSumHuff(Hufflepuff[] studentHuff) {
        if (studentHuff[1].getSumHuff() < studentHuff[0].getSumHuff()) {
            System.out.println(studentHuff[0].getNameStudent() + " лучший Пуффендуец, чем " + studentHuff[1].getNameStudent());
        } else {
            System.out.println(studentHuff[1].getNameStudent() + " лучший Пуффендуец, чем " + studentHuff[0].getNameStudent());
        }
    }
    public static void getSumSly(Slytherin[] studentSly) {
        if (studentSly[1].getSumSly() < studentSly[0].getSumSly()) {
            System.out.println(studentSly[0].getNameStudent() + " лучший Слизеринец, чем " + studentSly[1].getNameStudent());
        } else {
            System.out.println(studentSly[1].getNameStudent() + " лучший Слизеринец, чем " + studentSly[0].getNameStudent());
        }
    }
    public static void getSumRav(Ravenclaw[] studentRav) {
        if (studentRav[1].getSumRav() < studentRav[2].getSumRav()) {
            System.out.println(studentRav[2].getNameStudent() + " лучший Когтевранец, чем " + studentRav[1].getNameStudent());
        } else {
            System.out.println(studentRav[1].getNameStudent() + " лучший Когтевранец, чем " + studentRav[2].getNameStudent());
        }
    }
}