import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Human sample = new Human(178,79,35);

        System.out.println("身長は"+sample.getHeight()+"センチ");
        System.out.println("体重は"+sample.getWeight()+"キロ");
        System.out.println("年齢は"+sample.getAge()+"歳");

        Human itiro = new Human(168,68,87);
        Human ziro = new Human(178,58,27);
        Human saburo = new Human(198,168,47);

        itiro.setName("一郎");
        ziro.setName("二郎");
        saburo.setName("三郎");


        List<Human>  bodyDatalist = new ArrayList<Human>();

        bodyDatalist.add(itiro);
        bodyDatalist.add(ziro);
        bodyDatalist.add(saburo);

        for(Human dispData : bodyDatalist){
            dispData.dispBodyData();
        }
















    }
}
