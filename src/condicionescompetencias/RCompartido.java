package condicionescompetencias;
import java.util.ArrayList;

public class RCompartido {
       
        private String  datoCompartido;
        private ArrayList<Interrupcion> interrupciones;
        
        RCompartido(){
                datoCompartido = "";
                interrupciones = new ArrayList<Interrupcion>();
                for(int i=0;i<10;i++){
                    interrupciones.add(new Interrupcion());
                }
        }
        public String getDatoCompartido() {
           
            for(Interrupcion i:interrupciones)
                if(i.isInter()){
                       
                return datoCompartido;   
                }
               
            return "En espera...";
        }

        public void setDatoCompartido(String datoCompartido) {
            for(Interrupcion i:interrupciones)
                if(i.isInter())
                this.datoCompartido = datoCompartido;
        }

    public ArrayList<Interrupcion> getInterrupciones() {
        return interrupciones;
    }

    public void setInterrupciones(ArrayList<Interrupcion> interrupciones) {
        this.interrupciones = interrupciones;
    }
    public void bloquea(){
        for(Interrupcion inter:interrupciones)
            inter.setInter(false);
    } 
    public void desbloquea(){
         for(Interrupcion inter:interrupciones)
            inter.setInter(true);
    }
}
