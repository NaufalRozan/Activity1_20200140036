/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ti.umy.ac.id.Activity.kelas.B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ACER Naufal Rozan
 */
@Controller
public class projectController {
    
    @RequestMapping("/dataktp")
    public String getTable(Model Data)
    {
        ArrayList<List<String>> data = new ArrayList <>();
        
        data.add(Arrays.asList("ID", "Nomor KTP", "Nama", "Alamat"));
        data.add(Arrays.asList("001", "1116031408020001", "Naufal Rozan", "Jl Bintaro Raya 3 A RT 005/11, Dki Jakarta"));
        data.add(Arrays.asList("002", "3321110902070002", "Anubari Sandra", "Jl Raya Setu 17, Dki Jakarta"));
        data.add(Arrays.asList("003", "3321062311110003", "Legawa Hakim", "Jl Pondok Randu 103, Dki Jakarta"));
        data.add(Arrays.asList("004", "1402020507110002", "Kayla Oktaviani", "Jl Pademangan 2 Gg 21/23, Dki Jakarta"));
        data.add(Arrays.asList("005", "1402020607084474", "Asirwanda Latupono", "Plaza Graha Famili C 18, Jawa Timur"));
        data.add(Arrays.asList("006", "3321110903081076", "Ian Situmorang", "Jl Janur Indah XIV Bl LB-19/5, Dki Jakarta"));
        data.add(Arrays.asList("007", "7312060708103942", "Diana Susanti", " Jl HOS Cokroaminoto 71, Dki Jakarta"));
        data.add(Arrays.asList("008", "3321062001150015", "Karya Marbun", "Jl Suryopranoto 2 Kompl Harmoni Plaza F/14, Dki Jakarta"));
        data.add(Arrays.asList("009", "3321111411050020", "Lega Wasita", "Ged ITC Fatmawati Ks 18 Lt II, Dki Jakarta"));
        data.add(Arrays.asList("010", "1402020607083392", "Zulaikha Hasanah", "17/F, JL Jend. Sudirman Kav. 10-11, Tanah Abang"));
        data.add(Arrays.asList("011", "3326162401080001", "Patricia Wulandari", "Kompl Tmn Surya II Bl A-1/26, Dki Jakarta"));
        data.add(Arrays.asList("012", "3326162407080007", "Hari Thamrin", "Jl Binjai Km 12, Sumatera Utara"));
        data.add(Arrays.asList("013", "3326160608070224", "Kardi Widodo", "Jl Margomulyo Permai Bl Q/5, Jawa Timur"));
        data.add(Arrays.asList("014", "3326160302090001", "Candra Budiyanto", "Jl Nabet 4, Dki Jakarta"));
        data.add(Arrays.asList("015", "3326160608070048", "Gasti Wastuti", "Jl Kb Jeruk VII 26, Dki Jakarta"));
        data.add(Arrays.asList("016", "3326160608070203", "Wani Oktaviani", "Jl Kapt Muslim, Sumatera Utara"));
        data.add(Arrays.asList("017", "3326160608070224", "Asman Firmansyahi", "Jl Cempaka Putih Tgh 15/22, Dki Jakarta"));
        data.add(Arrays.asList("018", "3326160608070197", "Elma Sudiati", "Jl HR Rasuna Said Sentra Mulia Bldg, Dki Jakarta"));
        data.add(Arrays.asList("019", "3326160902090003", "Ade Handayani", "Jl H Mahmud III 8, Dki Jakarta"));
        data.add(Arrays.asList("020", "3326160302090001", "Tiara Widiastuti", "Jl Penggaron Kidul, Jawa Tengah"));
        
        Data.addAttribute("table", data);
        
        return "tableViewer";
    }
}
