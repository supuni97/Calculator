package com.kelaniya.uni.v5;

import com.kelaniya.uni.v5.input.CommandLineInputs;
import com.kelaniya.uni.v5.operation.OperationFactory;
import com.kelaniya.uni.v5.repository.FileNumberRepository;
import com.kelaniya.uni.v5.repository.NumberRepository;


import java.io.IOException;

//Main class is the coordinator now...
public class Main {

    public static void main(String[] args) throws IOException {

        com.kelaniya.uni.V5.input.Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = (NumberRepository) new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new com.kelaniya.uni.V5.ui.CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs, numberRepository, operationFactory, ui);
        app.execute();

    }

}