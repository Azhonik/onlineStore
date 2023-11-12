import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Books extends Product{

    private String authorFullName;

    public Books(){};

    public Books(String name, String description, BigDecimal price, LocalDateTime createdAt, String authorFullName) {
        super(name, description, price, createdAt);
        this.authorFullName = authorFullName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    @Override
    public String toString() {
        return "Books{" +
                "authorFullName='" + authorFullName + '\'' +
                "} " + super.toString();
    }
}
