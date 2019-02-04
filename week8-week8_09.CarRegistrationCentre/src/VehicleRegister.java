import java.util.HashMap;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true; 
        }
        return false; 
    }
    
    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }
    
    public boolean delete (RegistrationPlate plate) {
        if(owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownersList = new ArrayList<String>();
        String temp = "";
        
        for (RegistrationPlate plate : owners.keySet()) {
            temp = owners.get(plate);
        
        if(!(ownersList.contains(temp))){
            ownersList.add(temp);
        }
    }
    
        for (String owner : ownersList) {
                System.out.println(owner);
        }

    }
}
