package natanael.duarte.exercicioslombok.controle;

import natanael.duarte.exercicioslombok.modelo.ModeloConversaoReal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControleConversaoReal {

    @GetMapping ("/")
    public String inicio (){
        return "Tela inicial!";
    }

    @GetMapping ("/conversaoreal")
    public String getReal () {

        ModeloConversaoReal p1 = new ModeloConversaoReal();

        p1.setReal(5);

        return "Reais: 5" +
                "Reais convertido para dolar: " + p1.conversaoDolar() +
                "Reais convertido para euro: " + p1.conversaoEuro();
    }

}