package rs.p_s.p_e;

import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.p_s.p_b.C_q;
import rs.p_ui.C_m;

public class C_b extends C_m {
   private static final Logger a = LoggerFactory.getLogger(C_b.class);
   private final C_c b;
   private final C_q c;

   @Inject
   public C_b(C_c var1, C_q var2) {
      super(false);
      this.b = var1;
      this.c = var2;
   }

   @Override
   public void J_() {
      this.removeAll();
      rs.p_s.p_b.C_a var1 = this.c.b(this.b);
      this.add(var1);
   }
}
