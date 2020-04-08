import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FitnessClub fitnessClub = new FitnessClub("Khaustov club");

        Human human1 = new Human("Vasia", "Ivanov", LocalDate.of(1987, 10, 4));
        Human human2 = new Human("Kiril", "Porter", LocalDate.of(1980, 3, 21));
        Human human3 = new Human("Igor", "Ivanov", LocalDate.of(2000,3, 12));
        Subscription subscription = human1.canBuy();
        Subscription subscription1 = human2.canBuy();
        Subscription subscription2 = human3.canBuy();

        fitnessClub.addToArr(subscription);
        fitnessClub.addToArr(subscription1);
        fitnessClub.addToArr(subscription2);


       human2.canGoTo("Gym");
       human1.canGoTo("Swimming pool");
       human3.canGoTo("Swimming pool");

       Logger.humanPrint();


       fitnessClub.theEnd();
    }
}
