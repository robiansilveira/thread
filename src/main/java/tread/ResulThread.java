
package tread;


public class ResulThread extends Thread {//extendendo threads
//variaveis
    private int a;
    private int b;
    private int c;
    private int delta;
    private int x1;
    private int x2;
    
//classe construtora
    public ResulThread(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void run() {//implementação do metodo run
       
        synchronized (this) { //entra em modo de sincronizacao
           
            System.out.println("Calculando Delta");

            try {
                ResulThread.sleep(2000); //faz a thread esperar
                this.delta = ((b * b) - (4 * a * c));//calcula o delta
            } catch (InterruptedException ex) {
                System.out.println("Thread interrompida"); //se a thread for interrompida
            }
            System.out.println("O Valor de Delta = " + this.delta);//mostra o deta setado
            notify();//notifica
        }
        
      
    }
    public void xis(int delta) throws InterruptedException{//metodo que calcula os xis
        synchronized (this) { //entra em modo de sincronizacao
             ResulThread.sleep(2000); 
            System.out.println("Calculando X");

            try {
                ResulThread.sleep(2000);//faz a thread esperar
                this.x1 = ((int) (-(b) + Math.sqrt(getDelta()))) / (2 * a);//calculax1
                this.x2 = ((int) (-(b) - Math.sqrt(getDelta()))) / (2 * a);//calculax2
            } catch (InterruptedException ex) {
                System.out.println("Thread interrompida");
            }
            System.out.println("O Valor x1 = " + this.x1);//mostra o x1 setado
            System.out.println("O Valor x2 = " + this.x2);//mostra o x2 setado
            notify();
        }
    }

    //metodos gets e sets

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

}
