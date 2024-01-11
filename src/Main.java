
import designpatterns.Application;
import designpatterns.factory.GUIFactory;
import designpatterns.factory.LinuxFactory;
import designpatterns.factory.MacOSFactory;
import designpatterns.factory.WindowsFactory;

import java.util.Locale;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Application app = configureApplication();
        app.paint();

        System.out.print("Hello and welcome! What's your name? ");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        scanner.close();

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println(name + "i = " + i);
        }
    }

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println(osName);

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else if (osName.contains("linux")) {
            factory = new LinuxFactory();
        } else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);
        return app;
    }
}