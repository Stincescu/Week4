public class Human implements Character {

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
    public int increaseHealthPoints(HealthArtifact viata){
        healthPoints += viata.healthPoints;
        return healthPoints;
    }
    public int increaseEnergyPoints(EnergyArtifact energie){
        energyPoints += energie.energyPoints;
        return energyPoints;
    }
    public void humanAttack(Monster monstru){
        Human.energyPoints -=5;
        Monster.healthPoints -= 10;
    }
    public void humanAttack(Animal animal){
        Human.energyPoints -=5;
        Animal.healthPoints -= 10;
    }
}
