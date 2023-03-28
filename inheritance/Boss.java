/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Rafael Axel
 */
public class Boss extends Employee{

    float nipboss;
    String namaboss;
    String jabatanboss;
    float gajiboss;
    float potonganboss;
    float jamkerjaboss;
    float totalgajiboss;
    
    @Override
    float nip(){
        float nip = nipboss;
        System.out.println("nip = "+ nip);
        return 0;
    }
    
    public void nama(){
        String nama = namaboss;
        System.out.println("nama = "+namaboss);
//        return nama;
    }
    
    public String jabatan1(){
        String jabatan = jabatanboss;
        System.out.println("jabatan = "+jabatanboss);
        return jabatan;
    }
    
    @Override
    float potongan(){
        float potongan = potonganboss;
        System.out.println("potongan gaji = "+potonganboss);
        return potonganboss;
    }
    
    @Override
    float gaji(){
        float gaji = gajiboss;
        System.out.println("gaji = "+gajiboss);
        return gajiboss;
    }
    
    @Override
    float jam(){
        float jam = jamkerjaboss;
        System.out.println("lama bekerja = "+jamkerjaboss +" jam");
        return jamkerjaboss;
    }
    
    @Override
    float total(){
        float total = gajiboss - potonganboss;
        System.out.println("total gaji = "+ total);
        return total;
    }
}
