package lesson1;
public class School {
    private String name;
    private String address;

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void showSchoolInfo() {
        System.out.println("學校名稱: " + this.name + ", 地址: " + this.address);
    }

    
    // 更新地址
    public void setAddress(String address) {
        this.address = address;
    }

    // 取得地址
    public String getAddress() {
        return this.address;
    }
     //設定名字
     public void setName(String name){
        this.name=name;
    }

    //取得名字
    public String getName(){
        return this.name;
    }
   
}