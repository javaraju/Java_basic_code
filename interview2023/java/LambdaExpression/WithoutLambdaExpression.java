package interview2023.java.LambdaExpression;


//interface Drawable{
//    public void draw();
//}
//public class WithoutLambdaExpression {
//
//    public static void main(String [] args) {
//
//        Drawable obj = new Drawable() {
//            public void draw() {
//                System.out.println("Without using lambda expression.");
//            }
//        };
//        obj.draw();
//    }
//}


@FunctionalInterface
interface Drawable{
    public void draw();
}
public class WithoutLambdaExpression {

    public static void main(String [] args) {

        Drawable obj = () -> {
            System.out.println("Lambda expression.");
        };
        obj.draw();
    }
}
