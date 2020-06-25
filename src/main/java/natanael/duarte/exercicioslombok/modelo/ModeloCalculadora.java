package natanael.duarte.exercicioslombok.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ModeloCalculadora {

    @Getter @Setter
    public double valor1;
    @Getter @Setter
    public double valor2;

    public double adicao () {
        return valor1 + valor2;
    }
    public double subtracao () {
        return valor1 - valor2;
    }
    public double divisao () {
        return valor1 / valor2; }

    public double multiplicacao () {
        return valor1 * valor2;
    }

}