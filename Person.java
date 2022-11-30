public class Person extends AbstractClass implements IReact,IAction {

    public Person(String name) {
        super(name);
    }
    private boolean yes = true;
    @Override
    public void obmorok(boolean yes) {
        if (yes)
            System.out.print(" " + "наверняка упадет" + " "+"в " + EState.FAINT.toString() +" "+"и"+EState.RECOVER.toString()+" ");
        else
            System.out.print(" " + "смотрел" + " " );
    }

    @Override
    public void fly() { System.out.print(" " + "все же вдруг вдруг взлетит" + " " );}
    @Override
    public void wear() {System.out.print(" " + "накидками" + " пропеллера вовсе не было видно " );}
    @Override
    public void dance() {System.out.print(" размахивая своими" + "накидками" );}

    @Override
    public void send() {System.out.print(" пришлет сюда " + " " );}

    @Override
    public String react() {
        String all = " "+"стал хихикать,"+" да ещё "+EState.WINK.toString();
        return all;
    }
}
