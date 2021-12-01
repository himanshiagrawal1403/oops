abstract class Animal{
    abstract void move();
    abstract void eat();
    void label(){
        System.out.println("animal's data ");
    }
}
 class Bird extends Animal {
     public void move() {
         System.out.println("moves by flying");
     }

     public void eat() {
         System.out.println("Eats birdfood");
     }
 }
    class  Fish extends Animal{
        public void move(){
            System.out.println("moves by swimming");
        }
        public void eat(){
            System.out.println("eats seafood");
        }
    }


class TestBird{
    public static void main(String[] args) {
        Animal mybird = new Bird();
        mybird.label();
        mybird.eat();
        mybird.move();
    }
}
class Testfish{
    public static void main(String[] args) {
        Animal myfish = new Fish();
        myfish.label();;
        myfish.move();
        myfish.eat();
    }
}
