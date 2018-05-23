package cm;

import java.util.ArrayList;
import java.util.Arrays;

public class CM {
    public static void main(String[] args) {
        int imagem[][] = new int[5][5];
        imagem[4][0] = 1;
        imagem[1][2] = 1;
        
        int x = 0;
        int y = 0;
        contarObjetos(imagem, x, y);
    }
    
    public static int contarObjetos(int imagem[][], int x, int y){
        int counter = 0;
        int execucoes = 0;
        
        
        ArrayList<Objeto> objetos = new ArrayList<Objeto>();
        
        for(int i = x; i < largura(imagem); i++){
            for(int j = y; j < altura(imagem); j++){
                execucoes ++;
                if(pixel(imagem, i, j) == 1){
                    Objeto ob = new Objeto(i, j);
                    objetos.add(ob);
                    counter ++;
                }
            }
        }
        System.out.println(encontraMaisProximo(objetos, x, y).toString());
        return counter;
    }
    
    public static Objeto encontraMaisProximo(ArrayList<Objeto> objetos, int x, int y){
        double menorDistancia = 9999999999.0;
        Objeto objMaisPerto = new Objeto();
        
        for(Objeto o : objetos){
            double aux = o.calcularDistancia(x, y, o.getX(), o.getY());
            if(aux < menorDistancia){
                menorDistancia = aux;
                objMaisPerto.setX(o.getX());
                objMaisPerto.setY(o.getY());
            }
        }
        return objMaisPerto;
    }
    
    public static int pixel(int imagem[][], int x, int y){
        return imagem[x][y];
    }
    
    public static int altura(int matriz[][]){
        return 3;
    }
    
    public static int largura(int matriz[][]){
        return 3;
    }
}
