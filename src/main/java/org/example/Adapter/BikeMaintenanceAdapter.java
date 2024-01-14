package org.example.Adapter;

public class BikeMaintenanceAdapter implements CalculateCostMaintenanceNew{
    //composition
    private CalculateMaintenanceCostOld calculateMaintenanceCostOld;
    public BikeMaintenanceAdapter(CalculateMaintenanceCostOld calculateMaintenanceCostOld){
        this.calculateMaintenanceCostOld=calculateMaintenanceCostOld;
    }
    @Override
    public int calculateCostMaintenanceNew() {
        return calculateMaintenanceCostOld.calculatemaintenanceCostOld();
    }
}
