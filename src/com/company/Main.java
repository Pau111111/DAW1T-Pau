package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Coche jaguar = new Coche("Jaguar","XF","3453WRD",4000,80000.0);
        Coche mercedes = new Coche("Mercedes","ASF","2535ADD",5000,80000.0);
        Coche bmw = new Coche("BMW","DWAD","DAW2324",40000,80000.0);

        List<Coche> cocheList = new ArrayList<>;

        cocheList.add(jaguar);
        cocheList.add(mercedes);
        cocheList.add(bmw);
        System.out.println("Muestro el Jaguar: "+ cocheList.get(0));

        System.out.println("Muestro el Mercedes: "+ cocheList.get(0));

        System.out.println("Muestro el BMW: "+ cocheList.get(0));

    }

}
