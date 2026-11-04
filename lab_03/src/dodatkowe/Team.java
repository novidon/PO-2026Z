package dodatkowe;

import java.util.Arrays;

public class Team {

    private final String name;
    private final String[] members;

    public Team(String name, String[] members) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nazwa zespołu nie może być pusta.");
        }
        if (members == null) {
            throw new IllegalArgumentException("Lista członków nie może być null.");
        }
        this.name = name;
        this.members = Arrays.copyOf(members, members.length);
    }

    public String getName() {
        return name;
    }

    public String[] getMembers() {
        return Arrays.copyOf(members, members.length);
    }
}
