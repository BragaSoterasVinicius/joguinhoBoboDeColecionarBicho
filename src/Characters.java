public class Characters {
    String Name;
    int Iniciativa;

    int Life;
    int Id;

    public Characters(String name, int iniciativa, int life) {

        Name = name;
        Iniciativa = iniciativa;
        Life = life;
    }
    public Characters(){
        Name = "defaultName";
        Iniciativa = 999;
        Life = 10;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



    public int getIniciativa() {
        return Iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        Iniciativa = iniciativa;
    }
}
