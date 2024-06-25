import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Journey {
    public static void Jornar(Dungeon dungeon, TeamCharacters teamCharacters){
        System.out.println(teamCharacters.characters.size()+" adventurers are entering the " +dungeon.name+ " dungeon...");
        for(int i = 0; i< dungeon.getSize(); i++){
            int RoomNumber = i+1;
            System.out.println("Room " + RoomNumber + "...");
            System.out.println("A " + dungeon.teamCharacters.get(0).Name + " was found!");
            CreateKillOrder(teamCharacters, dungeon.teamCharacters.get(i));
        }
    }
    public static List<Integer> CreateKillOrder(TeamCharacters doBem, Characters doMau){
        List<Integer> ints = new ArrayList<>();
        ints.add(doMau.Iniciativa);
        for(int i = 0; i<doBem.characters.size();i++){
            ints.add(doBem.characters.get(i).Iniciativa);
        }
        Collections.sort(ints);
        return ints;
    }
}
