import java.util.Scanner;
public class Main {

    Scanner sc=new Scanner(System.in);
    static int fil, col, disparoX,disparoY,disparoX2,disparoY2;
    static String p2, p1;
    static int array[][];
    static Scanner leer = new Scanner(System.in);
    static int tirosJugador1 = 4;
    static int tirosJugador2 = 4;
    static int campo[][];

    public static void main(String[] args) {

        System.out.println("Ingresa el numero de fila de tu tablero a generar");
        fil =  leer.nextInt();

        System.out.println("Ingresa el numero de columnas de tu tablero a generar");
        col = leer.nextInt();
        array = new int [fil][col];
        campo = new int [fil][col];

        for( int i = 0; i < fil; i++){
            for(int j = 0; j < col; j++){
                array[i][j] = 0;
            }
        }

        for( int i = 0; i < fil; i++){
            for(int j = 0; j < col; j++){
                campo[i][j] = 0;
            }
        }

        System.out.println("Este es tu tablero, la partida de batalla naval comenzara pronto jugadores: ");

        for( int i = 0; i < fil; i++){
            for(int j = 0; j < col; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }


        System.out.println("Ingresa tu nombre Jugador 1");
        p1 = leer.next();
        System.out.println("Ingresa tu nombre Jugador 2");
        p2 = leer.next();
        System.out.println("¿Quieres empezar la partida?");
        String inicio = leer.next();

        if(inicio.equalsIgnoreCase("si")){
            System.out.println("Bienvenido a batalla naval " + p1);
            System.out.println("¿Quieres comenzar a colocar tus barcos? Si o No");
            String opcion = leer.next();
            if(opcion.equalsIgnoreCase("si")){
                barcosJug1();
            }
            System.out.println("Bienvenido " + p2);
            System.out.println("¿Quieres comenzar a ingresar tus barcos? Si o No");
            String opc = leer.next();
            if(opc.equalsIgnoreCase("si")){
                barcosJug2();
            }
            juego();
        }




    }





    public static void juego(){
        System.out.println("Turno de el " + p1);
        for(int i=0;i<array.length;i++)
            for(int j=0;j<array.length-1;j++)

                for(int k=0;k<campo.length;k++)
                    for(int l=0;l<campo.length-1;l++)
                        while(array[i][j]==1&&campo[k][l]==1){
                            System.out.println("turno del jugador"+p1+" " );


                            System.out.println("Ingresa tu disparo en la posicion horizontal de tu tablero");
                            disparoX = leer.nextInt();

                            System.out.println("Ingresa tu disparo en la posicion vertical de tu tablero");
                            disparoY =leer.nextInt();
                            if(disparoX>=0&&disparoX<fil&&disparoY>=0&&disparoY<col){
                                if(campo[disparoX][disparoY]==1){
                                    System.out.println("El tiro le dio con exito a un barco");
                                    for(int m=0;m<fil;m++){
                                        for(int z=0;z<col;z++){
                                            campo[disparoX][disparoY]=89;
                                        }
                                    }
                                }else if(campo[disparoX][disparoY]==0){
                                    System.out.println("No le has dado a ningun barco");
                                    for(int m=0;m<fil;m++){
                                        for(int z=0;z<col;z++){
                                            campo[disparoX][disparoY]=89;
                                        }
                                    }
                                }else if(campo[disparoX][disparoY]==89){
                                    System.out.println("Ya atacaste esa coordenada");
                                }
                            }
                            System.out.println("turno del jugador"+p2+ " " );


                            System.out.println("Ingresa tu disparo en la posicion horizontal de tu tablero");
                            disparoX2 = leer.nextInt();

                            System.out.println("Ingresa tu disparo en la posicion vertical de tu tablero");
                            disparoY2 =leer.nextInt();
                            if(disparoX2>=0&&disparoX2<fil&&disparoY2>=0&&disparoY2<col){
                                if(array[disparoX2][disparoY2]==1){
                                    System.out.println("El tiro le dio con exito a un barco");
                                    for(int m=0;m<fil;m++){
                                        for(int z=0;z<col;z++){
                                            array[disparoX2][disparoY2]=5;
                                        }
                                    }
                                }else if(array[disparoX2][disparoY2]==0){
                                    System.out.println("No le has dado a ningun barco");
                                    for(int m=0;m<fil;m++){
                                        for(int z=0;z<col;z++){
                                            array[disparoX2][disparoY2]=5;
                                        }
                                    }
                                }else if(array[disparoX2][disparoY2]==5){
                                    System.out.println("Ya atacaste esa coordenada.");
                                }
                            }

                        }
        for(int i=0;i<array.length;i++)
            for(int j=0;j<array.length-1;j++)

                for(int k=0;k<campo.length;k++)
                    for(int l=0;l<campo.length-1;l++)
                        if(campo[k][l]==1||array[i][j]==1){
                            if(campo[k][l]==1){
                                System.out.println("Mala suerte... el jugador " +p2 +"perdio la partida.");
                                for( int t = 0; t < fil; t++){
                                    for(int r = 0; r < col; r++){
                                        System.out.print(campo[t][r] + " ");
                                    }
                                    System.out.println("");
                                }

                            }else{
                                System.out.println("Felicidades, Ganaste la partida jugador " + p2);
                                for( int t = 0; t < fil; t++){
                                    for(int r = 0; r < col; r++){
                                        System.out.print(campo[t][r] + " ");
                                    }
                                    System.out.println("");
                                }
                            }
                            if(array[i][j]==1){
                                System.out.println("Mala suerte... el jugador " +p1 +"perdio la partida.");
                                for( int t = 0; t < fil; t++){
                                    for(int r = 0; r < col; r++){
                                        System.out.print(array[t][r] + " ");
                                    }
                                    System.out.println("");
                                }

                            }else{
                                System.out.println("Felicidades, ganaste la partida jugador " + p1);
                                for( int t = 0; t < fil; t++){
                                    for(int r = 0; r < col; r++){
                                        System.out.print(array[t][r] + " ");
                                    }
                                    System.out.println("");
                                }
                            }
                            return;
                        }
    }








    public static void barcosJug1(){
        String posicion;

        System.out.println("Ingresa la posicion de tu barco 1  Horizontal o Vertical");
        posicion = leer.next();

        if(posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 1");
            int horizontal = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 1");
            int columna =leer.nextInt();

            if(horizontal >= 0 && horizontal <= fil && columna >= 0 && columna <col-4  ){
                for(int i = 0; i < 4; i++){
                    array[horizontal][columna + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(posicion.equalsIgnoreCase("v")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 1 ");
            int horizontal = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 1");
            int columna =leer.nextInt();

            if(horizontal >= 0 && horizontal <= fil-4 && columna >= 0 && columna <= col ){
                for(int i = 0; i < 4; i++){
                    array[horizontal][columna + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(array[j][i] + " ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("Ingresa una cordenada valida en tu tablero");
        }

        System.out.println("Ingresa la posicion de tu barco 2: Horizontal o Vertical");
        posicion = leer.next();

        if(posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 2");
            int horizontal = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 2");
            int columna =leer.nextInt();

            if(horizontal >= 0 && horizontal <= fil && columna >= 0 && columna <col-3 ){
                for(int i = 0; i < 3; i++){
                    array[horizontal][columna + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(posicion.equalsIgnoreCase("v")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 2");
            int horizontal = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 2");
            int columna =leer.nextInt();

            if(horizontal >= 0 && horizontal <= fil-3 && columna >= 0 && columna <col ){
                for(int i = 0; i < 3; i++){
                    array[horizontal + i][columna] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }


        System.out.println("Ingresa la posicion de tu barco 3: Horizontal o Vertical");
        posicion = leer.next();

        if(posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 3");
            int horizontal = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 3 ");
            int columna =leer.nextInt();

            if(horizontal >= 0 && horizontal <= fil && columna >= 0 && columna <col-2 ){
                for(int i = 0; i < 2; i++){
                    array[horizontal][columna + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(posicion.equalsIgnoreCase("v")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 3");
            int horizontal = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 3");
            int columna =leer.nextInt();

            if(horizontal >= 0 && horizontal <= fil-2 && columna >= 0 && columna < col ){
                for(int i = 0; i < 2; i++){
                    array[horizontal + i][columna] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }

        System.out.println("Ingresa la posicion de tu barco 4: Horizontal o Vertical");
        posicion = leer.next();

        if(posicion.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 4");
            int horizontal = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 4");
            int columna =leer.nextInt();

            if(horizontal >= 0 && horizontal <= fil && columna >= 0 && columna <col-1 ){
                for(int i = 0; i < 1; i++){
                    array[horizontal][columna + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(posicion.equalsIgnoreCase("v")){
            System.out.println("Ingresa la posicion vertical de tu barco numero 4");
            int horizontal = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 4");
            int columna =leer.nextInt();

            if(horizontal >= 0 && horizontal <= fil-1 && columna >= 0 && columna <= col ){
                for(int i = 0; i < 1; i++){
                    array[horizontal + i][columna] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }

    }

    public static void barcosJug2(){
        String psc;

        System.out.println("Ingresa la posicion de tu barco numero 1: Horizontal o Vertical");
        psc = leer.next();

        if(psc.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 1");
            int hrz = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 1");
            int ver =leer.nextInt();

            if(hrz >= 0 && hrz <= fil && ver >= 0 && ver <col-4 ){
                for(int i = 0; i < 4; i++){
                    campo[hrz][ver + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(psc.equalsIgnoreCase("v")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 1 ");
            int hrz = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 1");
            int ver =leer.nextInt();

            if(hrz >= 0 && hrz <= fil-4 && ver >= 0 && ver <= col ){
                for(int i = 0; i < 4; i++){
                    campo[hrz][ver + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[j][i] + " ");
                    }
                    System.out.println("");
                }
            }
        }else{
            System.out.println("Ingresa una cordenada valida en el tablero");
        }

        System.out.println("Ingresa la posicion de tu barco 2: Horizontal o Vertical");
        psc = leer.next();

        if(psc.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 2");
            int hrz = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 2");
            int ver =leer.nextInt();

            if(hrz >= 0 && hrz <= fil && ver >= 0 && ver <col-3 ){
                for(int i = 0; i < 3; i++){
                    campo[hrz][ver + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(psc.equalsIgnoreCase("v")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 2");
            int hrz = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 2");
            int ver =leer.nextInt();

            if(hrz >= 0 && hrz <= fil-3 && ver >= 0 && ver <= col ){
                for(int i = 0; i < 3; i++){
                    campo[hrz + i][ver] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }


        System.out.println("Ingresa la posicion de tu barco numero 3: Horizontal o Vertical ");
        psc = leer.next();

        if(psc.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 3 ");
            int hrz = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 3 ");
            int ver =leer.nextInt();

            if(hrz >= 0 && hrz <= fil && ver >= 0 && ver < col-2 ){
                for(int i = 0; i < 2; i++){
                    campo[hrz][ver + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(psc.equalsIgnoreCase("v")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 3");
            int hrz = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 3");
            int ver =leer.nextInt();

            if(hrz >= 0 && hrz <= fil-2 && ver >= 0 && ver <= col ){
                for(int i = 0; i < 2; i++){
                    campo[hrz + i][ver] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }

        System.out.println("Ingresa la posicion de tu barco numero 4: Horizontal o Vertical");
        psc = leer.next();

        if(psc.equalsIgnoreCase("h")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 4");
            int hrz = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 4");
            int ver =leer.nextInt();

            if(hrz >= 0 && hrz <= fil && ver >= 0 && ver < col-1 ){
                for(int i = 0; i < 1; i++){
                    campo[hrz][ver + i] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }

            }
        }else if(psc.equalsIgnoreCase("v")){
            System.out.println("Ingresa la posicion horizontal de tu barco numero 4");
            int hrz = leer.nextInt();

            System.out.println("Ingresa la posicion vertical de tu barco numero 4");
            int ver =leer.nextInt();

            if(hrz >= 0 && hrz <= fil-1 && ver >= 0 && ver <= col ){
                for(int i = 0; i < 1; i++){
                    campo[hrz + i][ver] = 1;
                }

                for( int i = 0; i < fil; i++){
                    for(int j = 0; j < col; j++){
                        System.out.print(campo[i][j] + " ");
                    }
                    System.out.println("");
                }
            }

        }

    }
}