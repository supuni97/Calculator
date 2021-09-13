package java.com.kelaniya.uni.v5;

import java.com.kelaniya.uni.v4.UI;
import java.com.kelaniya.uni.v5.input.inputs;
import java.com.kelaniya.uni.v5.operation.Operation;
import java.com.kelaniya.uni.v5.operation.OperationFactory;
import java.com.kelaniya.uni.v5.repository.numberRepository;
import java.io.IOException;

public class CalculatorApp {

    private final inputs inputs;
    private final numberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;
    public CalculatorApp(inputs inputs, numberRepository numRepository, OperationFactory operationFactory, UI ui, java.com.kelaniya.uni.v5.input.inputs inputs1, java.com.kelaniya.uni.v5.repository.numberRepository numberRepository, OperationFactory operationFactory1, UI ui1) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() throws IOException {

        String operator = inputs.getOperator();
        Double[] numbers = numberRepository.getNumbers();
        Operation operation=  operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);
        ui.showMessage("The result is"+result);

    }

}
