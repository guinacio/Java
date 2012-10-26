import static java.lang.Math.*;

class Retangulo {
  Ponto a,b;

  Retangulo() {}
   Retangulo(Ponto p1, Ponto p2) {
     a = p1;
     b = p2;
   }


   int x0() {
     int x0 = a.x;
     if(x0 > b.x) x0 = b.x; 
     return x0;
   }
   int y0() {
     int y0 = a.y;
     if(y0 > b.y) y0 = b.y; 
     return y0;
   }
   
  void deslocarX(int val) {
    a.deslocarX(val);
    b.deslocarX(val);
  }
  void deslocarY(int val)
  {
    a.deslocarY(val);
    b.deslocarY(val);
  }
   int largura() {
     return abs(a.x-b.x);
   }
   int altura() {
     return abs(a.y-b.y);
   }
   int area() {
     return this.largura() * this.altura();
   }
   int perimetro() {
     return 2 * this.largura() + 2 * this.altura();
   }
   
  public String toString() {
    return "Retangulo(" + a + "," + b + ")";
  }

   
}