package factoryMethodPattern;

public class GetPlanFactory {

    public Plan getPlan(String planType){

        if(planType==null){
            return null;
        }
        else if(planType.equalsIgnoreCase("DomesticPlan")){
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;

    }
}
