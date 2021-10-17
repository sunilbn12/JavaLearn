package factoryMethodPattern;

public class GenerateBill {

    public static void main(String[] args) {
        GetPlanFactory planFactory=new GetPlanFactory();
        planFactory.getPlan("DomesticPlan");




    }
}
