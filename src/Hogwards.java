public class Hogwards {
    public static void main(String[] args) {
        Gryffindor[] gryffindorStudents = {
                new Gryffindor("Гермиона Грейнджер", 10, 15, 8, 80, 30),
                new Gryffindor("Рон Уизли", 8, 13, 4, 47, 62),
                new Gryffindor("Гарри Поттер", 30, 47, 57, 68, 89),
        };

        Hufflepuff[] hufflepuffStudents = {
                new Hufflepuff("Захария Смит", 13, 2, 42, 12, 15),
                new Hufflepuff("Седриг Диггори", 56, 34, 12, 45, 56),
                new Hufflepuff("Джастин Финч-Флетчли", 34, 12, 78, 59, 4),
        };

        Ravenclaw[] ravenclawStudents = {
                new Ravenclaw("Чжоу Чанг", 13, 2, 0, 0, 12, 4),
                new Ravenclaw("Падма Патил", 56, 34, 23, 78, 12, 67),
                new Ravenclaw("Маркус Белби", 45, 98, 12, 43, 5, 7),
        };

        Slytherin[] slytherinStudents = {
                new Slytherin("Драко Малфой", 23, 5, 64, 34, 25, 87, 92),
                new Slytherin("Грэхэм Монтегю", 23, 54, 76, 12, 35, 89, 34),
                new Slytherin("Грегори Гойл", 23, 56, 34, 90, 12, 34, 23),
        };

        PrintService printService = new PrintService();
        PrintService.print(gryffindorStudents);
        System.out.println(comparisonGryffindorStudents(gryffindorStudents));
        PrintService.print(hufflepuffStudents);
        System.out.println(comparisonHufflepuffStudents(hufflepuffStudents));
        PrintService.print(ravenclawStudents);
        System.out.println(comparisonRavenclawStudents(ravenclawStudents));
        PrintService.print(slytherinStudents);
        System.out.println(comparisonSlytherinStudents(slytherinStudents));
        System.out.println(comparisonMagicPower(gryffindorStudents,hufflepuffStudents,ravenclawStudents,slytherinStudents));
    }

    public static int comparisonGryffindorStudents(Gryffindor[] gryffindorStudents) {
        int totalPointsGryffindorStudents = 0;
        int sumPointsGryffindorStudents = 0;
        System.out.println("Баллы Гриффиндора:");
        for (int i = 0; i < gryffindorStudents.length; i++) {
            totalPointsGryffindorStudents = (gryffindorStudents[i].getBravery() + gryffindorStudents[i].getHonor() + gryffindorStudents[i].getNobility());
            System.out.println("Студент: " + gryffindorStudents[i] + ". Сумма баллов: " + totalPointsGryffindorStudents);
            sumPointsGryffindorStudents += totalPointsGryffindorStudents;
        }
        int gryffindorStudent0 = gryffindorStudents[0].getBravery() + gryffindorStudents[0].getNobility() + gryffindorStudents[0].getHonor();
        int gryffindorStudent1 = gryffindorStudents[1].getBravery() + gryffindorStudents[1].getNobility() + gryffindorStudents[1].getHonor();
        int gryffindorStudent2 = gryffindorStudents[2].getBravery() + gryffindorStudents[2].getNobility() + gryffindorStudents[2].getHonor();

        if (gryffindorStudent0 > gryffindorStudent1 && gryffindorStudent0 > gryffindorStudent2) {
            System.out.println("Лучший студент курса -  " + gryffindorStudents[0] );
        } else if (gryffindorStudent1 > gryffindorStudent0 && gryffindorStudent1 > gryffindorStudent2) {
            System.out.println("Лучший студент курса -  " + gryffindorStudents[1] );
        } else if(gryffindorStudent2 > gryffindorStudent0 && gryffindorStudent2 > gryffindorStudent1) {
            System.out.println("Лучший студент курса -  " + gryffindorStudents[2] );
        } else {
            System.out.println("Нельзя определить лучшего студента на курсе");
        }
        System.out.print("Общая сумма баллов на курсе: ");
        return sumPointsGryffindorStudents;
    }

    public static int comparisonHufflepuffStudents(Hufflepuff[] hufflepuffStudents) {
        int totalPointsHufflepuffStudents = 0;
        int sumPointsHufflepuffStudents = 0;
        System.out.println("Баллы Пуффендуя:");
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            totalPointsHufflepuffStudents = (hufflepuffStudents[i].getIndustrious() + hufflepuffStudents[i].getHonesty() + hufflepuffStudents[i].getLoyalty());
            System.out.println("Студент: " + hufflepuffStudents[i] + ". Сумма баллов: " + totalPointsHufflepuffStudents);
            sumPointsHufflepuffStudents += totalPointsHufflepuffStudents;
        }

        int hufflepuffStudent0 = hufflepuffStudents[0].getHonesty() + hufflepuffStudents[0].getLoyalty() + hufflepuffStudents[0].getIndustrious();
        int hufflepuffStudent1 = hufflepuffStudents[1].getHonesty() + hufflepuffStudents[1].getLoyalty() + hufflepuffStudents[1].getIndustrious();
        int hufflepuffStudent2 = hufflepuffStudents[2].getHonesty() + hufflepuffStudents[2].getLoyalty() + hufflepuffStudents[2].getIndustrious();

        if (hufflepuffStudent0 > hufflepuffStudent1 && hufflepuffStudent0 > hufflepuffStudent2) {
            System.out.println("Лучший студент курса -  " + hufflepuffStudents[0]);
        } else if (hufflepuffStudent1 > hufflepuffStudent0 && hufflepuffStudent1 > hufflepuffStudent2) {
            System.out.println("Лучший студент курса -  " + hufflepuffStudents[1]);
        } else if (hufflepuffStudent2 > hufflepuffStudent0 && hufflepuffStudent2 > hufflepuffStudent1) {
            System.out.println("Лучший студент курса -  " + hufflepuffStudents[2]);
        } else {
            System.out.println("Нельзя определить лучшего студента на курсе");
        }
                System.out.print("Общая сумма баллов на курсе: ");
        return sumPointsHufflepuffStudents;
    }

    public static int comparisonRavenclawStudents(Ravenclaw[] ravenclawStudents) {
        int totalPointsRavenclawStudents = 0;
        int sumPointsRavenclawStudents = 0;
        System.out.println("Баллы Когтеврана:");
        for (int i = 0; i < ravenclawStudents.length; i++) {
            totalPointsRavenclawStudents = (ravenclawStudents[i].getMind() + ravenclawStudents[i].getWisdom() + ravenclawStudents[i].getWit() + ravenclawStudents[i].getCreation());
            System.out.println("Студент: " + ravenclawStudents[i] + ". Сумма баллов: " + totalPointsRavenclawStudents);
            sumPointsRavenclawStudents += totalPointsRavenclawStudents;
        }
        int ravenclawStudent0 = ravenclawStudents[0].getCreation() + ravenclawStudents[0].getWit() + ravenclawStudents[0].getMind() + ravenclawStudents[0].getWisdom();
        int ravenclawStudent1 = ravenclawStudents[1].getCreation() + ravenclawStudents[1].getWit() + ravenclawStudents[1].getMind() + ravenclawStudents[1].getWisdom();
        int ravenclawStudent2 = ravenclawStudents[2].getCreation() + ravenclawStudents[2].getWit() + ravenclawStudents[2].getMind() + ravenclawStudents[2].getWisdom();

        if (ravenclawStudent0 > ravenclawStudent1 && ravenclawStudent0 > ravenclawStudent2) {
            System.out.println("Лучший студент курса -  " + ravenclawStudents[0]);
        } else if (ravenclawStudent1 >ravenclawStudent0 && ravenclawStudent1 > ravenclawStudent2) {
            System.out.println("Лучший студент курса -  " + ravenclawStudents[1]);
        } else if (ravenclawStudent2 > ravenclawStudent0 && ravenclawStudent2 > ravenclawStudent1) {
            System.out.println("Лучший студент курса -  " + ravenclawStudents[2]);
        } else {
            System.out.println("Нельзя определить лучшего студента на курсе");
        }
                System.out.print("Общая сумма баллов на курсе: ");
        return sumPointsRavenclawStudents;
    }

    public static int comparisonSlytherinStudents(Slytherin[] slytherinStudents) {
        int totalPointsSlytherinStudents = 0;
        int sumPointsSlytherinStudents = 0;
        System.out.println("Баллы Слизерина:");
        for (int i = 0; i < slytherinStudents.length; i++) {
            totalPointsSlytherinStudents = (slytherinStudents[i].getCunning() + slytherinStudents[i].getDetermination() +
                    slytherinStudents[i].getAmbition() + slytherinStudents[i].getResource() + slytherinStudents[i].getPower());
            System.out.println("Студент: " + slytherinStudents[i] + ". Сумма баллов: " + totalPointsSlytherinStudents);
            sumPointsSlytherinStudents += totalPointsSlytherinStudents;
        }

        int slytherinStudent0 = slytherinStudents[0].getAmbition() + slytherinStudents[0].getDetermination() +
                slytherinStudents[0].getResource() + slytherinStudents[0].getCunning() +slytherinStudents[0].getPower();

        int slytherinStudent1 = slytherinStudents[1].getAmbition() + slytherinStudents[1].getDetermination() +
                slytherinStudents[1].getResource() + slytherinStudents[1].getCunning() +slytherinStudents[1].getPower();

        int slytherinStudent2 = slytherinStudents[2].getAmbition() + slytherinStudents[2].getDetermination() +
                slytherinStudents[2].getResource() + slytherinStudents[2].getCunning() +slytherinStudents[2].getPower();

        if (slytherinStudent0 > slytherinStudent1 && slytherinStudent0 > slytherinStudent2) {
            System.out.println("Лучший студент курса -  " + slytherinStudents[0]);
        } else if (slytherinStudent1 > slytherinStudent0 && slytherinStudent1 > slytherinStudent2) {
            System.out.println("Лучший студент курса -  " + slytherinStudents[1]);
        } else if (slytherinStudent2 > slytherinStudent0 && slytherinStudent2 > slytherinStudent1) {
            System.out.println("Лучший студент курса -  " + slytherinStudents[2]);
        } else {
            System.out.println("Нельзя определить лучшего студента на курсе");
        }

        System.out.print("Общая сумма баллов на курсе: ");
        return sumPointsSlytherinStudents;
    }

    public static int comparisonMagicPower(Gryffindor [] gryffindorStudents, Hufflepuff[] hufflepuffStudents, Ravenclaw[] ravenclawStudents, Slytherin[] slytherinStudent){
        int firstStudent = slytherinStudent[0].getMagicPower() + slytherinStudent[0].getMagicDistance();
        int secondStudent = hufflepuffStudents[2].getMagicPower() + hufflepuffStudents[2].getMagicDistance();

        if (firstStudent > secondStudent) {
            System.out.println( slytherinStudent[0] + " приобладает в магической силе над " + hufflepuffStudents[2] + ".");
        } else if (secondStudent > firstStudent) {
            System.out.println( hufflepuffStudents[2] + " приобладает в магической силе над " + slytherinStudent[0]+ ".");
        } else {
            System.out.println("Нет возможности выделить приобладающего в магической силе студента.");
        }
        return firstStudent ;
    }
}
