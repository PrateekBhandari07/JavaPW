package array;

public class area
{
    public void square(int side){
        System.out.println("Area of square : "+side*side);
    }
    public void triangle(int base,int height){
        System.out.println("Area of triangle : "+(0.5*(base*height)));
    }
    public void circle(int radius){
        System.out.println("Area of circle : "+(3.14*(radius*radius)));
    }
    public class perimeter{
        public void square(int side){
            System.out.println("Perimeter of square : "+(4*(side)));
        }
        public void triangle(int side){
            System.out.println("Perimeter of triangle : "+(3*(side)));
        }
        public void circle(int radius){
            System.out.println("Perimeter of square : "+(2*(radius*3.14)));
        }
    }

}

