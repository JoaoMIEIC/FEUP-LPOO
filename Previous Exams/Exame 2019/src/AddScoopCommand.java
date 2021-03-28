public class AddScoopCommand implements Command{
    Flavor flavor;
    public AddScoopCommand(Flavor flavour){
        this.flavor = flavour;
    }

    public void execute(Icecream icecream){
        icecream.addScoop(flavor);
    }
}
