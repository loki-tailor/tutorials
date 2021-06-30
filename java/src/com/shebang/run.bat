/c/Program Files/AdoptOpenJDK/jdk-11.0.11.9-hotspot/bin/java -- source 11

// will execute if ran as : java --source 11 run.txt .

// not sure how in windows, but #!/usr/bin/java -- source 11 works in bash 
import java.nio.file.*;

public class run {
    public static void main(String[] args) throws Exception {
        Files
            .walk(Paths.get(args[0]))
            .forEach(System.out::println);

    }
}

echo Hi