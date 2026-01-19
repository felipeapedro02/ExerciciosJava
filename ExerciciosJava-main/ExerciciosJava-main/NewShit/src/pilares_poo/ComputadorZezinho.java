package pilares_poo;

public class ComputadorZezinho {
    public void main(String[] args) {

        SoftwareDeMensagensInstantaneas smi = null;
    /*
      NÃO SE SABE QUAL APP
      MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
    */
        String appEscolhido= "fbm";

        if(appEscolhido.equals("msn"))
            smi = new MSNmessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new facebook();

        smi.enviarMensagem();
        smi.receberMensagem();
    }

}
