package dodatkowe;

public class UnsafeTeam {

    private String name;
    private String[] members;

    public UnsafeTeam(String name, String[] members) {
        this.name = name;
        this.members = members;
    }

    public String[] getMembers() {
        return this.members;
    }
}
