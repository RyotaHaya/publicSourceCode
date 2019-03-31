public class Human {

    private String name = "";
    private int height = 0;
    private int weight = 0;
    private int age = 0;

    public Human(int height,int weight , int age){
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public Human(String name){

        this.name = name;
    }


    public int getHeight(){

        return  height;
    }

    public int getWeight(){

        return  weight;
    }

    public int getAge(){

        return  age;
    }

    public void setName(String name){

        this.name = name;
    }


    public void setHeight(int height){

        this.height = height;
    }

    public void setWeight(){

        this.weight = weight;
    }

    public void setAge(){

        this.age = age;
    }


    public void dispBodyData(){

        System.out.print(this.name +"さんの");
        System.out.print("身長は"+this.height+"センチです。");
        System.out.print("体重は"+this.weight+"キロです。");
        System.out.println("年齢は"+this.age+"歳です。");

    }



}
