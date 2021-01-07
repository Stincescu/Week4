public class Monster implements  Character{
    int xPosition;
    int yPosition;
    String name;
    int healthPoints = 50;
    int energyPoints = 20;

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getEnergyPoints() {
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

    public int increaseHealthPoints(HealthArtifact health){
        healthPoints += health.healthPoints;
        return healthPoints;
    }
    public int increaseEnergyPoints(EnergyArtifact energy){
        energyPoints += energy.energyPoints;
        return energyPoints;
    }
    public void monsterAttack(Human human,Monster monster){
        monster.energyPoints -= 3;
        human.healthPoints -= 15 ;
    }
    public void monsterAttack(Animal animal,Monster monster){
        monster.energyPoints -= 3;
        animal.healthPoints -= 15 ;
    }
}
