package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class JenisKelamin extends Model {
    public String namaKelamin;
    public String toString(){
        return this.namaKelamin;
    }
}