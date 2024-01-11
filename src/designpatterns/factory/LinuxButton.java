package designpatterns.factory;

public class LinuxButton implements Button{

    @Override
    public void paint(){
        System.out.println("That's a linux button");
    }
}
