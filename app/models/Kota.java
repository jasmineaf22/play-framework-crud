package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Kota extends Model {
    public String namaKota;
    public String toString(){
        return this.namaKota;
    }
}