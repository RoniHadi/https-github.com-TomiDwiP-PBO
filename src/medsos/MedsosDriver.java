package medsos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author TomiDP
 */
public class MedsosDriver {
    public static void main(String args[]){
        //Lingkaran Arraylist Teman
        ArrayList<Medsos> teman = new ArrayList<>();
        teman.add(new Medsos("Tomi Dwi Prasetyo","Laki-Laki","05-07-98","Tomi DP","tomidp98@gmail.com","123"));
        teman.add(new Medsos("Rahayu Nurul Khasanah","Perempuan","08-06-97","Rahayu NK","RahayuNK@gmail.com","123"));
        teman.add(new Medsos("Roni Hadi Wijaya","Laki-laki","16-05-98","Roni Hadi","ronihady@gmail.com","998"));
        teman.add(new Medsos("Ardila Intan Bahari","Perempuan","13-09-98","Ardila","ardilaintan@gmail.com","234"));
        teman.add(new Medsos("M. Risvi K. Aziz","Laki-laki","06-05-97","Rispi KA","AzizRisvi@gmail.com","987"));
        
        //Menampilkan isi ArrayList dengan hanya menampilkan beberapa datanya
        System.out.println("Nama\t\t\tJenis Kelamin\temail");
        for(int i = 0; i<teman.size(); i++)
            System.out.println(teman.get(i).getNama()+"\t"+teman.get(i).getJenisKelamin()+"\t"+teman.get(i).getEmail());
        
        //Sorting menurut abjad
        Collections.sort(teman);
        System.out.println("");
        System.out.println("Setelah sorting");
        System.out.println("Nama\t\t\tJenis Kelamin\temail");
        for(int i = 0; i<teman.size(); i++)
            System.out.println(teman.get(i).getNama()+"\t"+teman.get(i).getJenisKelamin()+"\t"+teman.get(i).getEmail());
        
        //Membuat Hashmap dari Arraylist teman dengan key "Teman"
        HashMap<String, ArrayList> Teman = new HashMap<String, ArrayList>();
        Teman.put("Teman", teman);
        
        //Menampilkan isi Hashmap berdasarkan key "Teman"
        boolean n = Teman.containsKey("Teman");
        int i = 0;
        System.out.println("");
        System.out.println("HashMap");
        System.out.println("Nama\t\t\tJenis Kelamin\temail");
        for(n = true; i<teman.size(); i++)
            System.out.println(teman.get(i).getNama()+"\t"+teman.get(i).getJenisKelamin()+"\t"+teman.get(i).getEmail()); 
    }
}
