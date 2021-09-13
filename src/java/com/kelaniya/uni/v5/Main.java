package java.com.kelaniya.uni.v5;

import java.com.kelaniya.uni.v4.UI;
import java.com.kelaniya.uni.v5.input.CommandLineInputs;
import java.com.kelaniya.uni.v5.input.inputs;
import java.com.kelaniya.uni.v5.operation.OperationFactory;
import java.com.kelaniya.uni.v5.repository.FileNumberRepository;
import java.com.kelaniya.uni.v5.repository.numberRepository;
import java.com.kelaniya.uni.v5.ui.CmdLineUI;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        inputs inputs = new CommandLineInputs(args);
        numberRepository numRepository = new FileNumberRepository();
        OperationFactory operationFactory=new OperationFactory();
        UI ui = new CmdLineUI();
       CalculatorApp app=new CalculatorApp(inputs,numRepository,operationFactory,ui, , numberRepository, operationFactory1, ui1);
        app.execute();

    }

    }



