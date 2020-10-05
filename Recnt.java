public class Recnt {
        double width;
        double height;
        double getArea(){
            return  width * height;
        }
        class  Examolel_2{
            public  void  main (String[] args){
                Recnt rectangle;
                rectangle = new Recnt();
                rectangle.width =1.819;
                rectangle.height = 1.5;
                double area = rectangle.getArea();
                System.out.println("矩形的面积："+ area);
            }
        }
}
