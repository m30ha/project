package pack.project.model;

public class Fruit {
    private String rate;
    private String name;
    private double price;
    private String visible;
    private String  value;
    private String imgSrc;
    private String imgValue;
    private String color;
    private String group;
    public void setRate(String rate){
        this.rate=rate;
    }
    public String getRate(){
        return rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getImgValue() {
        return imgValue;
    }

    public void setImgValue(String imgValue) {
        this.imgValue = imgValue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
