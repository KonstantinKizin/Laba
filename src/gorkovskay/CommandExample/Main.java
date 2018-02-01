package gorkovskay.CommandExample;

import gorkovskay.CommandExample.Command.Command;
import gorkovskay.CommandExample.Command.CommandProvider;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","10");
        map.put("b","SomeString");

        Map<String,Map<String,String>> ugly = new HashMap<>();
        ugly.put("Bean1",map);

        CommandProvider provider = new CommandProvider();

        Command command = provider.getCommand("Bean1");

        Bean bean = command.execute(map);

        System.out.println(bean.getClass());






    }
}
