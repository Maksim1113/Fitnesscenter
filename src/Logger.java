import java.time.LocalTime;

public class Logger {
    public static void humanPrint(){
        System.out.println("Gym visitors:");
        for (int i = 0; i < FitnessClub.toGym.length ; i++) {
            if (FitnessClub.toGym[i] != null){
                System.out.println(FitnessClub.toGym[i].getSurnameOwner());
                System.out.println(FitnessClub.toGym[i].getNameOwner());
            } else {
                System.out.println("No one else");
                break;
            }
            
        }
        System.out.println("Swimming pool visitors:");
        for (int i = 0; i < FitnessClub.toSwimmingPool.length ; i++) {
            if (FitnessClub.toSwimmingPool[i] != null){
                System.out.println(FitnessClub.toSwimmingPool[i].getSurnameOwner());
                System.out.println(FitnessClub.toSwimmingPool[i].getNameOwner());
            } else {
                System.out.println("No one else");
                break;
            }

        }
        System.out.println("Group visitors:");
        for (int i = 0; i < FitnessClub.toGroupExer.length ; i++) {
            if (FitnessClub.toGroupExer[i] != null){
                System.out.println(FitnessClub.toGroupExer[i].getSurnameOwner());
                System.out.println(FitnessClub.toGroupExer[i].getNameOwner());
            } else {
                System.out.println("No one else");
                break;
            }

        }
    }

    public static void printGoHuman(int i, String zone){
        System.out.println(Human.humans[i].getSurnameHuman() + Human.humans[i].getNameHuman());
        System.out.println(zone);
        System.out.println(LocalTime.now());

    }
}
