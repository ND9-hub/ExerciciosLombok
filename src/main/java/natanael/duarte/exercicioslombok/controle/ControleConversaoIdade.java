package natanael.duarte.exercicioslombok.controle;

import natanael.duarte.exercicioslombok.modelo.ModeloConversaoIdade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControleConversaoIdade {

    @GetMapping("/")
    public String inicio (){
        return "Tela inicial!";
    }

    @GetMapping("/conversoridade")
    public String getIdade (){

        ModeloConversaoIdade p1 = new ModeloConversaoIdade();

        p1.setIdade(18);

        return  "Idade: 18" +
                "\nIdade convertido para dias:" + p1.ConversaoDias() +
                "\nIdade convertido para semanas: " + p1.ConversaoSemana()+
                "\nIdade convertido para meses: " +p1.ConversaoMeses();
    }

}