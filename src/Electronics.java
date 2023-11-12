import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Electronics extends Product{

    private String brand;
    private String color;
    private boolean isNew;
    private int memory;

    public Electronics(){};

    public Electronics(String name, String description, BigDecimal price, LocalDateTime createdAt, String brand, String color, boolean isNew, int memory) {
        super(name, description, price, createdAt);
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isNew=" + isNew +
                ", memory=" + memory +
                "} " + super.toString();
    }
}
