package com.bl.petmanagement;
import java.util.ArrayList;

public class PetStorage {
private ArrayList petList = new ArrayList();
    
    public void add (Cat cat) {
    	petList.add(cat);
    }
    
    public void add (Dog dog) {
    	petList.add(dog);
    }
    
    public void add (Duck duck) {
    	petList.add(duck);
    }
    
    public void add (Parrot parrot) {
    	petList.add(parrot);
    }
    
    public void add (Rabbit rabbit) {
    	petList.add(rabbit);
    }
    
    
    public ArrayList getPetList() {
    	return petList;
    }
}


    