package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Unknown", 0.0);
    }
    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate", 500.0);
    }
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public void displayInfo(String prefix) {
        System.out.println(prefix + name + " " + surname);
    }
    public void displayInfo() {
        System.out.println("Tester: " + name + " " + surname);
    }
    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println("Tester: " + name + " " + surname + ", Опыт: " + experienceInYears + " лет, Английский: " + englishLevel + ", Зарплата: $" + salary);
        } else {
            displayInfo();
        }
    }
    public static String getTesterLevel(int experience) {
        if (experience < 2) {
            return "Джуниор";
        } else if (experience < 5) {
            return "Мидл";
        } else {
            return "Сеньор";
        }
    }
    @Override
    public String toString() {
        return "Тестер{Имя='" + name + "', Фамилия='" + surname +
                "', Опыт работы=" + experienceInYears +
                ", уровень английского='" + englishLevel +
                "', зарплата =" + salary + "}";
    }


}

