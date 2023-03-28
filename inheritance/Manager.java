/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Rafael Axel
 */
public class Manager extends Employee{
    float nipManager;
    String namaManager;
    String jabatanManager;
    float gajiManager;
    float potonganManager;
    float jamkerjaManager;
    float totalgajiManager;
    
    @Override
    float nip(){
        float nip = nipManager;
        System.out.println("nip = "+ nip);
        return 0;
    }
    
    
    public String nama2(){
        String nama = namaManager;
        System.out.println("nama = "+namaManager);
        return nama;
    }
    
    
    public String jabatan2(){
        String jabatan = jabatanManager;
        System.out.println("jabatan = "+jabatanManager);
        return jabatanManager;
    }
    
    @Override
    float potongan(){
        float potongan = potonganManager;
        System.out.println("potongan gaji = "+potonganManager);
        return potonganManager;
    }
    
    @Override
    float gaji(){
        float gaji = gajiManager;
        System.out.println("gaji = "+gajiManager);
        return gajiManager;
    }
    
    @Override
    float jam(){
        float jam = jamkerjaManager;
        System.out.println("lama bekerja = "+jamkerjaManager+" jam");
        return jamkerjaManager;
    }
    
    @Override
    float total(){
        float total = gajiManager - potonganManager;
        System.out.println("total gaji = "+ total);
        return total;
    }
}
