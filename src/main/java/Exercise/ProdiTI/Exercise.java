/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise.ProdiTI;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author azis
 */

@Controller
public class Exercise {
    
    @RequestMapping("/dataPenduduk")
    public String getTable (Model tiki) {
        
        ArrayList<List<String>> data = new ArrayList ();
        
        
        
         data.add(Arrays.asList("059","Aziz", "21320059","Desa Dukka"));
         
         data.add(Arrays.asList("060","Alya", "21320060","Desa Takpernahternilai"));
         
         data.add(Arrays.asList("061","Asra", "21320061","Desa Kusut"));
        
         data.add(Arrays.asList("062","Mela", "21320062","Desa Zonanyaman"));
         
         data.add(Arrays.asList("063","Azam", "21320063","Desa Menghitunghari"));
         
         data.add(Arrays.asList("064","Tika", "21320064","Desa Hitamputih"));
         
         data.add(Arrays.asList("065","Agus", "21320065","Desa Takpernahberpaling"));
         
         data.add(Arrays.asList("066","Fiaa", "21320066","Desa Bernafatanpamu"));
         
         data.add(Arrays.asList("067","Andi", "21320067","Desa Seluruhnafaini"));
         
         
         data.add(Arrays.asList("068","Elin", "21320068","Desa PernahMencintai"));
         
         data.add(Arrays.asList("069","Nico", "21320069","Desa SinggahdiHati"));
         
         data.add(Arrays.asList("070","Liza", "21320070","Desa Ditinggalpergi"));
         
         data.add(Arrays.asList("071","Alam", "21320071","Desa Salingmencintai"));
         
         data.add(Arrays.asList("072","Bela", "21320072","Desa Menghianati"));
         
         data.add(Arrays.asList("073","Adam", "21320073","Desa Selamatjalan"));
         
         data.add(Arrays.asList("074","Diva", "21320074","Desa Kenanglahaku"));
         
         data.add(Arrays.asList("075","Aldo", "21320075","Desa Yangterdalam"));
         
         data.add(Arrays.asList("076","Fara", "21320076","Desa Meninggalkanmu"));
         
         data.add(Arrays.asList("077","Boby", "21320077","Desa Melepaskanmu"));
         
         data.add(Arrays.asList("078","Gita", "21320078","Desa Merindukanmu"));
        
        
        
        tiki.addAttribute("table", data );
        
        return "table";
    }
    
    
    
}

    

