/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Rafael Axel
 */
public class CleaningService extends Employee{
    float nipCleaningService;
    String namaCleaningService;
    String jabatanCleaningService;
    float gajiCleaningService;
    float potonganCleaningService;
    float jamkerjaCleaningService;
    float totalgajiCleaningService;
    
    @Override
    float nip(){
        float nip = nipCleaningService;
        System.out.println("nip = "+ nip);
        return 0;
    }
    
    
    public String nama3(){
        String nama = namaCleaningService;
        System.out.println("nama = "+namaCleaningService);
        return nama;
    }
    
    public String jabatan3(){
        String jabatan = jabatanCleaningService;
        System.out.println("jabatan = "+jabatanCleaningService);
        return jabatanCleaningService;
    }
    
    @Override
    float potongan(){
        float potongan = potonganCleaningService;
        System.out.println("potongan gaji = "+potonganCleaningService);
        return potonganCleaningService;
    }
    
    @Override
    float gaji(){
        float gaji = gajiCleaningService;
        gaji -= potongan();
        System.out.println("gaji total = "+gajiCleaningService);
        return gajiCleaningService;
    }
    
    @Override
    float jam(){
        float jam = jamkerjaCleaningService;
        System.out.println("lama bekerja = "+jamkerjaCleaningService+" jam");
        return jamkerjaCleaningService;
    }
    
    @Override
    float total(){
        float total = gajiCleaningService - potonganCleaningService;
        System.out.println("total gaji = "+ total);
        return total;
    }
}
