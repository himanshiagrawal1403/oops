 interface Animal1 {
    void eat();
    void sound();
}
 interface Bird1{
    int numberoflegs=2;
    String outercovering="feather";
    void fly();

}
class Eagle implements Animal1,Bird1{
    public void eat(){
        System.out.println("eat reptiles");
    }
    public void sound(){
        System.out.println("high pitch");
    }
    public void fly(){
        System.out.println("Flies upto 100000");
    }


}
class TestEagle{
    public static void main(String[] args) {
        Eagle myeagle = new Eagle();
        myeagle.eat();
        myeagle.fly();
        myeagle.sound();
        //System.out.println("No.of legs=" +Bird.numberoflegs);
        //System.out.println(""+ Bird.outercovering);
    }
}
