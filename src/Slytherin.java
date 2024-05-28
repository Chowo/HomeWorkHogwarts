public class Slytherin extends Hogwarts{
    private Quality cunning;
    private Quality determination;
    private Quality ambition;
    private Quality resourcefulness;
    private Quality lustForPower;

    public Slytherin(String fullName, int transgressionRange, int magicPower, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, transgressionRange, magicPower);
        this.cunning = new Quality("Хитрость", cunning);
        this.determination = new Quality("Решительность", determination);
        this.ambition = new Quality("Амбициозность", ambition);
        this.resourcefulness = new Quality("Находчивость", resourcefulness);
        this.lustForPower = new Quality("Жажда власти", lustForPower);
    }


    public Quality getCunning() {
        return cunning;
    }

    public Quality getDetermination() {
        return determination;
    }

    public Quality getAmbition() {
        return ambition;
    }

    public Quality getResourcefulness() {
        return resourcefulness;
    }

    public Quality getLustForPower() {
        return lustForPower;
    }

    public void printQualities() {
        StringBuilder stringBuilder = new StringBuilder(getFullName() + " обладает следующими качествами: ");
        stringBuilder.append(this.getTransgressionRange().toString()).append(", ")
                .append(this.getMagicPower().toString()).append(", ")
                .append(this.cunning.toString()).append(", ")
                .append(this.determination.toString()).append(", ")
                .append(this.ambition.toString()).append(", ")
                .append(this.resourcefulness.toString()).append(", ")
                .append(this.lustForPower.toString()).append(".");
        System.out.println(stringBuilder);
    }

    public static void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        int sumOfQualities1 = student1.getCunning().getMeasurement()
                + student1.getDetermination().getMeasurement()
                + student1.getAmbition().getMeasurement()
                + student1.getResourcefulness().getMeasurement()
                + student1.getLustForPower().getMeasurement();
        int sumOfQualities2 = student2.getCunning().getMeasurement()
                + student2.getDetermination().getMeasurement()
                + student2.getAmbition().getMeasurement()
                + student2.getResourcefulness().getMeasurement()
                + student2.getLustForPower().getMeasurement();
        if (sumOfQualities1 == sumOfQualities2) {
            System.out.println("Студенты " + student1.getFullName() + " и " + student2.getFullName() + " эквивалентны");
        } else if (sumOfQualities1 > sumOfQualities2) {
            System.out.println(student1.getFullName() + " лучший слизеринец чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучший слизеринец чем " + student1.getFullName());
        }

    }
}
