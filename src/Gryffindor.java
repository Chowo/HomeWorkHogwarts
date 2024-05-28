public class Gryffindor extends Hogwarts {

    private Quality nobility;
    private Quality honor;
    private Quality bravery;

    public Gryffindor(String fullName, int transgressionRange, int magicPower, int nobility, int honor, int bravery) {
        super(fullName, transgressionRange, magicPower);
        this.nobility = new Quality("Благородство", nobility);
        this.honor = new Quality("Честь", honor);
        this.bravery = new Quality("Храбрость", bravery);
    }


    public Quality getNobility() {
        return nobility;
    }

    public Quality getHonor() {
        return honor;
    }

    public Quality getBravery() {
        return bravery;
    }

    public void printQualities() {
        StringBuilder stringBuilder = new StringBuilder(getFullName() + " обладает следующими качествами: ");
        stringBuilder.append(this.getTransgressionRange().toString()).append(", ")
                .append(this.getMagicPower().toString()).append(", ")
                .append(this.nobility.toString()).append(", ")
                .append(this.honor.toString()).append(", ")
                .append(this.bravery.toString()).append(".");
        System.out.println(stringBuilder);
    }

    public static void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        int sumOfQualities1 = student1.getNobility().getMeasurement()
                + student1.getHonor().getMeasurement()
                + student1.getBravery().getMeasurement();
        int sumOfQualities2 = student2.getNobility().getMeasurement()
                + student2.getHonor().getMeasurement()
                + student2.getBravery().getMeasurement();
        if (sumOfQualities1 == sumOfQualities2) {
            System.out.println("Студенты " + student1.getFullName() + " и " + student2.getFullName() + " эквивалентны");
        } else if (sumOfQualities1 > sumOfQualities2) {
            System.out.println(student1.getFullName() + " лучший гриффиндорец чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший гриффиндорец чем " + student1.getFullName());
        }

    }

}
