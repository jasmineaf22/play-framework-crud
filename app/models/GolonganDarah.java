package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class GolonganDarah extends Model {
    public String namaGoldar;
    public String toString() {
        return this.namaGoldar;
    }
}
