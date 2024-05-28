public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 100, 67, 68, 79, 90);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 58, 75, 54, 74, 70);
        Gryffindor ronaldWeasley = new Gryffindor("Рон Узили", 69, 54, 54, 74, 70);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой",62, 55, 78, 63, 72, 81, 90);
        Slytherin graham = new Slytherin("Грэхэм Монтегю",52, 49, 58, 49, 80, 63, 85);
        Slytherin goyle = new Slytherin("Грегори Гойл", 49, 60, 38, 56, 65, 65, 88);

        Hufflepuff zaharySmith = new Hufflepuff( "Захария Смит", 67, 62, 75, 71, 70);
        Hufflepuff sedrick = new Hufflepuff( "Седрик Диггори", 80, 72, 85, 88, 90);
        Hufflepuff finchfletchly = new Hufflepuff("Джастин Финч-Флетчли", 60, 64, 69, 74, 82);

        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", 77, 62, 67, 54, 59, 76);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 77, 62, 67, 54, 59, 76);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 62, 71, 62, 59, 53, 71);

        harryPotter.printQualities();
        Gryffindor.compareGryffindorStudents(harryPotter, hermioneGranger);
        sedrick.printQualities();
        dracoMalfoy.printQualities();
        chang.printQualities();
        Slytherin.compareSlytherinStudents(dracoMalfoy, goyle);
        Hufflepuff.compareHufflepuffStudents(sedrick, zaharySmith);
        Ravenclaw.compareRavenclawStudents(chang, padma);
        Hogwarts.compareStudents(harryPotter, dracoMalfoy);
    }
}
