
package retornovalores;

public class RetornoValores {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        
        triangulo.altura = 20;
        triangulo.base = 10;
        
        float resultado = triangulo.area();
        System.out.println(resultado);
    }
    
}

class Triangulo{
    float base;
    float altura;
    
    /*
    // Metodo que no retorna nada
    void area(){
        float resultado = (this.base * this.altura)/2;
    }
    */
    
    // Metodo que retorna un float
    float area(){
        float resultado = (this.base * this.altura)/2;
        return resultado;
    }
}
