public class Main {


public static void main(String[] args){

        Human omulet1 = new Human(2,3,"Vasile");
        Monster monstrulet1 = new Monster( 3,3,"T-REX" );
        Animal animalut1 = new Animal( 4,5, "Max");
        HealthArtifact health = new HealthArtifact(4,4, 10);
        EnergyArtifact energie = new EnergyArtifact(20, 4, 20);

        omulet1.humanAttack(animalut1);
        monstrulet1.monsterAttack(omulet1);
        omulet1.humanAttack(monstrulet1);
        omulet1.increaseEnergyPoints(energie);

        System.out.println("Human status: Name: " + omulet1.getName() + " viata: " + omulet1.getHealthPoints() + " energie: " + omulet1.getEnergyPoints());
        System.out.println("Monster status: Name: " + monstrulet1.getName() + " viata: " + monstrulet1.getHealthPoints() + " energie: " + monstrulet1.getEnergyPoints());
        System.out.println("Animal status: Name: " + animalut1.getName() + " viata: " + animalut1.getHealthPoints() +  " energie: " + animalut1.getEnergyPoints());


    }

}
