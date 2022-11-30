public class Main {
    public static void main(String[] args){
     Person Karloson = new Person("Карлосон");
        Person pek = new Person("Господин Пек");
        Person baby = new Person("Малыш");
        Person peopl = new Person("людей с телевизионными камерами");
        Happy h = new Happy();
        Lought l = new Lought();
        System.out.print(Karloson+" завесил себя");
        Karloson.wear();
        System.out.print("чему "+ baby+ h.react());
        System.out.print("Если "+Karloson);
        Karloson.fly();
        System.out.println(pek);
        pek.obmorok(true);
        pek.send();
        System.out.println(peopl+".");
        System.out.print(pek);
        pek.obmorok(false);
        System.out.print(l.react()+" всё "+"громче "+"и "+"громче"+".");
        System.out.println(Karloson + Karloson.react()+" "+pek+"у"+","+" когда проносился мимо него,");
       Karloson.dance();
    }
}