public void setup() {     
    Cow c = new Cow("cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound());
    Chick ck = new Chick("chick", "chirp");  
    System.out.println(ck.getType() + " goes " + ck.getSound());
    Pig p = new Pig("pig", "oink");   
    System.out.println(p.getType() + " goes " + p.getSound());  
}
