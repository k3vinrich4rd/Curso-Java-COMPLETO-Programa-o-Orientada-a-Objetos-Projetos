package interfaces.solucaoproblema3.model.entities.solucaoproblema2.application;


import interfaces.solucaoproblema3.model.entities.solucaoproblema2.devices.ComboDevice;
import interfaces.solucaoproblema3.model.entities.solucaoproblema2.devices.ConcretePrinter;
import interfaces.solucaoproblema3.model.entities.solucaoproblema2.devices.ConcreteScanner;

/*
 Uma classe pode implementar mais de uma interface
 Importante: Isso NÃO é herança múltipla, pois NÃO HÁ REUSO na relação
entre ComboDevice e as interfaces ScannerePrinter.
ComboDevide não herda, mas sim implementa as interfaces(cumpre o contrato)
 */

public class Program {

    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}