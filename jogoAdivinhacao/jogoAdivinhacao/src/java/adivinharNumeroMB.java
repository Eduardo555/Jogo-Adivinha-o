import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped; 
import java.util.Random;
/**
 *
 * @author eduardo
 */
@ManagedBean
@ViewScoped
public class adivinharNumeroMB {

    private Integer numeroSecreto;
    private Integer numeroPalpite = 0;
    private Integer rodadas = 10;
    private String numeroSecretoExibir = "xxxxxxx";
    private String mensagem = "Sem nenhuma dica por enquanto";
    
    public void verificaPalpite(){
        if(rodadas > 0 && numeroPalpite == numeroSecreto){
             /*mostrar numero*/
        }
        else if(rodadas > 0){
            rodadas --;
            /*gerar mensagem de dica*/
        }
        else{
            mensagem = "Você perdeu suas chances acabaram!";
        }
    }
    
    public Integer getNumeroSecreto() {
        return numeroSecreto;
    }

    public void setNumeroSecreto(Integer numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
    }

    public Integer getNumeroPalpite() {
        return numeroPalpite;
    }

    public void setNumeroPalpite(Integer numeroPalpite) {
        this.numeroPalpite = numeroPalpite;
    }

    public Integer getRodadas() {
        return rodadas;
    }

    public void setRodadas(Integer rodadas) {
        this.rodadas = rodadas;
    }
    
    public adivinharNumeroMB() {
        numeroSecreto = new Random().nextInt(100);
    }

    public String getNumeroSecretoExibir() {
        return numeroSecretoExibir;
    }

    public void setNumeroSecretoExibir(String numeroSecretoExibir) {
        this.numeroSecretoExibir = numeroSecretoExibir;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
