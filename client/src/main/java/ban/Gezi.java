package ban;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/10.
 */
public class Gezi {
    private int x;
    private int y;
    private List<Person> pers=new ArrayList<Person>();
    public Gezi(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return this.x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return this.y;
    }
    public List<Person> getPers(){
        return this.pers;
    }

}
