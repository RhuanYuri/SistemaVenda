import java.util.Date;

public class Produto {
    private String name;
    private double price;
    private Date expirationDate;
    private String codeBar;


    public Produto(String name, double  price, Date expirationDate, String codeBar){
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.codeBar = codeBar;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeBar() {
        return codeBar;
    }

    public void setCodeBar(String codeBar) {
        this.codeBar = codeBar;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
