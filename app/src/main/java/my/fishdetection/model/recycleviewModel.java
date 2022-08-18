package my.fishdetection.model;

public class recycleviewModel{
     int image;
     String textview1;
     String textview2;

    public int getImage() {
        return image;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getTextview2() {
        return textview2;
    }
    public recycleviewModel(int image, String textview1, String textview2)
    {
        this.image=image;
        this.textview1=textview1;
        this.textview2=textview2;
    }
}
