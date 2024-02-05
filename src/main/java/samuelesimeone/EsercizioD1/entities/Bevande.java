package samuelesimeone.EsercizioD1.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Bevande extends Alimenti{
    private double litri;

    public Bevande(String nome, long cal, double prezzo, double litri) {
        super(nome, cal, prezzo);
        this.litri = litri;
    }

    public String toString() {
        return "Pizze{" +
                "nome= " + getNome() +
                " litri= " + litri +
                " cal= " + getCal() +
                " prezzo= " + getPrezzo() +
                '}';
    }
}
