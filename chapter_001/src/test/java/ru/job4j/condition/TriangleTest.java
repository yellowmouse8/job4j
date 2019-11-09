package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class TriangleTest {
        @Test
        public void checkS () {
            Point a = new Point(2, 7);
            Point b = new Point(4, 6);
            Point c = new Point(2, 6);
            Triangle triangle = new Triangle(a, b, c);
            double result = triangle.area();
            double expected = 1;
            assertThat(result, is(expected));

        }
        @Test
    public void checkTrue(){
            Point a = new Point(1, 3);
            Point b = new Point(2, 4);
            Point c = new Point(1, 2);
            Triangle triangle = new Triangle(a,b,c);
            boolean result = triangle.exist( 1,  2,3);
            boolean expected = true;
            assertThat( result, is(expected));
        }
        @Test
    public void checkPerimetr (){
            Point a = new Point(1, 3);
            Point b = new Point(2, 4);
            Point c = new Point(1, 2);
            Triangle triangle = new Triangle(a,b,c);
            double result = triangle.period(1,2,3);
            double expected = 3;
            assertThat(result , is(expected));
        }
    }

