import com.george.module1.four.Colour;
import com.george.module1.four.Triangle;
import org.junit.Test;


import static org.junit.Assert.*;
public class TriangleTest {

    //partition
    /*
    sides given: a+b > c gives area
    sides given: a+c > b gives area
    sides given: c+b > a gives area
    sides given: none of the above, gives NaN, triangle is irrational

    given width and height return  w*h*0.5
    */


    @Test public void testArea(){
        // sides = a+b > c and  a+c > b and c+b > a
        // sides !=  a+b > c and  a+c > b and  c+b > a -> irrational triangle, must return NaN
        assertEquals( Math.sqrt((2 + 4 + 3) * 0.5 * ((2 + 4 + 3) * 0.5-2) * ((2 + 4 + 3) * 0.5-4) * ((2 + 4 + 3) * 0.5 - 3))  ,new Triangle(2,4, 3).getArea() ,0.1);
        assertEquals( 0.0/0.0  ,new Triangle(10,20, 3).getArea(), 1.0);

        //7 width, 6 height
        //9width 0.1 height

        assertEquals(7*6*0.5,new Triangle(7,6, Colour.RED).getArea() ,0.1);
        assertEquals(9*0.1*0.5, new Triangle(9,0.1, Colour.RED).getArea() ,0.1 );




    }




}