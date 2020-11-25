public class HealthArtifact extends Artifact {
    int healthPoints;

    public HealthArtifact(int xPosition, int yPosition, int healthPoints) {
        super(xPosition, yPosition);
        this.healthPoints = healthPoints;
    }
}
