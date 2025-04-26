public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int rublesMonth = 15000;
        int total = 0;
        int i = 1;
        while (total <= 2_459_000) {
            total = total + rublesMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            i++;
        }
        System.out.println("Task 2");
        int a = 1;
        while (a <= 10) {
            System.out.printf(" %d", a);
            a++;
        }
        System.out.println();
        a = a - 1;
        for (;a > 0;a--) {
            System.out.print(" " + a);
        }
        System.out.println();
        System.out.println("Task 3");
        int countryY = 12_000_000;
        double birthRate = (double) 17/1000 * countryY;
        double deathRate = (double) 8/1000 * countryY;
        double increasePeopleInYear = birthRate - deathRate;
        int increasePeopleInYear2 = (int) increasePeopleInYear; //108000
        int totalPeopleInYear = countryY + increasePeopleInYear2;
        int year = 1;
        int total2 = 0;
        while (year < 11) {
            total2 = total2 + totalPeopleInYear;
            System.out.println("Год " + year + " , численность населения составляет " + total2);
            year++;
        }
        System.out.println("Task 4");
        double bankDeposit = 15000.;
        int month = 0;
        while (bankDeposit <= 12_000_000) {
            month++;
            bankDeposit = bankDeposit + (bankDeposit/100*7);
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, bankDeposit);
        }
        System.out.println("Task 5");
        double bankDeposit2 = 15000.;
        int month2 = 0;
        while (bankDeposit2 <= 12_000_000) {
            month2++;
            bankDeposit2 = bankDeposit2 + (bankDeposit2/100*7);
            if (month2 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month2, bankDeposit2);
            }
        }
        System.out.println("Task 6");
        double bankDeposit3 = 15000.;
        int saveMoneyYear = 9;
        int saveMoneyAllMonth = saveMoneyYear * 12;
        int month3 = 0;
        while (month3 <= saveMoneyAllMonth) {
            month3++;
            bankDeposit3 = bankDeposit3 + (bankDeposit3/100*7);
            if (month3 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month3, bankDeposit3);
            }
        }
        System.out.println("Task 7");
        int daysMonth = 31;
        int firstFriday = 2;
        while (firstFriday <= daysMonth) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday += 7;
        }
        System.out.println("Task 8");
        int nowYear = 2017;
        int lastYears = nowYear - 200;
        int nextYears = nowYear + 100;
        int cometFlyYears = 0;
        while (cometFlyYears <= nowYear) {
            cometFlyYears += 79;
            if (cometFlyYears > lastYears && cometFlyYears < nextYears) {
                System.out.println(cometFlyYears);
            }
        }

    }
}