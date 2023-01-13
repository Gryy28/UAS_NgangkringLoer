package com.gnc.ngangkringloer;

import java.util.ArrayList;

public class DataAngkringan {

    public  static  String [][] data = new String[][]{
            {"Angkringan Mang Pen","Jl. Segaran No.230, 14 Ilir, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30111","https://goo.gl/maps/4CjhUk3hvaxB6fwF8" },
            {"Angkringan Mas Sigit","Jl. Jend. Basuki Rachmat No.1607C, Pahlawan, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30128","https://goo.gl/maps/BSFdjGJPG5dCYD6y7" },
            {"Gaskuy Angkringan","Jl. Kapten A. Rivai, Sungai Pangeran, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan","https://goo.gl/maps/ma6wz3fHtRcaBW3n9" },
            {"Angkringan PeWe","Jl. Trikora No.4720, 20 Ilir D. III, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30151","https://goo.gl/maps/qRvwDCJEnjQz1Lf28" },
            {"Angkringan Bangjo","Jl Demang Lebar Daun, Ilir Barat I, Palembang City, South Sumatra 30151","https://goo.gl/maps/N2L6bxdg9tHiJrki8" },
            {"Angkringan Laper Dalu","20 Ilir D. III, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30121","https://goo.gl/maps/gMfWsUFSxxPDYqTR7" },
            {"Angkringan Santai(ANGSA)","20 Ilir D. III, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan","https://goo.gl/maps/ZBzyrJZiMCwzsxUv9"},
            {"Angkringan Sekawan","Jl. Angkatan 45 No.2250, Lorok Pakjo, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30151","https://goo.gl/maps/29uz7GDyaRPJ8mGc9" },
            {"Angkringan Classic Sco","Jl. Trikora Jl. Demang Lebar Daun, 20 Ilir D. III, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan","https://goo.gl/maps/qH5BSRjurtCsZCiUA" },
            {"Angkringan Kopi Bro","jl.Jendral Sudirman No.2937C, depan RS. Moh Hoesin, Palembang, 20 Ilir D. III, Ilir Timur I, Palembang City, South Sumatra 30129","https://goo.gl/maps/wXeskNRUeFFLtMya8" },
            {"Angkringan Bakul Lawas Palembang","Jl. Sumpah Pemuda No.7, Lorok Pakjo, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30137","https://goo.gl/maps/GtxgjPpQ1DNHYAz29" },
            {"Angkringan Peh","Jl. Jend. Sudirman No.586-1, Ario Kemuning, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30151","https://goo.gl/maps/nS1ahkDudkCg9xzA9" },
            {"Angkringan Semar Kedaung","Jl. KH. Ahmad Dahlan Kel No.33, Talang Semut, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30135","https://goo.gl/maps/tLijDzeYT3ChAD5q9" },
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
