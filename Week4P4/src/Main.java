public class Main {


public static void main(String[] args){

        Human man1 = new Human(2,3,"Warrior");
        Monster monster1 = new Monster( 3,3,"T-REX" );
        Animal animal1 = new Animal( 4,5, "Max");
        HealthArtifact health = new HealthArtifact(4,4, 10);
        EnergyArtifact energy = new EnergyArtifact(20, 4, 20);
        Human man2 = new Human(3,4,"Shaman");

        man1.humanAttack(animal1,man1);
        monster1.monsterAttack(man1,monster1);
        man1.humanAttack(monster1,man1);
        man1.increaseEnergyPoints(energy);
        man2.increaseHealthPoints(health);
        man2.increaseEnergyPoints(energy);

        System.out.println("Human status: Name: " + man1.getName() + " health: " + man1.getHealthPoints() + " energy: " + man1.getEnergyPoints());
        System.out.println("Human status: Name: " + man2.getName() + " health: " + man2.getHealthPoints() + " energy: " + man2.getEnergyPoints());
        System.out.println("Monster status: Name: " + monster1.getName() + " health: " + monster1.getHealthPoints() + " energy: " + monster1.getEnergyPoints());
        System.out.println("Animal status: Name: " + animal1.getName() + " health: " + animal1.getHealthPoints() +  " energy: " + animal1.getEnergyPoints());

    }

}
