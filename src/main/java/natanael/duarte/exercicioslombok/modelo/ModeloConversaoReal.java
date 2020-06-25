package natanael.duarte.exercicioslombok.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ModeloConversaoReal {

    @Getter @Setter
    private double real;

    public double conversaoDolar () {
        return real*5.35;
    }

    public double conversaoEuro () {
        return real*6.01;
    }

}