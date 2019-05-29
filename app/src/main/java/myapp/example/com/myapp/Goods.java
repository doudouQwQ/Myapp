package myapp.example.com.myapp;

/**
 * Created by sr130 on 2019/5/15.
 */

public class Goods{
    private String name;
    private int imageId;
    public Goods(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}