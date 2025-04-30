package lesson1;
public class Cloth {
    public String logo="";
    public String color="";
    public String size="";


    public Cloth(String logo, String color, String size){

        this.logo =logo;
        this.color =color;
        this.size =size;
    }

    public void showClothInfo(){
        System.out.println("衣服圖示: " + this.logo + " 衣服顏色: " + this.color + " 衣服尺寸: " + this.size);
    }
}
