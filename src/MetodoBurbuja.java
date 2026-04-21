public class MetodoBurbuja {
    int[] arreglo;
    //Constructor vacio
    public MetodoBurbuja(int[]arreglo){
        System.out.println("Se creo la clase MetodoBurbuja");
        //1RA FORMA
        //INSTANCIAR CON VALOR CREADO EN CONSTRUCTOR
        //this.arreglo = new int[]{10,5,8,7};

        //2DA FORMA
        //INSTANCIA CON VALOR DESDE PARAMETROS
        this.arreglo =arreglo;
    }

    public void ordenarAscendente(){
        for(int i =0; i < arreglo.length; i++) {
            for(int j =i + 1; j < arreglo.length; j++){
               //si se 
                if (arreglo[i] > arreglo[j]){
                    int aux =arreglo [i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;


                
                }
            }
        }
    }
    public void imprimirArreglo(){
        for(int numero: arreglo){
            System.out.println(numero + ", "); //CONCATENA UNA COMA Y UN ESPACIO
        }
        


        
    }
}