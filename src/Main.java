public class Main {
    public static void main(String[] args) {
        Gryffindor[] studentGryff = new Gryffindor[3];
        studentGryff[0] = new Gryffindor("Гарри Поттер", 8, 8, 12, 34, 21);
        studentGryff[1] = new Gryffindor("Гермиона Грейнджер", 9, 10, 23, 12, 45);
        studentGryff[2] = new Gryffindor("Рон Уизли", 5, 6, 12, 34, 65);
        Gryffindor.getSumGryff(studentGryff);

        Slytherin[] studentSly = new Slytherin[3];
        studentSly[0] = new Slytherin("Драко Малфой", 5, 7, 23, 12, 2, 21, 40);
        studentSly[1] = new Slytherin("Грэхэм Монтегю", 5, 5, 18, 12, 1, 15, 10);
        studentSly[2] = new Slytherin("Грегори Гойл", 5, 6, 19, 12, 1, 17, 20);
        Slytherin.getSumSly(studentSly);

        Hufflepuff[] studentHuff = new Hufflepuff[3];
        studentHuff[0] = new Hufflepuff("Захария Смит", 4, 5, 1, 19, 54);
        studentHuff[1] = new Hufflepuff("Седрик Диггори", 2, 4, 1, 20, 30);
        studentHuff[2] = new Hufflepuff("Джастин Финч-Флетчли", 6, 4, 1, 18, 20);
        Hufflepuff.getSumHuff(studentHuff);

        Ravenclaw[] studentRav = new Ravenclaw[3];
        studentRav[0] = new Ravenclaw("Чжоу Чанг", 5, 7, 9, 12, 23, 32);
        studentRav[1] = new Ravenclaw("Падма Патил", 6, 9, 19, 19, 13, 22);
        studentRav[2] = new Ravenclaw("Маркус Белби", 7, 18, 29, 13, 20, 12);
        Ravenclaw.getSumRav(studentRav);
    }
}