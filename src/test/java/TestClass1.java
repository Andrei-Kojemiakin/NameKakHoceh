import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {

    @Test
        public void sommeMethod(){

      int s= otherMtehod(12,14);
        System.out.println(s);

        String k= orrr("Tter ","Gtreta ");
        System.out.println(k);

    }


 public int otherMtehod(int c, int d){
        return c*d;
    }

    public String orrr(String f, String g){
        if (f.length()>g.length()) {
            return f+g;
        }
          else
        return g+f;
    }
}
// Создать коллекцию из 5 элементов, вывести все элементы в консоль тремя способами.
// Создать Map положить туда 3 элемента, вывести в консоль.
// Почитать про интерфейсы.