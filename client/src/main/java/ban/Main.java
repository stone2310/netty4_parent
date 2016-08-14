package ban;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/10.
 */
public class Main {
    public static void main(String args[]){
        List<Person> pers=new ArrayList<Person>();
        for(int i=0;i<=15;i++){
            pers.add(new Person(i+""));
        }
        Gezi[][] gzs=new Gezi[7][3];
        for(int i=0;i<=6;i++){
//            Gezi gz=new Gezi();
            for( int j=0;j<=2;j++){
                gzs[i][j]=new Gezi(i,j);
            }
        }

        for(int i=0;i<=6;i++){
            for( int j=0;j<=2;j++){
                for(int a=0;a<=15;a++){
                    gzs[i][j].getPers().add(pers.get(a));

                }
            }
        }


        for(int i=0;i<=21;i++){
//            gzs.get(i).getPers().add(pers.get(i));

        }

    }


}
