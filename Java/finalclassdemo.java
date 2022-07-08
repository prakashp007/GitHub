final class A{
    int x=10;
}
class B extends A{
    int y=20;
}
class finalclassdemo{
    public static void main(String[] args){
        B b=new B();
        System.out.println(b.y);
	System.out.println("Hello");
    }
}
//it can not be inherited