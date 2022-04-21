public class Main {
    public static void main(String[] args) {
        //Задание 1
int chicken = 1;
byte rooster = 2;
short cow  = 3;
long bull = 4L;
double water = 1.5;
float sugar = 2.5f;
boolean chickenIsAdult = chicken > 2;
char bar = 33;



         //Задание 2
        double boxer1 =78.2;
        double boxer2 =82.7;
        double totalWeight = boxer1+boxer2;
        double weightDifference = boxer2-boxer1;
       System.out.println("Общий вес="  + totalWeight+"кг");
       System.out.println("Разница в весе="  + weightDifference + "кг");


       //Задание 3
        int banana = 80;
        int totalWeightBanana = banana * 5;
        int milk = 105;
        int totalMilk = milk * 2;
        int iceCream = 100;
        int totalIceCream = iceCream * 2;
        int egg = 70;
        int totalEgg = egg * 4;
        float breakfast = totalWeightBanana+totalMilk+totalIceCream+totalEgg;
        float breakfastKg =  breakfast/1000 ;
System.out.println("Общий вес завтрака=" + breakfast + "гр");
System.out.println("Общий все завтрака="+breakfastKg+"кг");


        //Задание 4
        float result = 7;
        double weight250 = 0.25;
       double numberOfDays250 = result/weight250;
       double weight500 = 0.5;
       double numberOfDays500 = result/ weight500;
       double averageNumberOfDays = (numberOfDays250+numberOfDays500)/2;
        System.out.println("Количество дней если терять по 250гр="+numberOfDays250+"дней" );
        System.out.println("Количество дней если терять по  500гр="+numberOfDays500+"дней");
        System.out.println("Количество дней для похудения в среднем="+averageNumberOfDays+"дней");



        // Задание 5
        int MashaZp = 67760;
        float MashaNewZp= MashaZp * 1.1f;
        int DenisZp= 83690;
        float DenisNewZp = DenisZp*1.1f;
        int KristinaZp = 76230;
        float KristinaNewZp = KristinaZp*1.1f;
        float MashaDifference = MashaNewZp-MashaZp;
        float DenisDifference = DenisNewZp-DenisZp;
        float KristinaDifference = KristinaNewZp-KristinaZp;
        float MashaAnnualIncome = MashaDifference*12;
        float DenisAnnualIncome = DenisDifference*12;
        float KristinaAnnualIncome= KristinaDifference*12;

        System.out.println("Маша теперь получает"  +MashaNewZp+"рублей. Годовой доход вырос на "+MashaAnnualIncome+"рублей");
        System.out.println("Денис теперь получает"+DenisNewZp+"рублей. Годовой доход вырос на "+DenisAnnualIncome+"рублей");
        System.out.println("Кристина теперь получает"+KristinaNewZp+"рублей.Годовой доход вырос на"+KristinaAnnualIncome+"рублей");


}
}