package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Pegawai extends Model {
    public String nama;
    public String umur;
    @ManyToOne
    public GolonganDarah goldar;
    @ManyToOne
    public Kota kota;

    public String toString() {
        return this.nama;
    }
}
