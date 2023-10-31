import java.util.Scanner;

public class OOPS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Student s1 = new Student("xyz");
        // // s1.name="sai";
        // System.out.println(s1.name);
        // System.out.println(s1.age);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Complex comp = new Complex(x1,y1,x2,y2);
        comp.add();
        comp.difference();
        comp.product();

        sc.close();
        
    }
}


class Student{
    String name ="sai";
    int age;
     Student(String name){
        this.name = name;
    }
}

class Complex{
    int x1,y1,x2,y2;
    int X,Y;
    Complex(int x1,int y1,int x2,int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    void condition(){
        if(this.Y>=0){
            System.out.println(this.X+"+"+this.Y+"i");
        }else{
            System.out.println(this.X+""+this.Y+"i");
        }   
    }

    void add(){
        this.X = this.x1+this.x2;
        this.Y = this.y1+this.y2;
        condition();
    }

    void difference(){
        this.X = this.x1-this.x2;
        this.Y = this.y1-this.y2;
        condition();   
    }

    // (a+bi)(c+di) = (ac-bd)+(ad-bc)i
    void product(){
        this.X = this.x1*this.x2-this.y1*this.y2;
        this.Y = this.x1*this.y2+this.x2*this.y1;
        condition();
    }
}

