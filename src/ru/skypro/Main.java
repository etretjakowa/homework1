package ru.skypro;

public class Main {

    public static void main(String[] args) {
        byte a = 1;
        short b = 28;
        int c = 15845354;
        long d = 48644648L;
        float e = 45.45464f;
        double f = 49.545646469;

        float boxerFirst = 78.2f;
        float boxerTwo = 82.7f;
        float boxerWeight = 78.2f + 82.7f;
        System.out.println("Общий вес боксёров = " + boxerWeight + " кг");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        float sportsBreakfast = (bananas + milk + iceCream + eggs) / 1000f;
        System.out.println("Вес спорт-завтрака = " + sportsBreakfast + " кг");

        int weightLoss = 7 * 1000;
        int weightLossOne = 7000 / 250;
        int weightLossTwo = 7000 / 500;
        int averageQuany = (weightLossOne + weightLossTwo) / 2;
        System.out.println("Количество дней при потери веса на 250 грамм - " + weightLossOne + " дней");
        System.out.println("Количество дней при потери веса на 500 грамм - " + weightLossTwo + " дней");
        System.out.println("Среднее количество дней - " + averageQuany + " день");

        int wagesMasha = 67_760;
        int wagesDenis = 83_690;
        int wagesChristina = 76_230;
        int percent = 10;
        float increasingCoefficient = 1 + (percent / 100f);


        int wageGrowthMasha = (int) (wagesMasha * increasingCoefficient);
        int wageGrowthDenis = (int) (wagesDenis * increasingCoefficient);
        int wageGrowthChristina = (int) (wagesChristina * increasingCoefficient);

        int annualIncomeMashaBefore = wagesMasha * 12;
        int annualIncomeDenisBefore = wagesDenis * 12;
        int annualIncomeChristinaBefore = wagesChristina * 12;

        int annualIncomeMashaАfter = wageGrowthMasha * 12;
        int annualIncomeDenisАfter = wageGrowthDenis * 12;
        int annualIncomeChristinaАfter = wageGrowthChristina * 12;

        int incomeDifferenceMasha = annualIncomeMashaАfter - annualIncomeMashaBefore;
        int incomeDifferenceDenis = annualIncomeDenisАfter - annualIncomeDenisBefore;
        int incomeDifferenceChristina = annualIncomeChristinaАfter - annualIncomeChristinaBefore;

        System.out.println("Маша теперь получает " + wageGrowthMasha + " рублей, годовой доход вырос на "
                + incomeDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + wageGrowthDenis + " рублей, годовой доход вырос на "
                + incomeDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + wageGrowthChristina + " рублей, годовой доход вырос на "
                + incomeDifferenceChristina + " рублей.");
    }
}