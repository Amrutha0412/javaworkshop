public class student {
    private  String name;
    public student() {
        name = "Unknown";
    }
    public void setName(String n){
        name =n;
    }
    public String getName() {
        return name;
    }
}
class c1{
    public static void main(String[] args) {
        student a = new  student();
        System.out.println(a.getName());
        a.setName("Josh");
        String b = a.getName();
        System.out.println(b);
    }
}
