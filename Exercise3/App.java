public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "aaaaaaa";
        thief.sayMyName();


        Character Archer = new Character();

        Archer.strength = 5;
        Archer.agility = 10;
        Archer.intelligence = 0;
        Archer.name = "sukdsg";
        Archer.sayMyName();
        Archer.Atk();

        Weapon Sword = new Weapon ();

        Sword.name="Excaliber";
        Sword.damage=100;
        Sword.rarity="Legendaru";
        Sword.AddDmg(300);
        System.out.println(Sword.ShowNameandRarity());
        

    }
}
