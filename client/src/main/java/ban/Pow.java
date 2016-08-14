package ban;

/**
 * Created by Administrator on 2016/8/10.
 */
public class Pow {
    public static void main(String args[]){
//        int i=pow21();
//        System.out.println(i);
    }
    public static int pow21(Person p,Gezi[][] gz){
        int sum = 0;
        int x = (int) Math.pow(2, 21);
        int y = (int) Math.pow(2, 15);
        for (int i = y; i <= x; i++) {
            String b = Integer.toBinaryString(i);
            char[] chars = b.toCharArray();
            int sumZero = 0;
            for (int j = 0; j < chars.length; j++) {
                if ('1' == (chars[j])) {
                    sumZero++;
                }
            }
            if (sumZero == 16) {
                System.out.println(chars);
                for(int m=0;m<chars.length;m++){
                    if('1'==chars[m]&&m<=6){
                        gz[0][m].getPers().add(p);
                    }
                    if('1'==chars[m]&&m>6&&m<=13){
                        gz[1][m].getPers().add(p);
                    }
                    if('1'==chars[m]&&m>13){
                        gz[2][m].getPers().add(p);
                    }
                }
//                if()

                sum++;
            }
        }
        return sum;
    }
}
