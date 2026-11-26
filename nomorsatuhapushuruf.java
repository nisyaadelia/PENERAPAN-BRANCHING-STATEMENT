package Pertemuan6;
public class tugasnomor1 {  
    public static void main(String[] args) {
        String HilangkanhurufA="Beli Ikan";
        int max = HilangkanhurufA.length();   
        String hasil = " ";
        for (int i = 0 ; i <max; i++)  {
            char j = HilangkanhurufA.charAt(i);
            if ( j== 'k') {
                continue;
            }
            else {
                hasil += j;{                  
                }
            }
            
        }
        System.out.println("Jadi hasil akhirnya adalah " + hasil );   
    }
    
}
