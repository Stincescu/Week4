public class Monster implements  Character{
    int xPosition;
    int yPosition;
    String name;
    static int healthPoints = 50;
    static int energyPoints = 20;

    public String getName() {
        return name;
    }

    public static int getHealthPoints() {
        return healthPoints;
    }

    public static int getEnergyPoints() {
        return energyPoints;
    }

    public Monster(int xPosition, int yPosition, String name) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.name = name;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int increaseHealthPoints(HealthArtifact viata){
        healthPoints += viata.healthPoints;
        return healthPoints;
    }
    public int increaseEnergyPoints(EnergyArtifact energie){
        energyPoints += energie.energyPoints;
        return energyPoints;
    }
    public void monsterAttack(Human omulet){
        Monster.energyPoints -= 3;
        omulet.healthPoints -= 15 ;
    }
    public void monsterAttack(Animal animal){
        Monster.energyPoints -= 3;
        animal.healthPoints -= 15 ;
    }
}
