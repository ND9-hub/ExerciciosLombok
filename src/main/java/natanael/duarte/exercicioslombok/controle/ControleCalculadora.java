package natanael.duarte.exercicioslombok.controle;

import natanael.duarte.exercicioslombok.modelo.ModeloCalculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControleCalculadora {

    @GetMapping("/")
    public String inicio (){
        return "Tela inicial!";
    }

    @GetMapping("/calculadora")
    public String getValor (){

        ModeloCalculadora p1 = new ModeloCalculadora ();

        p1.setValor1(4);
        p1.setValor2(2);

        return "Primeiro valor: 4" +
                "\nSegundo valor: 2" +
                "\nSoma dos dois valores: " + p1.adicao()+
                "\nSubtração dos dois valores: " + p1.subtracao() +
                "\nDivisão dos dois valores: " + p1.divisao()+
                "\nMultilplicação dos dois valores: " + p1.multiplicacao();
    }

}