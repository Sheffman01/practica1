package condicionescompetencias;
import javax.swing.JTextArea;
public class Hilo extends Thread {
        private  JTextArea area;
        private RCompartido rC;
        private final static int inic=1995;
        private final static int fin=2000;
        Hilo(JTextArea area, RCompartido rC, int num){
                this.area = area;
                this.rC = rC;
                this.setName(" Perrito " + num );
        }
        public void run(){
                while(true){
                        try{
                            
                             rC.setDatoCompartido(this.getName());
                             
                             area.append(  rC.getDatoCompartido() + ": Eats" + "\n");
                             Thread.sleep((int)(inic+Math.random()*fin));
                        }catch(Exception e){e.printStackTrace();}
                }
        }
}
