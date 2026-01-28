public class RectangleComputation {
    public static void main(String[] args){
        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        double area = height*width;
        double perimeter = (2*height)+(2*width);

        double epsilon = 1e-10;
        Boolean isSquare = (Math.abs((width/height)-1) < epsilon) ? true:false;
        String shape = (isSquare==true) ? "Square":"Rectangle";
        System.out.println("shape: " + shape);
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
        
    }

}