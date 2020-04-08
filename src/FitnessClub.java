import java.time.LocalTime;

public class FitnessClub implements Addtoarr {
    private String name;
    public static Subscription[] allSubs = new Subscription[100];
    public static Subscription[] toGym = new Subscription[20];
    public static Subscription[] toSwimmingPool = new Subscription[20];
    public static Subscription[] toGroupExer = new Subscription[20];
    public static String[] zones = new String[60];


    public FitnessClub(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (null != name && " " != name) {
            this.name = name;
        } else {
            System.out.println("Enter at least one character");
        }
    }

    @Override
    public void addToArr(Subscription subscription) {
        for (int i = 0; i < allSubs.length; i++) {
            if (allSubs[i] == null) {
                allSubs[i] = subscription;
                System.out.println("AWWWW");
                break;
            } else {
                continue;
            }
        }

    }

    public static void personCheck(int i, String zone) {
        Subscription subscription = allSubs[i];
        String type = subscription.getType();

        if (type.equals("Single")) {
            if (zone.equals("Swimming pool")) {
                int count = 0;
                for (int j = 0; j < toSwimmingPool.length; j++) {
                    if (toSwimmingPool[i] == null) {
                        count++;
                    } else continue;

                }
                if (count > 0) {
                    for (int b = 0; b < toSwimmingPool.length; b++) {
                        if (toSwimmingPool[b] == null) {
                            toSwimmingPool[b] = subscription;
                            System.out.println("Welcome");
                            Logger.printGoHuman(i, zone);
                            for (int j = 0; j < zones.length; j++) {
                                if (zones[j] == null){
                                    zones[j] = zone;
                                } else continue;

                            }
                            break;
                        } else {
                            continue;
                        }
                    }
                } else {
                    System.out.println("You cannot enter");
                }

            } else if (zone.equals("Gym")) {
                int count = 0;
                for (int j = 0; j < toGym.length; j++) {
                    if (toGym[i] == null) {
                        count++;
                    } else continue;

                }
                if (count > 0) {
                    for (int b = 0; b < toGym.length; b++) {
                        if (toGym[b] == null) {
                            toGym[b] = subscription;
                            System.out.println("Welcome");
                            Logger.printGoHuman(i, zone);
                            for (int j = 0; j < zones.length; j++) {
                                if (zones[j] == null){
                                    zones[j] = zone;
                                } else continue;

                            }
                            break;
                        } else {
                            continue;
                        }
                    }
                } else {
                    System.out.println("You cannot enter");
                }
            } else {
                System.out.println("You cannot enter");
            }




        } else if (type.equals("Day")) {
            if (LocalTime.now().isAfter(LocalTime.of(16, 0))) {
                System.out.println("You cannot enter");
            } else {
                if (zone.equals("Group")) {
                    int count = 0;
                    for (int j = 0; j < toGroupExer.length; j++) {
                        if (toGroupExer[i] == null) {
                            count++;
                        } else continue;
                    }
                    if (count > 0) {
                        for (int b = 0; b < toGroupExer.length; b++) {
                            if (toGroupExer[b] == null) {
                                toGroupExer[b] = subscription;
                                System.out.println("Welcome");
                                Logger.printGoHuman(i, zone);
                                for (int j = 0; j < zones.length; j++) {
                                    if (zones[j] == null){
                                        zones[j] = zone;
                                    } else continue;

                                }
                                break;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        System.out.println("You cannot enter");
                    }
                } else if (zone.equals("Gym")) {
                    int count = 0;
                    for (int j = 0; j < toGym.length; j++) {
                        if (toGym[i] == null) {
                            count++;
                        } else continue;
                    }
                    if (count > 0) {
                        for (int b = 0; b < toGym.length; b++) {
                            if (toGym[b] == null) {
                                toGym[b] = subscription;
                                System.out.println("Welcome");
                                Logger.printGoHuman(i, zone);
                                for (int j = 0; j < zones.length; j++) {
                                    if (zones[j] == null){
                                        zones[j] = zone;
                                    } else continue;

                                }
                                break;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        System.out.println("You cannot enter");
                    }

                }else {
                    System.out.println("You cannot enter");
                }
            }



        } else if (type.equals("Full")) {

            if (zone.equals("Swimming pool")) {
                int count = 0;
                for (int j = 0; j < toSwimmingPool.length; j++) {
                    if (toSwimmingPool[i] == null) {
                        count++;
                    } else continue;

                }
                if (count > 0) {
                    for (int b = 0; b < toSwimmingPool.length; b++) {
                        if (toSwimmingPool[b] == null) {
                            toSwimmingPool[b] = subscription;
                            System.out.println("Welcome");
                            Logger.printGoHuman(i, zone);
                            for (int j = 0; j < zones.length; j++) {
                                if (zones[j] == null){
                                    zones[j] = zone;
                                } else continue;

                            }
                            break;
                        } else {
                            continue;
                        }
                    }
                } else {
                    System.out.println("You cannot enter");
                }

            } else if (zone.equals("Gym")) {
                int count = 0;
                for (int j = 0; j < toGym.length; j++) {
                    if (toGym[i] == null) {
                        count++;
                    } else continue;

                }
                if (count > 0) {
                    for (int b = 0; b < toGym.length; b++) {
                        if (toGym[b] == null) {
                            toGym[b] = subscription;
                            System.out.println("Welcome");
                            Logger.printGoHuman(i, zone);
                            for (int j = 0; j < zones.length; j++) {
                                if (zones[j] == null){
                                    zones[j] = zone;
                                } else continue;

                            }
                            break;
                        } else {
                            continue;
                        }
                    }
                } else {
                    System.out.println("You cannot enter");
                }
            } else if (zone.equals("Group")) {
                int count = 0;
                for (int j = 0; j < toGroupExer.length; j++) {
                    if (toGroupExer[i] == null) {
                        count++;
                    } else continue;

                }
                if (count > 0) {
                    for (int b = 0; b < toGroupExer.length; b++) {
                        if (toGroupExer[b] == null) {
                            toGroupExer[b] = subscription;
                            System.out.println("Welcome");
                            Logger.printGoHuman(i, zone);
                            for (int j = 0; j < zones.length; j++) {
                                if (zones[j] == null){
                                    zones[j] = zone;
                                } else continue;

                            }
                            break;
                        } else {
                            continue;
                        }
                    }
                } else {
                    System.out.println("You cannot enter");
                }
            }
        }
    }

    /*public static void personCheckOut(int b){
        if ("Swimming pool".equals(zones[b])){
            for (int i = 0; i < toSwimmingPool.length ; i++) {
                if (toSwimmingPool[i].equals(allSubs[b])){
                    toSwimmingPool[i] = null;
                    System.out.println("Human is out");
                } else {
                    continue;
                }
            }
        } else if ("Gym".equals(zones[b])){
            for (int i = 0; i < toGym.length ; i++) {
                if (toGym[i].equals(allSubs[b])){
                    toGym[i] = null;
                    System.out.println("Human is out");
                } else {
                    continue;
                }
            }
        } else {
            for (int i = 0; i < toGroupExer.length ; i++) {
                if (toGroupExer[i].equals(allSubs[b])){
                    toGroupExer[i] = null;
                    System.out.println("Human is out");
                } else {
                    continue;
                }
            }

        }
    }*/
    public void theEnd(){
        if (LocalTime.now().isBefore(LocalTime.of(22, 00))){
            System.out.println("The club can not be closed");
        } else {
            System.out.println("Fitness club is closing");
            for (int i = 0; i < toGroupExer.length ; i++) {
                toGroupExer[i] = null;
            }
            for (int i = 0; i < toGym.length ; i++) {
                toGym[i] = null;
            }
            for (int i = 0; i < toSwimmingPool.length ; i++) {
                toSwimmingPool[i] = null;
            }
            System.out.println("Waiting for you tomorrow");
        }
    }
}
