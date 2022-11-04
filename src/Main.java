public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");
        byte variableOne = 1;
        System.out.println("Значение переменной variableOne с типом byte равно " + variableOne);
        short variableTwo = 1;
        System.out.println("Значение переменной variableTwo с типом short равно " + variableTwo);
        int variableThree = 1;
        System.out.println("Значение переменной variableThree с типом int равно " + variableThree);
        long variableFour = 1L;
        System.out.println("Значение переменной variableFour с типом long равно " + variableFour);
        float variableFive = 1.1f;
        System.out.println("Значение переменной variableFive с типом  float равно " + variableFive);
        double variableSix = 1.1;
        System.out.println("Значение переменной variableSix с типом  double равно " + variableSix);
//        В задании указано "Объявите переменные типа int, byte, short, long, float, double"
//        Я дополнительно объявил еще 2 переменные типа char и boolean.
        boolean variableSeven = true;
        System.out.println("Значение переменной variableSeven с типом boolean равно " + variableSeven);
        char variableEight = 1;
        System.out.println("Значение переменной variableEight с типом char равно " + variableEight);

        System.out.println("Задача № 2");
        float varOne = 27.12f;
        System.out.println("Значение переменной varOne с типом  float равно " + varOne);
        long varTwo = 987678965549L;
        System.out.println("Значение переменной varTwo с типом long равно " + varTwo);
        double varThree = 2.786;
        System.out.println("Значение переменной varThree с типом double равно " + varThree);
        boolean varFour = false;
        System.out.println("Значение переменной varFour с типом Boolean равно " + varFour);
        char varFive = 569;
        System.out.println("Значение переменной varFive с типом char равно " + varFive);
        short varSix = -159;
        System.out.println("Значение переменной varSix с типом short равно " + varSix);
        int varSeven = 27897;
        System.out.println("Значение переменной varSeven с типом int равно " + varSeven);
        byte varEight = 67;
        System.out.println("Значение переменной varEight с типом byte равно " + varEight);

        System.out.println("Задача № 3");
        byte totalStudentLudmilaP = 23;
        byte totalStudentAnnaS = 27;
        byte totalStudentEkaterinaA = 30;
        short totalPaper = 480;
        int toEachStudent = totalPaper / (totalStudentLudmilaP + totalStudentAnnaS + totalStudentEkaterinaA);
        System.out.println("На каждого ученика рассчитано " + toEachStudent + " листов бумаги");

        System.out.println("Задача № 4");
        byte bottlesPer2min = 16;
        short bottlesPer20min = 16 * 10;
        System.out.println("За 20 минут машины произвели бутылок " + bottlesPer20min + " штук");
        int bottlesPerDay = bottlesPer2min * 720;
        System.out.println("За сутки машины произвели бутылок " + bottlesPerDay + " штук");
        int bottlesPer3Day = bottlesPerDay * 3;
        System.out.println("За 3 суток машины произвели бутылок " + bottlesPer3Day + " штук");
        int bottlesPerMonth = bottlesPer3Day * 10;
        System.out.println("За месяц машины произвели бутылок " + bottlesPerMonth + " штук");

        System.out.println("Задача № 5");
        byte cansOfPaint = 120;
        byte cansOfWhitePaintPerClass = 2;
        byte cansOfBrownPaintPerClass = 4;
        int cansOfWhiteAndBrownPaintPerClass = cansOfWhitePaintPerClass + cansOfBrownPaintPerClass;
        int classesAtSchool = cansOfPaint / cansOfWhiteAndBrownPaintPerClass;
        int cansOfWhitePaintPerSchool = cansOfWhitePaintPerClass * classesAtSchool;
        int cansOfBrownPaintPerSchool = cansOfBrownPaintPerClass * classesAtSchool;
        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + cansOfWhitePaintPerSchool + " банок белой краски и " + cansOfBrownPaintPerSchool + " банок коричневой краски");

        System.out.println("Задача № 6");
        short bananaWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;
        int weightOfProductsInGram = bananaWeight + milkWeight + iceCreamWeight + eggsWeight;
        float weightOfProductsInKiloGram = weightOfProductsInGram / 1000f;
        System.out.println("Вес продутов в килограммах равен " + weightOfProductsInKiloGram + " кг.");

        System.out.println("Задача № 7");
        byte needToLoseWeightKg = 7;
        short diet1LoseWeightPerDayGm = 250;
        short diet2LoseWeightPerDayGm = 500;
        int needToLoseWeightGm = needToLoseWeightKg * 1000;
        int daysToLoseWeightDiet1 = needToLoseWeightGm / diet1LoseWeightPerDayGm;
        int daysToLoseWeightDiet2 = needToLoseWeightGm / diet2LoseWeightPerDayGm;
        int averageOfWeightLoss = (daysToLoseWeightDiet1 + daysToLoseWeightDiet2) / 2;
        System.out.println("Если спортсмен будет терять каждый день по " + diet1LoseWeightPerDayGm + " грамм, то потребуется " + daysToLoseWeightDiet1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по " + diet2LoseWeightPerDayGm + " грамм, то потребуется " + daysToLoseWeightDiet2 + " дней");
        System.out.println("В среднем, чтобы добиться результата похудения потребуется " + averageOfWeightLoss + " дней");

        System.out.println("Задача № 8");
        int MashaMonthlySalary = 67760;
        int DenisMonthlySalary = 83690;
        int KristinaMonthlySalary = 76230;
        int MashaYearSalary = MashaMonthlySalary * 12;
        int DenisYearSalary = DenisMonthlySalary * 12;
        int KristinaYearSalary = KristinaMonthlySalary * 12;
        float MashaTotalSalaryIncreaseMonthly = MashaMonthlySalary * 0.1f + MashaMonthlySalary;
        float DenisTotalSalaryIncreaseMonthly = DenisMonthlySalary * 0.1f + DenisMonthlySalary;
        float KristinaTotalSalaryIncreaseMonthly = KristinaMonthlySalary * 0.1f + KristinaMonthlySalary;
        float MashaSalaryIncreaseYear = MashaTotalSalaryIncreaseMonthly * 12 - MashaYearSalary;
        float DenisSalaryIncreaseYear = DenisTotalSalaryIncreaseMonthly * 12 - DenisYearSalary;
        float KristinaSalaryIncreaseYear = KristinaTotalSalaryIncreaseMonthly * 12 - KristinaYearSalary;
        System.out.println("Маша теперь получает " + MashaTotalSalaryIncreaseMonthly + " рублей. Годовой доход вырос на " + MashaSalaryIncreaseYear + " рублей");
        System.out.println("Денис теперь получает " + DenisTotalSalaryIncreaseMonthly + " рублей. Годовой доход вырос на " + DenisSalaryIncreaseYear + " рублей");
        System.out.println("Кристина теперь получает " + KristinaTotalSalaryIncreaseMonthly + " рублей. Годовой доход вырос на " + KristinaSalaryIncreaseYear + " рублей");
    }
}