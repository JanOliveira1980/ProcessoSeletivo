import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
        /*analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2200.0);*/
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            if(salarioBase >= salarioPretendido){
                System.out.println("o candidato " + candidato + " foi escolhido");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2000.0);
    }
        static void analisarCandidato(double salarioPretendido){
          double salarioBase = 2000.0;
          if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
    
          }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
          }  else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
          }
    }
}
