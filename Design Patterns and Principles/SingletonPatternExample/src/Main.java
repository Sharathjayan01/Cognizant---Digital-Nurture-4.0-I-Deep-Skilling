//LAZY INITIALIZATION
class Logger{
    private static Logger instance;
    private Logger(){
        System.out.println("Single instance class ");
    }
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger instance1 = Logger.getInstance();
        Logger instance2 = Logger.getInstance();
        if(instance2 == instance1){
            System.out.println("instance1 address = "+instance2.hashCode());
            System.out.println("instance2 address = "+instance1.hashCode());
            System.out.println("Same Address");

        }
    }
}