package com.gnc.ngangkringloer;

import java.util.ArrayList;

public class DataAngkringan {

    public  static  String [][] data = new String[][]{
            {"Angkringan Mang Pen", },
            {"Angkringan Mas Sigit", },
            {"Gaskuy Angkringan", },
            {"Angkringan PeWe", },
            {"Angkringan Bangjo", },
            {"Angkringan Laper Dulu", },
            {"Angkringan Santai(ANGSA)", },
            {"Angkringan Sekawan", },
            {"Angkringan Classic Sco", },
            {"Angkringan Kopi Bro", },
            {"Angkringan Bakul Lawas Palembang", },
            {"Angkringan Peh", },
            {"Angkringan Semar Kedaung", },
    };

    public  static ArrayList<ModelAngkringan> ambilDataAngkringan(){
        ArrayList<ModelAngkringan> dataAngkringan = new ArrayList<>();
        for (String[] varData:data){
            ModelAngkringan model = new ModelAngkringan();
            model.setNama(varData[0]);
            model.setFoto(varData[1]);

            dataAngkringan.add(model);

        }
        return  dataAngkringan;
    }
}
