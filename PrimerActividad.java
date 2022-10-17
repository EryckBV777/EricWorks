public class PrimeraClase {

    public static void main(String[] args) {
        
        //Primer Ejercicio
        /* 
        int edad = 18;
        if(edad <= 1){
            System.out.println("Bebe");
        }
        if(edad >= 2 && edad <= 11){
            System.out.println("Niño");
        }
        if(edad >= 12 && edad <= 16){
            System.out.println("Puberto");
        }
        if(edad >= 17 && edad <= 21){
            System.out.println("Joven");
        }
        if(edad >= 22){
            System.out.println("Adulto");
        }
         */

        //Segundo Ejercicio 
        
        int historia = 10;
        int algebra = 10;
        int quimica = 10;
        int algoritmos = 10;
        int matematicas = 10;
        int fundamentos = 5;
        int ingles = 5;
        float sumaTotal;
        float promedio;
        
        if(historia <= 5){
            System.out.println("Estas reprobado: " + historia);
        }else{
            System.out.println("Estas aprobado:" + historia);
        }
        if(quimica <= 5){
            System.out.println("Estas reprobado:" + quimica);
        }else{
            System.out.println("Estas aprobado:" + quimica);
        }
        if(algoritmos <= 5){
            System.out.println("Estas reprobado" + algoritmos);
        }else{
            System.out.println("Estas aprobado:" + algoritmos);
        }
        if(matematicas <= 5){
            System.out.println("Estas reprobado:" + matematicas);
        }else{
            System.out.println("Estas aprobado:" + matematicas);
        }
        if(fundamentos <= 5){
            System.out.println("Estas reprobado:" + fundamentos);
        }else{
            System.out.println("Estas aprobado:" + fundamentos);
        }
        if(ingles <= 5){
            System.out.println("Estas reprobado:" + ingles);
        }else{
            System.out.println("Estas aprobado:" + ingles);
        }
        sumaTotal = historia + algebra + quimica + algoritmos + matematicas + fundamentos + ingles;
        promedio = sumaTotal / 7;
        System.out.println(promedio);
        
    } 
}
