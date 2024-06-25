public class CharacterEnemyAndDungeonBootLoader {
    static Characters boneco1 = new Characters("Alfa", 3, 10);
    static Characters boneco2 = new Characters("Beto", 5, 10);
    static Characters inimigo1 = new Characters("Diabo", 66, 10);
    static Characters inimigo2 = new Characters("Diabresco", 76, 10);
    static TeamCharacters bem = CharacterEnemyAndDungeonBootLoaderBem();
    static TeamCharacters mau = CharacterEnemyAndDungeonBootLoaderMau();

    public static TeamCharacters CharacterEnemyAndDungeonBootLoaderBem(){
    TeamCharacters bem = new TeamCharacters();
        bem.addCharacters(boneco2);
        bem.addCharacters(boneco1);
    return bem;
}
    public static TeamCharacters CharacterEnemyAndDungeonBootLoaderMau(){

        TeamCharacters mau = new TeamCharacters();
        mau.addCharacters(inimigo1);
        mau.addCharacters(inimigo2);
        return mau;
    }
}
