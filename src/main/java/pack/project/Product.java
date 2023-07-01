package pack.project;

public enum Product {
    Mango("Mango.PNG", 1.55f),Broccoli("Broccoli.PNG", 1.55f),Mushroom("Mushroom.PNG", 0.55f);

    private String imageFile;
    private float price;

    Product(String imageFile, float price){
        this.imageFile=imageFile;
        this.price=price;
    }
    public String getImageFile(){
        return imageFile;
    }
    public float getPrice(){
        return this.price;
    }
}
