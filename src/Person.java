public class Person {
    String name;
    int yearOfBerth;

    String town;
    String jobTitle;

    public Person(String name, int yearOfBerth, String town, String jobTitle) {
        this.name = name;
        this.yearOfBerth = yearOfBerth;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Привет, меня зовут " +
                name +
                ", родился в " + yearOfBerth +
                ", я из города " + town +
                ". Моя должность " + jobTitle +
                ". Будем знакомы!";


    }

    void getInfoPerson() {
        System.out.println("Привет, меня зовут " + name + ", я из города " + town + ", родился в " + yearOfBerth + ". Будем знакомы!");
    }
}
