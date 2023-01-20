public class Weapon{

    String name;
    int damage;
    String rarity;



public void AddDmg(int additionaldmg){
    int newdmg=this.damage+additionaldmg;

    System.out.println("Your sword is " + name + "" + " With a base damage of" + damage);
    System.out.println("Damage increased from " + damage + "to" + newdmg);


    this.damage=newdmg;
}

public String ShowNameandRarity(){
    return this.name + "" + this.rarity;

    
}

}
