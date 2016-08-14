package ban;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/10.
 */
public class Person {
    private String name;
    private List<Gezi> gzs=new ArrayList<>();

    public Person(String name){

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public List<Gezi> getGzs(){
        return this.gzs;
    }

}
