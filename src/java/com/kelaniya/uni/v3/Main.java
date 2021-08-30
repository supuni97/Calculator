package java.com.kelaniya.uni.v3;

import java.com.kelaniya.uni.v3.operation.Addoperation;
import java.com.kelaniya.uni.v3.operation.Muloperation;
import java.com.kelaniya.uni.v3.operation.Suboperation;
import java.io.IOException;

public class Main {

    //Main class is the coordinator now...
    public static void main(String[] args) throws IOException {
        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        double result = 0;

        if(operator.equals("add"))

        {
            Addoperation addoperation = new Addoperation();
            result = addoperation.execute(numbers);

        }else if(operator.equals("sub"))
        {
            Suboperation suboperation=new Suboperation();
            result=suboperation.execute(numbers);

        }else if(operator.equals("mul"))
        {
            Muloperation muloperation=new Muloperation();
            result =muloperation.execute(numbers);
        }

        System.out.println("The result is"+result);
    }

    }



