import java.util.ArrayList;
import java.util.List;

public class TeamCharacters {
    ArrayList<Characters> characters = new ArrayList<>();
    public List<Characters> getCharacters() {
        return characters;
    }

    public void addCharacters(Characters Char) {
        characters.add(Char);
    }

    public Characters get(int i) {
        return characters.get(i);
    }
}
