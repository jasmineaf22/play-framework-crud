package controllers;

import models.*;
import play.mvc.Controller;
import play.mvc.With;


import java.util.List;
@With(Secure.class)
public class Application extends Controller {

    public static void index() {
        String user = Security.connected();
        render(user);
    }

    public static void tampilkan() {
        List<Pegawai> daftar = Pegawai.findAll();
        render(daftar);
    }

    public static void baru() {
        List<GolonganDarah> golongandarahs = GolonganDarah.findAll();
        List<Kota> kotas = Kota.findAll();
        render(golongandarahs, kotas);
    }

    public static void simpan(Pegawai pegawai) {
    Pegawai newPegawai = new Pegawai();
    newPegawai.nama = pegawai.nama;
    newPegawai.umur = pegawai.umur;
    newPegawai.goldar = pegawai.goldar;
    newPegawai.kota = pegawai.kota;
    newPegawai.save();
    tampilkan();
}

    // public static void hapus(Long id) {
    //     Pegawai pegawai = Pegawai.findById(id);
    //     pegawai.delete();
    //     tampilkan();
    // }

    public static void edit(Long id) {
        Pegawai z = Pegawai.find("id=?1", id).first();
        List<GolonganDarah> golongandarahs = GolonganDarah.findAll();
        List<Kota> kotas = Kota.findAll();
        render(z, golongandarahs, kotas);
    }

    // public static void update(Pegawai pegawai) {
    //     Pegawai newPegawai = Pegawai.findById(pegawai.id);
    //     newPegawai.nama = pegawai.nama;
    //     newPegawai.umur = pegawai.umur;
    //     newPegawai.goldar = pegawai.goldar;
    //     newPegawai.kota = pegawai.kota;
    //     newPegawai.save();
    //     tampilkan();
    // }


    
}

