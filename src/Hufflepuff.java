public class Hufflepuff extends Hogwarts{
    private Quality hardWork;
    private Quality loyalty;
    private Quality honesty;

    public Hufflepuff(String fullName, int transgressionRange, int magicPower, int hardWork, int loyalty, int honesty) {
        super(fullName, transgressionRange, magicPower);
        this.hardWork = new Quality("Трудолюбие", hardWork);
        this.loyalty = new Quality("Верность", loyalty);
        this.honesty = new Quality("Честность", honesty);
    }

    public Quality getHardWork() {
        return hardWork;
    }

    public Quality getLoyalty() {
        return loyalty;
    }

    public Quality getHonesty() {
        return honesty;
    }

    public void printQualities() {
        StringBuilder stringBuilder = new StringBuilder(getFullName() + " обладает следующими качествами: ");
        stringBuilder.append(this.getTransgressionRange().toString()).append(", ")
                .append(this.getMagicPower().toString()).append(", ")
                .append(this.hardWork.toString()).append(", ")
                .append(this.loyalty.toString()).append(", ")
                .append(this.honesty.toString()).append(".");
        System.out.println(stringBuilder);
    }

    public static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
        int sumOfQualities1 = student1.getHardWork().getMeasurement()
                + student1.getLoyalty().getMeasurement()
                + student1.getHonesty().getMeasurement();
        int sumOfQualities2 = student2.getHardWork().getMeasurement()
                + student2.getLoyalty().getMeasurement()
                + student2.getHonesty().getMeasurement();
        if (sumOfQualities1 == sumOfQualities2) {
            System.out.println("Студенты " + student1.getFullName() + " и " + student2.getFullName() + " эквивалентны");
        } else if (sumOfQualities1 > sumOfQualities2) {
            System.out.println(student1.getFullName() + " лучший пуффендуец чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший пуффендуец чем " + student1.getFullName());
        }

    }
}
