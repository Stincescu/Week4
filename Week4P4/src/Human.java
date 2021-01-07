public class Human implements Character {

    int xPosition;
    int yPosition;
    String name;
    int healthPoints = 50;
    int energyPoints = 20;

    public String getName() {
        return name;
    }

    public  int getHealthPoints() {
        return healthPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public Human(int xPosition, int yPosition, String name) {
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
    public void humanAttack(Monster monster, Human human){
        human.energyPoints -=5;
        monster.healthPoints -= 10;
    }
    public void humanAttack(Animal animal, Human human){
        human.energyPoints -=5;
        animal.healthPoints -= 10;

    }
}
