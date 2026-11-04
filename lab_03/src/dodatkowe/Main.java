package dodatkowe;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] people = {"Anna", "Jan", "Maria"};
        UnsafeTeam unsafe = new UnsafeTeam("Java Team", people);
        people[0] = "HACKED";
        String[] received = unsafe.getMembers();
        received[1] = "CHANGED";
        System.out.println("UnsafeTeam: " + Arrays.toString(unsafe.getMembers()));

        String[] people2 = {"Anna", "Jan", "Maria"};
        Team team = new Team("Java Team", people2);
        people2[0] = "HACKED";
        String[] received2 = team.getMembers();
        received2[1] = "CHANGED";
        System.out.println("Team:       " + Arrays.toString(team.getMembers()));
    }
}
