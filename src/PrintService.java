public class PrintService {

    public static void print(Gryffindor[] gryffindorStusents) {
        System.out.println();
        System.out.println("Количество студентов Гриффиндора: " + gryffindorStusents.length );
        System.out.println();
        for (int i = 0; i < gryffindorStusents.length; i++) {
            Gryffindor gryffindor = gryffindorStusents[i];
            System.out.println("Студент - " + gryffindor.getFullName() + ". " + "\n"
                    + "Качества студента: "
                    + " благородство - " + gryffindor.getNobility() + ", "
                    + "честь - " + gryffindor.getHonor() + ", "
                    + "храбрость - " + gryffindor.getBravery() + "." + "\n"
                    + "Сила магии студента = " + gryffindor.getMagicPower() + ". " + "\n"
                    + "Расстояние трангрессии студента = " + gryffindor.getMagicDistance() + "."
            );
            System.out.println();
        }
        System.out.println();
    }

    public static void print(Hufflepuff[] hufflepuffStudents) {
        System.out.println();
        System.out.println("Количество студентов в Пуффендуе - " + hufflepuffStudents.length);
        System.out.println();
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            Hufflepuff hufflepuff = hufflepuffStudents[i];
            System.out.println(
                    "Студент - " + hufflepuff.getFullName() + ". " + "\n"
                            + "Качества студента: "
                            + "трудолюбие - " + hufflepuff.getIndustrious() + ", "
                            + "верность - " + hufflepuff.getLoyalty() + ", "
                            + "честность - " + hufflepuff.getHonesty() + "." + "\n"
                            + "Сила магии студента = " + hufflepuff.getMagicPower() + "." + "\n"
                            + "Расстояние трангресси студента = " + hufflepuff.getMagicDistance() + "."
            );
            System.out.println();
        }

        System.out.println();
    }

    public static void print(Ravenclaw[] ravenclawStudents) {
        System.out.println();
        System.out.println("Количество студентов в Когтевране - " + ravenclawStudents.length);
        System.out.println();
        for (int i = 0; i < ravenclawStudents.length; i++) {
            Ravenclaw ravenclaw = ravenclawStudents[i];
            System.out.println(
                    "Студент - " + ravenclaw.getFullName() + ". " + "\n"
                            + "Качества студента: "
                            + "ум - " + ravenclaw.getMind() + ", "
                            + "мудрость - " + ravenclaw.getWisdom() + ", "
                            + "остроумие - " + ravenclaw.getWit() + "."
                            + "творчество - " + ravenclaw.getCreation() + "." + "\n"
                            + "Сила магии студента = " + ravenclaw.getMagicPower() + "." + "\n"
                            + "Расстояние трангресси студента = " + ravenclaw.getMagicDistance() + "."
            );
            System.out.println();
        }
        System.out.println();
    }

    public static void print(Slytherin[] slytherinStudents) {
        System.out.println();
        System.out.println("Количество студентов в Слизерине - " + slytherinStudents.length);
        System.out.println();
        for (int i = 0; i < slytherinStudents.length; i++) {
            Slytherin slytherin = slytherinStudents[i];
            System.out.println(
                    "Студент - " + slytherin.getFullName() + ". " + "\n"
                            + "Качества студента: "
                            + "хитрость - " + slytherin.getCunning() + ", "
                            + "решительность - " + slytherin.getDetermination() + ", "
                            + "амбициозность - " + slytherin.getAmbition() + "."
                            + "находчивость - " + slytherin.getResource() + "."
                            + "жажда власти - " + slytherin.getPower() + "." + "\n"
                            + "Сила магии студента = " + slytherin.getMagicPower() + "." + "\n"
                            + "Расстояние трангресси студента = " + slytherin.getMagicDistance() + "."
            );
            System.out.println();
        }
    }
}
