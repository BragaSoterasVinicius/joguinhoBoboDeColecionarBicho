public class Dungeon {


    public Dungeon(int size, String name, TeamCharacters teamCharacters) {
        Size = size;
        this.name = name;
        this.teamCharacters = teamCharacters;

    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    int Size;
    String name;

    public TeamCharacters getTeamCharacters() {
        return teamCharacters;
    }

    public void setTeamCharacters(TeamCharacters teamCharacters) {
        this.teamCharacters = teamCharacters;
    }

    TeamCharacters teamCharacters;
}
