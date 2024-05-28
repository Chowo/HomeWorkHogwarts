import java.util.Random;

public class Hogwarts {
    private String fullName;
    private Quality transgressionRange;
    private Quality magicPower;

    public Hogwarts (String fullName, int transgressionRange, int magicPower) {
        this.fullName = fullName;
        this.transgressionRange = new Quality ("Дальность трансгрессии", transgressionRange);
        this.magicPower = new Quality("Сила магии", magicPower);
    }

    /*public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }*/

    public String getFullName() {
        return fullName;
    }

    public Quality getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int newTransgressionRange) {
        this.transgressionRange.setMeasurement(newTransgressionRange);
    }

    public Quality getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int newMagicPower) {
        this.magicPower.setMeasurement(newMagicPower);
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagicPower().getMeasurement() == student2.getMagicPower().getMeasurement()) {
            System.out.println(student1.getFullName() + " равен по силе магии с " + student2.getFullName());
        } else if (student1.getMagicPower().getMeasurement() > student2.getMagicPower().getMeasurement()) {
            System.out.println(student1.getFullName() + " имеет бОльшую силу магии чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " имеет бОльшую силу магии чем " + student1.getFullName());
        }

        if (student1.getTransgressionRange().getMeasurement() == student2.getTransgressionRange().getMeasurement()) {
            System.out.println(student1.getFullName() + " равен по дальноси трансгрессии с " + student2.getFullName());
        } else if (student1.getTransgressionRange().getMeasurement() > student2.getTransgressionRange().getMeasurement()) {
            System.out.println(student1.getFullName() + " может трансгрессировать дальше чем " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " может трансгрессировать дальше чем " + student1.getFullName());
        }
    }
}
