public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

    int a = 1;
    byte b = 2;
    short c = 3;
    long e = 4;
    float g = 5;
    double f = 6;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(e);
    System.out.println(g);
    System.out.println(f);

        System.out.println("Задание 2");

        double a1 = 27.12;
        System.out.println(a1);
        long b1 = 987678965549L;
        System.out.println(b1);
        byte c1 = 2;
        System.out.println(c1);
        short e1 = 786;
        System.out.println(e1);
        int g1 = 569;
        System.out.println(g1);
        short f1 = -159;
        System.out.println(f1);
        short v1 = 27897;
        System.out.println(v1);
        byte n1 = 67;
        System.out.println(n1);

        System.out.println("Задание 3");

        byte LyudmilaPavlovna = 23;
        short AnnaSergeevna = 27;
        int CatherineAndreyevna = 30;
        long Threeteachers = 480;
        byte Totalstudents = (byte) (LyudmilaPavlovna + AnnaSergeevna + CatherineAndreyevna);
        long Foreachstudent = Threeteachers / Totalstudents;
        System.out.println("На каждого ученика рассчитано " + Foreachstudent + " листов бумаги");

        System.out.println("Задание 4");

        byte minutes = 2;
        short bottle = 16;
        int za20minyt = 20 / minutes * bottle;
        System.out.println( "За 20 минут машина произвела " + za20minyt + " бутылок" );
        int zasytki = (24 * 60) / minutes * bottle;
        System.out.println("За сутки машина произвела " + zasytki + " бутылок");
        int za3day = (24 * 60) * 3 / minutes * bottle;
        System.out.println("За 3 дня машина произвела " + za3day+ " бутылок");
        long permonth = (24 * 60) * 30 / minutes * bottle;
        System.out.println("За 30 дней машина произвела " + permonth+ " бутылок");

        System.out.println("Задание 5");

        byte whitepaintna1klass = 2;
        short brownpaintna1klass = 4;
        int cansforschool = 120;
        long numberofclass = 120 / (whitepaintna1klass+brownpaintna1klass);
        long whitepaint = numberofclass * whitepaintna1klass;
        long brownpaint = numberofclass * brownpaintna1klass;
        System.out.println("В школе где " + numberofclass + " классов, нужно " + whitepaint + " банок белой краски и " + brownpaint + " банок коричневой краски" );


        System.out.println("Задание 6");

        byte weightbanana = 80;
        byte weightmilk = 105;
        byte weighticecreamsundae = 100;
        byte weightegg = 70;
        byte banana = 5;
        byte milk = 2;
        byte icecreamsundae = 2;
        byte egg = 4;
        long sportsbreakfast = (banana * weightbanana) + (milk * weightmilk) + (icecreamsundae * weighticecreamsundae) + (egg * weightegg);
        System.out.println("Общий вес завтрака " + sportsbreakfast + " грамм");
        float kg = 1000L;
        float sportsbreakfastkg = sportsbreakfast / kg;
        System.out.println("Общий вес завтрака " + sportsbreakfastkg + " кг");


        System.out.println("Задание 7");

        short hayquetirar = 7000;
        short thefirstration = 250;
        short thesecondration = 500;
        long daysforthefirstration = hayquetirar / thefirstration;
        long daysforthesecondration = hayquetirar / thesecondration;
        long averagenumberofdays = (daysforthefirstration + daysforthesecondration) / 2;
        System.out.println("Если терять по 250 грамм , то нужный вес будет через " + daysforthefirstration +" дней" );
        System.out.println("Если терять по 500 грамм , то нужный вес будет через " + daysforthesecondration + " дней");
        System.out.println("Чтобы добиться результата похудения , в среднем понадобиться " + averagenumberofdays + " день");

        System.out.println("Задание 8");

        int maha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int procent = 10;
        int maha10 = maha/100*procent;
        int maha10ave = maha10 + maha;
        System.out.println("Зарплата Маши после повышения ЗП на 10% - " + maha10ave +" рублей");
        int denis10 = denis/100*procent;
        int denis10ave = denis10 + denis;
        System.out.println("Зарплата Дениса после повышения ЗП на 10% - " + denis10ave +" рублей");
        int kristina10 = kristina/100*procent;
        int kristina10ave = kristina10 + kristina;
        System.out.println("Зарплата Кристины после повышения ЗП на 10% - " + kristina10ave +" рублей");
        int maha12 = maha * 12;
        int maha12and10 = maha10ave * 12;
        int mahadifference = maha12and10 - maha12;
        System.out.println("Годовой доход Маши вырос на " + mahadifference + " рублей");
        int denis12 = denis * 12;
        int denis12and10 = denis10ave * 12;
        int denisdifference = denis12and10 - denis12;
        System.out.println("Годовой доход Дениса вырос на " + denisdifference + " рублей");
        int kristina12 = kristina * 12;
        int kristina12and10 = kristina10ave * 12;
        int kristinadifference = kristina12and10 - kristina12;
        System.out.println("Годовой доход Кристины вырос на " + kristinadifference + " рублей");









    }
}