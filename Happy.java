public class Happy implements IReact {
    @Override
    public String react() {
        String all = " " + "был" + " " + EState.HAPPY.toString() + ".";
        return all;
    }
}
