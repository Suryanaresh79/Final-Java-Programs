package com.bl.petmanagement;
public class Dog extends Animal {
     
     String breed;
     
     @Override
     public void eats() {
    	 System.out.println("Dog eat flesh");
     }
}

