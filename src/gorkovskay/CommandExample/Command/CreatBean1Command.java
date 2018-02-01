package gorkovskay.CommandExample.Command;

import gorkovskay.CommandExample.Bean;
import gorkovskay.CommandExample.Bean1;

import java.util.Map;

public class CreatBean1Command implements Command {

    private final static String PARAM_A = "a";
    private final static String PARAM_B = "b";


    @Override
    public Bean execute(Map<String, String> param) {
        Bean1 bean1 = new Bean1();
        bean1.setA(Integer.parseInt(param.get(PARAM_A)));
        bean1.setB(param.get(PARAM_B));
        return bean1;
    }
}
