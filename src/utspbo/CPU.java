/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;


public class CPU {
    
    protected String nama;
    protected int kecepatan;
    
    public CPU (int kecepatan,String nama){
        this.nama=nama;
        this.kecepatan=kecepatan;
    }
    
    public String getCPUData(){
        return (nama + " "+kecepatan);
    }
}
