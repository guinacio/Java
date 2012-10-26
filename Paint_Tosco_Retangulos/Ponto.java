import static java.lang.Math.*;


class Ponto {
  //Atributos
  int x,y;

  //Construtores
  Ponto(){}
  Ponto(int n1, int n2) { this.x = n1; this.y = n2;}
  Ponto(int n) { this(n,n);}

  //Metodos ...
  void deslocarX(int val) {
    x = x + val;
  }
  void deslocarY(int val) {
    y = y + val;
  }
  double norma() {
    return sqrt(x*x+y*y);
  }
  
  public String toString() {
    return "(" + x + "," + y + ")";
  }
  
}