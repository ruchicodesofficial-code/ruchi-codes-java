package inheritance;

 interface A {
     void show();
}
interface B{
     void show();

}
class C implements A,B{

     public void show(){
         System.out.println("My own implementation");
     }
}

