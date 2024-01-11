package designpatterns.factory;

public class LinuxCheckbox implements Checkbox{

    @Override
    public void paint(){
        System.out.println("This is a linux checkbox");
    }
}
