package rs.p_A_uc;

import com.google.c.A;
import com.google.c.C;
import com.google.c.D;
import com.google.c.E;
import com.google.c.u;
import com.google.c.v;
import com.google.c.w;
import com.google.c.z;
import java.awt.Color;
import java.lang.reflect.Type;

public class C_f implements E<Color>, v<Color> {
   public Color b(w var1, Type var2, u var3) {
      if (!(var1 instanceof z)) {
         throw new A("The color " + var1 + " is not an object!");
      } else if (!var1.t().b("value")) {
         throw new A("The color " + var1 + " has no value!");
      } else {
         return new Color(var1.t().c("value").j());
      }
   }

   public w a(Color var1, Type var2, D var3) {
      z var4 = new z();
      var4.a("value", new C(var1.getRGB()));
      var4.a("falpha", new C(0.0F));
      return var4;
   }
}
