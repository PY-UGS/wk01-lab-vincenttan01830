package com.company;

public class Question2b {
    public static void main(String[] args) {
        String moduleCode = "CSC1009";
        switch(moduleCode){
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Systems Networking");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithm");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
        }
        System.out.println("After Switch");
    }
}
