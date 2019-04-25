/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;


public class komputer {
    private CPU cpu;
    
    public komputer(CPU cpu){
        this.cpu=cpu; 
    }
    public komputer(){
          
    }
    public void memasang (CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU : "+ cpu.getCPUData() +" GHz"+"dipasang");
    }
    public void mencabut (CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU : "+ cpu.getCPUData()+" GHz"+"dicabut");
    }
    public void cetakinfo (CPU cpu){
        System.out.println("Spesifikasi : CPU : "+ cpu.getCPUData()+" GHz");
    }

}
