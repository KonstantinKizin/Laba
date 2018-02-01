package gorkovskay.CommandExample.Command;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private Map<String,Command> commands = new HashMap<>();



    public CommandProvider(){
        commands.put("Bean1",new CreatBean1Command());
        commands.put("Bean2",new CreateCommandBean2());
    }


    public Command getCommand(String beanName){
        Command command = commands.get(beanName);
        return command;
    }


}
