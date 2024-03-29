package samuelesimeone.EsercizioD1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
public abstract class Alimenti {
    private String nome;
    private long cal;
    private double prezzo;

    @Override
    public String toString() {
        return "Alimenti{" +
                "nome='" + nome + '\'' +
                ", cal=" + cal +
                ", prezzo=" + prezzo +
                '}';
    }
}
