import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double c;
    double d;
    double wynik;
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj a");
    double a =scan.nextDouble();
    System.out.println("Podaj b");
    double b =scan.nextDouble();
    System.out.println("Wybierz Działanie");
    System.out.println("1  Suma pól 2 kół o promieniach a i b");
    System.out.println("2  Pole prostokąta o bokach a i b");
    System.out.println("3  Pole trójkoąta prostokatnego o przyprostokątnych a i b");
    System.out.println("4  Suma pól 2 kwadratów o bokach a i b");
    
    System.out.println("wariant 1-4");
    int wariant =scan.nextInt();
    
    switch(wariant){
      case 1:
         c=3.14 * Math.pow(a,2); 
         d=3.14 * Math.pow(b,2);
         wynik=c+d;
        System.out.println("Wynik ="+ wynik);
        break;
        case 2:
         c=a*b; 
         wynik=c;
        System.out.println("Wynik ="+ wynik);
        break;
        case 3:
         c=a*b; 
         d=c*0.5;
         wynik=d;
        System.out.println("Wynik ="+ wynik);
        break;
        case 4:
         c=a*a; 
         d=b*b;
         wynik=c+d;
        System.out.println("Wynik ="+ wynik);
        break;
    }
   
    
    
  }
}