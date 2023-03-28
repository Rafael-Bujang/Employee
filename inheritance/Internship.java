/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Rafael Axel
 */
public class Internship extends Employee{
    float nipInternship;
    String namaInternship;
    String jabatanInternship;
    float gajiInternship;
    float potonganInternship;
    float jamkerjaInternship;
    float totalgajiInternship;
    
    @Override
    float nip(){
        float nip = nipInternship;
        System.out.println("nip = "+ nip);
        return 0;
    }
    
    
    public String nama4(){
        String nama = namaInternship;
        System.out.println("nama = "+namaInternship);
        return nama;
    }
    
    
    String jabatan4(){
        String jabatan = jabatanInternship;
        System.out.println("jabatan = "+jabatanInternship);
        return jabatan;
    }
    
    @Override
    float potongan(){
        float potongan = potonganInternship;
        System.out.println("potongan gaji = "+potonganInternship);
        return potonganInternship;
    }
    
    @Override
    float gaji(){
        float gaji = gajiInternship;
        gaji -= potongan();
        System.out.println("gaji total = "+gajiInternship);
        return gajiInternship;
    }
    
    @Override
    float jam(){
        float jam = jamkerjaInternship;
        System.out.println("lama bekerja = "+jamkerjaInternship+" jam");
        return jamkerjaInternship;
    }
    
    @Override
    float total(){
        float total = gajiInternship - potonganInternship;
        System.out.println("total gaji = "+ total);
        return total;
    }
}
