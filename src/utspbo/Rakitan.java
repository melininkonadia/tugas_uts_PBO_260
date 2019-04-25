package utspbo;

public class Rakitan {
    public static void main(String[] args) {
        intell intel1 = new intell(2);
        AMD amd1 = new AMD(3);
        komputer komputer1 = new komputer (intel1);
     
     
        komputer1.cetakinfo();
        komputer1.mencabut(intel1);
        komputer1.memasang(amd1);
        komputer1.cetakinfo();
        
    }
    
}
