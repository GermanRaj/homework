public class WorldState {

    public boolean isFlooding = false;
    public boolean isEconomyUp = false;
    public boolean areForestsInFire = true;
    public boolean isTGlobalWarming = true;
    public boolean isImprovingMedicine = true;
    public boolean isPriceDown = false;
    public boolean isCovidRestriction = true;


    public boolean isWorldNegativelyGood() {

                                          //true     &&    true         ||    false    &&        true
        boolean isworldnegativelygood = !isFlooding && areForestsInFire  || isPriceDown &&  isTGlobalWarming;
        return isworldnegativelygood;
    }

    public boolean isWorldPositivelyGood() {

                                        // false   &&    true             || false               &&   true      ||   true
        boolean isworldpositivelygood = isFlooding && isImprovingMedicine || !isCovidRestriction  && !isPriceDown || !isEconomyUp;
        return isworldpositivelygood;
    }
}










