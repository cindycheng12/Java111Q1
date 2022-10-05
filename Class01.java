package test;
class area_volume {
    double length;
    double width;
    double heigth;    
    area_volume(double length,double width,double heigth){
    this.length=length;
    this.width=width;
    this.heigth=heigth;
    }
    double area(){  //矩形面積
    double b;
    b=length*width;
    return b;
    }
    double volume(){  //立方體體積
    double b;
    b=length*width*heigth;
    return b;
    }
    
    }

    public class Class01 {
        public static void main(String[] args){
        area_volume a=new area_volume(2,5,0);
        area_volume b=new area_volume(2,5,5);    
        double c=a.area();   //a的面積
        double d=b.volume();  //b的體積
        System.out.println("矩形a="+"\n"+"長："+a.length+" "+"寬："+a.width+"\n"+"面積為："+c+"\n");
        System.out.println("立方體b="+"\n"+"長："+b.length+" "+"寬："+b.width+"高："+b.heigth+"\n"+"體積為："+d+"\n");
        }
   }
    
