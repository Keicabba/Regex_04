package it.figuccia;

public class Start {
    public static void main(String[] args) {

        String text =  "x3z ? xYz ! R1 && __";
        String result = text.replaceAll("[a-z,0-9]","*");
        System.out.println(result);

    }
}
