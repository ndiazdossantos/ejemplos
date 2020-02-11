/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraysbidimensional;

/**
 *
 * @author noese
 */
public class MetodoMatriz {
    public int[][] crearMatriz(int[][]taboa){
        for(int f= 0;f<taboa.length;f++)
            for(int c=0;c<taboa[f].length;c++){
                taboa[f][c] = PedirDato.pedirInt();
            }
        return taboa;
        }
    public void amosar(int[][]taboa){
        for(int f=0;f<taboa.length;f++){
            System.out.println("\n"); // para hacer un salto
            for(int c=0;c<taboa[f].length;c++)
                System.out.print(taboa[f][c]+"  "); // fijarse que solo es print
    }
    }
    public void sair(){
        System.exit(0); // por defecto es el 0
    }
    public void arrayString(int[][]taboa){
        int filas = taboa.length;
        int columnas=taboa[0].length;
    }
    public String[] arraysFila(int[][] taboa){
        String[]filas= new String[taboa.length];
        for(int i = 0;i<filas.length;i++)
            filas[i]=PedirDato.pedirMensaxe("nome filas ");
         return filas;
    }
public String[] arraysColumnas(int [][] taboa){
    String [] columnas= new String[taboa[0].length];
    for(int i = 0;i<columnas.length;i++)
            columnas[i]=PedirDato.pedirMensaxe("nome columnas ");
         return columnas;
}
public void amosarTodo (int[][] tabla,String[]alumnos,String[]modulos){
        System.out.print("       ");
        for (int i=0;i<modulos.length;i++)
            System.out.print(modulos[i]+"| ");
        System.out.println("");
        for (int f=0;f<tabla.length;f++){
        System.out.print(alumnos[f]+" |");
            for (int c=0;c<tabla[f].length;c++){
                System.out.print(tabla[f][c]+" | " );
            }
            System.out.println("");
        }
    }
    public int []mediaAlumnos(int[][] taboa,int[]mAlum){
       int acu=0;
        for( int f=0;f<taboa.length;f++){
            acu=0;
            for( int c=0;c<taboa.length;c++){
              acu= acu + taboa[f][c];
        }
        mAlum[f]=acu/taboa[f].length;
            System.out.println("Media Alumno"+(f+1)+"  "+mAlum[f]);
    }
    return mAlum;    
    }
   
 public int []mediaModulos(int[][] taboa,int[]mModulos){
       int acu=0;
        for( int c=0;c<mModulos.length;c++){
            acu=0;
            for( int f=0;f<taboa.length;f++)
              acu= acu + taboa[f][c];
                System.out.println("Modulo"+(c+1)+"  "+acu/mModulos.length);
                mModulos[c]=acu/mModulos.length;
        }
    
         return mModulos;
    }

}


