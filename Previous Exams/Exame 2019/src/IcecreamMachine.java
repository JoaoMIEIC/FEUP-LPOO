public class IcecreamMachine {
    Icecream icecream;
    public IcecreamMachine(Icecream icecream) {
        this.icecream = icecream;
    }

    public void executeCommand(Command request) {
        request.execute(icecream);
    }

    public void undoLastCommand() {
        icecream.scoops.remove(icecream.scoops.size()-1);
    }
}
