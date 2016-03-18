/**
 * Created by Cherie_Wang on 16/3/18.
 */
public class Triangle {

    private int a;
    private int b;
    private int c;
    public int CheckTri(int a,int b,int c){
        int max,mid,min;
        if( a >= b && a>= c ){
            max = a;
            if( b >= c){
                mid = b;
                min = c;
            }
            else{
                mid = c;
                min = b;
            }
        }
        else if( b >= a && b >= c ){
            max = b;
            if( a >= c ) {
                mid = a;
                min = c;
            }
            else{
                mid = c;
                min = a;
            }
        }
        else{
            max = c;
            if( a >= b ){
                mid = a;
                min = b;
            }
            else{
                mid = b;
                min = a;
            }
        }
        a = max;
        b = mid;
        c = min;


        if( b + c > a ) {
            if (a != b && b != c && a != c) {
                return 0;   //三边不等scalene
            }
            else if (a == b && b == c) {
                return 2;   //等边三角形equilateral
            }
            else
                return 1;   //等腰三角形isosceles
        }
        else
            return -1;     //不是三角形
        }
    }

