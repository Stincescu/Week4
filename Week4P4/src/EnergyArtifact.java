public class EnergyArtifact extends Artifact {
    int energyPoints;

    public EnergyArtifact(int xPosition, int yPosition, int energyPoints) {
        super(xPosition, yPosition);
        this.energyPoints = energyPoints;
    }
}
