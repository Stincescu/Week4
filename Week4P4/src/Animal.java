public class Animal implements Character {
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

    public Animal(int xPosition, int yPosition, String name) {
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
}
