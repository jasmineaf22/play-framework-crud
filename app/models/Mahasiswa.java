package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Mahasiswa extends Model {
    public String nama;
    public String nim;
    public String alamat;
    public Date tanggalLahir;
    public String kodepos;
    @ManyToOne
    public JenisKelamin kelamin;
    public String toString(){
        return this.nama;
    }
}
