public class Main {
    public static void main(String[] args) {
        int a = 512;
        byte b = 64;
        short c = 3072;
        long d = 32768;
        float e = 3.14F;
        double f = 9.8;
        System.out.println("Значение переменной " + "a" + " с типом " + "int" + " равно " + a );
        System.out.println("Значение переменной " + "b" + " с типом " + "byte" + " равно " + b );
        System.out.println("Значение переменной " + "c" + " с типом " + "short" + " равно " + c );
        System.out.println("Значение переменной " + "d" + " с типом " + "long" + " равно " + d );
        System.out.println("Значение переменной " + "e" + " с типом " + "float" + " равно " + e );
        System.out.println("Значение переменной " + "f" + " с типом " + "int" + " double " + f );

        float g = 27.12F;
        long h = 987678965549L;
        float i = 2.786F;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;

        byte classOne = 23;
        byte classTwo = 27;
        byte classThree = 30;
        int allPaper = 480;
        float paper =  allPaper / (classOne + classTwo + classThree);
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");

        byte bottle = 16;
        byte minute = 2;
        int bottleInMinute = bottle / minute;
        byte A = 20;
        var aA = "минут";
        int B = 24 * 60;
        var bB = "1 день";
        int C = 3 * 24 * 60;
        var cC = "3 дня";
        int D = 1 * 30 * 24 * 60;
        var dD = "1 месяц";
        int machinePerformanceA = bottleInMinute * A;
        System.out.println("За " + A + " минут машина произвела " + machinePerformanceA + " штук бутылок");
        int machinePerformanceB = bottleInMinute * B;
        System.out.println("За " + bB + " машина произвела " + machinePerformanceB + " штук бутылок");
        int machinePerformanceC = bottleInMinute * C;
        System.out.println("За " + cC + " машина произвела " + machinePerformanceC + " штук бутылок");
        int machinePerformanceD = bottleInMinute * D;
        System.out.println("За " + dD + " машина произвела " + machinePerformanceD + " штук бутылок");

        byte allBottle = 120;
        byte whiteColourPerRoom = 2;
        byte brownColourPerRoom = 4;
        int room = allBottle / (whiteColourPerRoom + brownColourPerRoom);
        int allWhiteBottle = whiteColourPerRoom * room;
        int allBrownBottle = brownColourPerRoom * room;
        System.out.println("В школе, где " + room + " классов, нужно " + allWhiteBottle + " банок белой краски и " + allBrownBottle + " банок коричневой краски");

        byte bananas = 5;
        byte oneBananaWeight = 80;
        int bananasWeight = bananas * oneBananaWeight;
        int milk = 200;
        byte oneMilkWeight = 105;
        int milkWeight = (milk / 100) * oneMilkWeight;
        byte icecream = 2;
        byte oneIcecreamWeight = 100;
        int icecreamWeight = icecream * oneIcecreamWeight;
        byte eggs = 4;
        int oneEggWeight = 70;
        int eggsWeight = eggs * oneEggWeight;
        int allWeightCoctail = bananasWeight + milkWeight + icecreamWeight + eggsWeight;
        float allWeightCoctailInKg = allWeightCoctail / 1000F;
        System.out.println("Вес вкусного протеинового коктейля для спортсмена в граммах равен " + allWeightCoctail + " грамм, или " + allWeightCoctailInKg + " килограмм");

        byte weight = 7;
        float variantA = 0.25F;
        float variantB = 0.5F;
        float weightLossVariantADays = (weight / variantA);
        float weightLossVariantBDays = (weight / variantB);
        float[] nums = {weightLossVariantADays, weightLossVariantBDays};
        float result = 0;
        for (float avgNum : nums) {
            result += avgNum;
        }
        System.out.println("Среднее время на похудение равно " + result / nums.length + " дню");

        int masha = 67760; // доход в месяц
        int denis = 83690; // доход в месяц
        int kristina = 76230; // доход в месяц

        int annualIncomeMasha = masha * 12; // доход в год
        int annualIncomeDenis = denis * 12; // доход в год
        int annualIncomeKristina = kristina * 12; // доход в год

        float salaryIncrease = 0.1F; // ап по зарплате в год (~10%)

        float afterSalaryIncreaseMasha = ((masha * salaryIncrease) + masha) * 12; // годовая зарплата после апа 10%
        float afterSalaryIncreaseDenis = ((denis * salaryIncrease) + denis) * 12; // годовая зарплата после апа 10%
        float afterSalaryIncreaseKristina = ((kristina * salaryIncrease) + kristina) * 12; // годовая зарплата после апа 10%

        float differenceAfterSalaryIncreaseMasha = afterSalaryIncreaseMasha - annualIncomeMasha; // разница по зарплате между "до" и "после" повышения
        float differenceAfterSalaryIncreaseDenis = afterSalaryIncreaseDenis - annualIncomeDenis; // разница по зарплате между "до" и "после" повышения
        float differenceAfterSalaryIncreaseKristina = afterSalaryIncreaseKristina - annualIncomeKristina; // разница по зарплате между "до" и "после" повышения

        System.out.println("Маша теперь получает " + afterSalaryIncreaseMasha + " рублей в год. Годовой доход вырос на " + differenceAfterSalaryIncreaseMasha + "рублей");
        System.out.println("Денис теперь получает " + afterSalaryIncreaseDenis + " рублей в год. Годовой доход вырос на " + differenceAfterSalaryIncreaseDenis + "рублей");
        System.out.println("Кристина теперь получает " + afterSalaryIncreaseKristina + " рублей в год. Годовой доход вырос на " + differenceAfterSalaryIncreaseKristina + "рублей");


    }
}