public class methods{
    int a,b;
    public int method1(int a) {
        System.out.println("a: " +a);
        return 0;
    }
    public float method2(int b) {
        System.out.println("b: " +b);
        return 0;
    }
    public double method3(int a,int b){
        double sum = a+b;
        double square =(a+b)*(a+b);
        System.out.println("sum of two numbers is : " +sum);
        System.out.println("Square of the sum of two number is : " +square);
        return 0;
    }

    public static void main(String[] args) {
        methods methods = new methods();
        methods.method1(  10);
        methods.method2(10);
        methods.method3(10,10);
    }
}

