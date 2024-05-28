public class Ravenclaw extends Hogwarts{
    private Quality smart;
    private Quality wisdom;
    private Quality wit;
    private Quality creativity;

    public Ravenclaw(String fullName, int transgressionRange, int magicPower, int smart, int wisdom, int wit, int creativity) {
        super(fullName, transgressionRange, magicPower);
        this.smart = new Quality("Ум", smart);
        this.wisdom = new Quality("Мудрость", wisdom);
        this.wit = new Quality("Остроумие", wit);
        this.creativity = new Quality("Творчество", creativity);
    }

    public Quality getSmart() {
        return smart;
    }

    public Quality getWisdom() {
        return wisdom;
    }

    public Quality getWit() {
        return wit;
    }

    public Quality getCreativity() {
        return creativity;
    }

    public void printQualities() {
        StringBuilder stringBuilder = new StringBuilder(getFullName() + " обладает следующими качествами: ");
        stringBuilder.append(this.getTransgressionRange().toString()).append(", ")
                .append(this.getMagicPower().toString()).append(", ")
                .append(this.smart.toString()).append(", ")
                .append(this.wisdom.toString()).append(", ")
                .append(this.wit.toString()).append(", ")
                .append(this.creativity.toString()).append(".");
        System.out.println(stringBuilder);
    }

    public static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        int sumOfQualities1 = student1.getSmart().getMeasurement()
                + student1.getWisdom().getMeasurement()
                + student1.getWit().getMeasurement()
                + student1.getCreativity().getMeasurement();
        int sumOfQualities2 = student2.getSmart().getMeasurement()
                + student2.getWisdom().getMeasurement()
                + student2.getWit().getMeasurement()
                + student2.getCreativity().getMeasurement();
        if (sumOfQualities1 == sumOfQualities2) {
            System.out.println("Студенты " + student1.getFullName() + " и " + student2.getFullName() + " эквивалентны");
        } else if (sumOfQualities1 > sumOfQualities2) {
            System.out.println(student1.getFullName() + " лучший когтевранец чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший когтевранец чем " + student1.getFullName());
        }

    }
}
