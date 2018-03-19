import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class lambda {
    public static void main(String[] args) throws IOException {

        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.forEach(x-> System.out.println(x));
        Properties properties = new Properties();
        InputStream in = lambda.class.getClassLoader().getResourceAsStream("smart.properties");
        properties.load(in);
        System.out.println(properties);
    }

}
