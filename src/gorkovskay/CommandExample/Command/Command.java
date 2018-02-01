package gorkovskay.CommandExample.Command;

import gorkovskay.CommandExample.Bean;

import java.util.Map;

public interface Command {

    Bean execute(Map<String,String> param);

}
