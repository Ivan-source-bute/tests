package org.example;

public class Zad2 {
    public static void run(boolean detailed) {
        Tester tester1 = new Tester("Иван", "Иванов");
        Tester tester2 = new Tester("Мария", "Петрова", 3);
        Tester tester3 = new Tester("Алексей", "Сидоров", 6, "Advanced", 3000.0);

        tester1.displayInfo(detailed);
        System.out.println("Уровень: " + Tester.getTesterLevel(tester1.getExperienceInYears()));

        tester2.displayInfo(detailed);
        System.out.println("Уровень: " + Tester.getTesterLevel(tester2.getExperienceInYears()));

        tester3.displayInfo(detailed);
        System.out.println("Уровень: " + Tester.getTesterLevel(tester3.getExperienceInYears()));
    }
}

