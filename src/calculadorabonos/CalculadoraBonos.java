package CalculadoraBonos;

public class CalculadoraBonos {
    int salario; 
        String mensajeDeBono; 
        public void calcular (){
        salario = 50000;
        mensajeDeBono = "Tu bono total es de: $" + (.02*salario);
        System.out.println(mensajeDeBono);
        
        }
   public static void main(String[] args) {
        CalculadoraBonos NuevoBono = new CalculadoraBonos ();
        NuevoBono.calcular();}

}