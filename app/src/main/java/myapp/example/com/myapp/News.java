package myapp.example.com.myapp;

/**
 * Created by sr130 on 2019/5/15.
 */


public class News  {
    private String name;
    private String text;
    public News(String name,String text){
        this.name=name;
        this.text=text;
    }
    public String getName(){
        return name;
    }
    public String getText(){
        return text;
    }
}