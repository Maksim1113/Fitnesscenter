import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Human implements CanHuman{
    private String nameHuman;
    private String surnameHuman;
    private LocalDate birthday;
    public static Human[] humans = new Human[100];


    public Human(String nameHuman, String surnameHuman, LocalDate birthday) {
        setNameHuman(nameHuman);
        setSurnameHuman(surnameHuman);
        setBirthday(birthday);
        this.addTo();
    }

    public String getNameHuman() {
        return nameHuman;
    }

    public void setNameHuman(String nameHuman) {
        this.nameHuman = nameHuman;
    }

    public String getSurnameHuman() {
        return surnameHuman;
    }

    public void setSurnameHuman(String surnameHuman) {
        this.surnameHuman = surnameHuman;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void addTo(){
            for (int i = 0; i < humans.length ; i++) {
                if (humans[i] == null){
                    humans[i] = this;
                    break;
                } else {
                    continue;
                }
            }
        }

    @Override
    public Subscription canBuy() {
        LocalTime timeNow = LocalTime.now();
        if (timeNow.isAfter(LocalTime.of(22, 00))){
            System.out.println("Try again tomorrow.");
        } else if (timeNow.isBefore(LocalTime.of(8, 00))){
            long between = Duration.between(timeNow, LocalTime.of(8, 00)).toMinutes();
            System.out.println("Try in " + between + " minutes");
        } else {
            System.out.println("What kind subscription do you want?");
            Scanner in = new Scanner(System.in);
            String type = in.nextLine();
            return Subscription.getSub(this, type);
        }

        return null;
    }

    @Override
    public void canGoTo(String zone) {
        LocalTime nowTime = LocalTime.now();
        if (nowTime.isBefore(LocalTime.of(8, 0))  || (nowTime.isAfter(LocalTime.of(22, 0)))){
            System.out.println("Fitness club is closing");
        } else{
            for (int i = 0; i < humans.length; i++) {
                        Human hu = humans[i];
                        if (this.equals(hu)){

                            FitnessClub.personCheck(i, zone);
                        }else {
                            continue;
                }

            }

        }



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getNameHuman().equals(human.getNameHuman()) &&
                getSurnameHuman().equals(human.getSurnameHuman()) &&
                getBirthday().equals(human.getBirthday());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameHuman(), getSurnameHuman(), getBirthday());
    }

    @Override
    public void goOut() {
        /*for (int i = 0; i < humans.length; i++) {
            Human hu = humans[i];
            if (this.equals(hu)) {
                FitnessClub.personCheckOut(i);
                break;
            } else {
                continue;
            }
        }*/

    }

}
