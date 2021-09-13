package java.com.kelaniya.uni.v5.operation;

//Factory design pattern
public class OperationFactory {

    public Operation getInstance(String operator){

        Operation operation=null;

        if(operator.equals("add"))
        {
            operation=new Addoperation();

        }else if(operator.equals("sub"))
        {
            operation=new Suboperation();

        }else if(operator.equals("mul"))
        {
            operation=new Muloperation();
        }else if(operator.equals("div"))
        {
            operation=new Divoperation();
        }

        return operation;
    }

}
