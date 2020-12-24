
package tread;


public class Tread {

    
    public static void main(String[] args) throws InterruptedException {

        ResulThread resultadoD = new ResulThread(2, 12, -14);//cria a thread que recebe A,B,C
        int resultadoDelta;//variavel que recebe o delta

        resultadoD.start();//inicia thread delta

        synchronized (resultadoD) { //trava em thread, exclusao mutua
            try {
                resultadoD.wait(); // thread main libera objeto thread e main adormece
            } catch (InterruptedException e) {
                System.out.println("thread interropida");
            }

        }
        resultadoDelta = resultadoD.getDelta();//pega e armazena o resulatado da thread do delta

        resultadoD.xis(resultadoDelta);//pego outro metodo sincronizado e calcula em outra thread x1 e x2 
    }
}
