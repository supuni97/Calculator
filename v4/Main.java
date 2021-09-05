package java.com.kelaniya.uni.v4;

import java.com.kelaniya.uni.v4.operation.*;
import java.io.IOException;

//LISKOV substitute principle
public class Main {

    //Main class is the coordinator now...
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        OperationFactory operationFactory=new OperationFactory();
        Operation operation=  operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("The result is"+result);

    }



    }



