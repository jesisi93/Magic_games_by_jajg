// AvatarController.java

public class AvatarController {
    private float x, y; // Position of the avatar
    private float velocityX, velocityY; // Velocity of the avatar

    public AvatarController() {
        this.x = 0;
        this.y = 0;
        this.velocityX = 0;
        this.velocityY = 0;
    }

    // Method to update avatar position based on velocity
    public void update(float deltaTime) {
        x += velocityX * deltaTime;
        y += velocityY * deltaTime;
    }

    // Method to set velocity
    public void setVelocity(float vx, float vy) {
        this.velocityX = vx;
        this.velocityY = vy;
    }

    // Method to animate avatar (placeholder method, to be expanded)
    public void animate() {
        // Animation logic can be implemented here
    }

    // Getters for position
    public float getX() { return x; }
    public float getY() { return y; }
}