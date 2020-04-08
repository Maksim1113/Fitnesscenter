import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Subscription {
    private LocalDateTime registration;
    private LocalDateTime end;
    private String nameOwner;
    private String surnameOwner;
    private LocalDate birthday;
    private String type;

    public LocalDateTime getRegistration() {
        return registration;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "registration=" + registration +
                ", end=" + end +
                ", nameOwner='" + nameOwner + '\'' +
                ", surnameOwner='" + surnameOwner + '\'' +
                ", birthday=" + birthday +
                ", type='" + type + '\'' +
                '}';
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public String getSurnameOwner() {
        return surnameOwner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Subscription(Human human, String type, LocalDateTime registration, LocalDateTime end) {
        this.nameOwner = human.getNameHuman();
        this.surnameOwner = human.getSurnameHuman();
        this.birthday = human.getBirthday();
        this.registration = registration;
        this.end = end;
        setType(type);

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public static Subscription getSub (Human human, String type){
        Subscription subscription = null;
        if ("Single".equals(type)){
            LocalDateTime register = LocalDateTime.now();
            LocalDateTime end = LocalDateTime.of(register.getYear(), register.getMonth(), register.getDayOfMonth(), 22, 00);
            subscription = new Single(human, type, register, end);
        } else if ("Day".equals(type)){
            LocalDateTime register = LocalDateTime.now();
            LocalDateTime ye = register.plusYears(1);
            LocalDateTime end = LocalDateTime.of(ye.getYear(), ye.getMonth(), ye.getDayOfMonth(), 22, 00);
            subscription = new Single(human, type, register, end);
        } else if ("Full".equals(type)){
            LocalDateTime register = LocalDateTime.now();
            LocalDateTime ye = register.plusYears(1);
            LocalDateTime end = LocalDateTime.of(ye.getYear(), ye.getMonth(), ye.getDayOfMonth(), 22, 00);
            subscription = new Single(human, type, register, end);
        }

        return subscription;
    }


}


