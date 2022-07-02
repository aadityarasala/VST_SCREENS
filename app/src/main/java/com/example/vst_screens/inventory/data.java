package com.example.vst_screens.inventory;

import java.util.ArrayList;
import java.util.List;

public class data {
    public static List<medicine> getmedicinelist(){
        List<medicine> medicineList = new ArrayList<>();

        medicine Cyclobenzaprine = new medicine();
        Cyclobenzaprine.setName("Cyclobenzaprine");
        medicineList.add(Cyclobenzaprine);

        medicine Hydrochlorothiazide = new medicine();
        Hydrochlorothiazide.setName("Hydrochlorothiazide");
        medicineList.add(Hydrochlorothiazide);

        medicine Pantoprazole = new medicine();
        Pantoprazole.setName("Pantoprazole");
        medicineList.add(Pantoprazole);

        return medicineList;
    }
}
