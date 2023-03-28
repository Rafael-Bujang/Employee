/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Rafael Axel
 */
public class Main1 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        
        Boss bos = new Boss();
        bos.nipboss = 84535;
        bos.namaboss = "Axel";
        bos.jabatanboss = "Boss";
        bos.potonganboss = 5000;
        bos.gajiboss = 80000;
        bos.jamkerjaboss = 1;
        bos.totalgajiboss = 0;
        
        Manager m = new Manager();
        m.nipManager = 67425;
        m.namaManager = "Andre";
        m.jabatanManager = "Manager";
        m.potonganManager = 100;
        m.gajiManager = 8000;
        m.jamkerjaManager = 5;
        m.totalgajiManager = 0;
        
        CleaningService c = new CleaningService();
        c.nipCleaningService = 16532;
        c.namaCleaningService = "abdi";
        c.jabatanCleaningService = "OB";
        c.potonganCleaningService = 10;
        c.gajiCleaningService = 2400;
        c.jamkerjaCleaningService = 12;
        c.totalgajiCleaningService = 0;
        
        Internship i = new Internship();
        i.nipInternship = 00746;
        i.namaInternship = "Jamal";
        i.jabatanInternship = "Magang";
        i.potonganInternship = 0;
        i.gajiInternship = 100;
        i.jamkerjaInternship = 10;
        i.totalgajiInternship = 0;
        
        
        bos.nip();  
        bos.nama();
        bos.jabatan1();
        bos.gaji();
        bos.potongan();
        bos.jam();
        bos.total();
        
        System.out.println("------------------------");
        
        m.nip();  
        m.nama2();
        m.jabatan2();
        m.gaji();
        m.potongan();
        m.jam();
        m.total();
        
        System.out.println("------------------------");
        
        c.nip();  
        c.nama3();
        c.jabatan3();
        c.gaji();
        c.potongan();
        c.jam();
        c.total();
        
        System.out.println("------------------------");
        
        i.nip();  
        i.nama4();
        i.jabatan4();
        i.gaji();
        i.potongan();
        i.jam();
        i.total();
    }
}
