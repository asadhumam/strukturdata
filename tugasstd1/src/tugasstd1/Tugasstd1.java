/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasstd1;

/**
 *
 * @author WIWIN
 */
public class Tugasstd1 {

    public Tugasstd1 head = null;
    public Tugasstd1 tail = null;
    
    public int data;
    public Tugasstd1 next;
    
    public Tugasstd1 (int a){
        this.data = a;
        this.next = null;
    }
    
    public void addfirst (int masukkan){
        Tugasstd1 newTugasstd1 = new Tugasstd1(masukkan);
        
        if (head == null){
            head = newTugasstd1;
            tail = newTugasstd1;
        }else {
            Tugasstd1 sementara = head;
            head = newTugasstd1;
            
            head.next = sementara;
        }
    }
    
    public void addlast(int masukkan){
        Tugasstd1 newTugasstd1 = new Tugasstd1(masukkan);
        
        if (head == null) {
            head = newTugasstd1;
            tail = newTugasstd1;
        } else {
            tail.next = newTugasstd1;
            tail = newTugasstd1;
        }
    }
    
    public void remove (int muna){
        if (muna == 0){
            head = head.getnext();
            return;
        }
        
        Tugasstd1 current = head;
        int count = 0;
        while (muna <muna -1){
            current = current.getnext();
            if (current == null){
                throw new IndexOutOfBoundsException("hilang");
            }
            count++;
        }
    }
    
    public Tugasstd1(){
        this.getClass();
    }
    
    public String ttd(){
        String output = "";
        Tugasstd1 current = head;
        while (current!=null){
            output += current.getdata()+",";
            current = current.getnext();
        }
        return output;
    }
    
    public int getdata(){return data;}
    public Tugasstd1 getnext(){return next;}
    
    public void setdata (int d){data = d;}
    public void setnext (Tugasstd1 ma){next = ma;}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tugasstd1 keluar = new Tugasstd1();
        keluar.addfirst(3);
        keluar.addfirst(4);
        keluar.addfirst(5);
        keluar.addfirst(10);
        keluar.addlast(8);
        keluar.addlast(9);
        
        System.out.println(keluar.ttd());
        
        keluar.remove(3);
        
        System.out.println(keluar.ttd());
    }
    
}
