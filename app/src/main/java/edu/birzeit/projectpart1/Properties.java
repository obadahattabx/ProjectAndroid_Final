package edu.birzeit.projectpart1;

public class Properties {
    private int ID;
    private String cityName;
    private String address;
    private String surfaceArea;
    private String constructionYear;
    private String numOfBedroom;
    private String price;
    private String availabilDate;
    private String status;
    private String creatDate;
    private byte[] image;


    public  void properties(){

    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(String surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public String getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(String constructionYear) {
        this.constructionYear = constructionYear;
    }

    public String getNumOfBedroom() {
        return numOfBedroom;
    }

    public void setNumOfBedroom(String numOfBedroom) {
        this.numOfBedroom = numOfBedroom;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAvailabilDate() {
        return availabilDate;
    }

    public void setAvailabilDate(String availabilDate) {
        this.availabilDate = availabilDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(String creatDate) {
        this.creatDate = creatDate;
    }
}
