package rs.p_n.p_c;

public class C_k extends rs.p_n.C_c {
   public C_k(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(18546);
      c(60008, 11, "fountain/SPRITE");
      a(60009, "@or1@Blood Shard Salvaging Kit", this.a, 0, 16751360, true, true);
      a(65418, 1, 0, 65419, 1, "teleport/SPRITE", 46, 20, "Close Window");
      a(65419, 2, "teleport/SPRITE", 46, 20, 65420);
      a(60010, "Items you'll salvage into shards..", this.a, 0, 16751360, false, true);
      rs.p_n.C_e var2 = d(60011);
      var2.al = new int[1];
      var2.am = new int[1];
      var2.bc = new int[1];
      var2.aH = 250;
      var2.P = 175;
      var2.aR = 132;
      var2.bj = 87;
      a(60012, Boolean.valueOf(true));
      H['\uea6c'].W = new String[]{"Remove 1", "Remove 5", "Remove 10", "Remove All", "Remove X"};
      H['\uea6c'].P = 4;
      H['\uea6c'].ac = 11;
      H['\uea6c'].ap = 10;
      var2.b(0, 60012, 11, 5);
      a(60013, Boolean.valueOf(false));
      H['\uea6d'].P = 4;
      H['\uea6d'].ac = 11;
      H['\uea6d'].ap = 10;
      a(60014, "fountain/SPRITE", 4, 100, 32, "Salvage", -1, 60015, 1);
      a(60015, "fountain/SPRITE", 5, 100, 32, 60016);
      a(60017, "Salvage", this.a, 0, 16751360, true, true);
      a(60018, "", this.a, 0, 16751360, false, true);
      a(60019, "fountain/SPRITE", 12, 100, 20, "Read guide", -1, 60020, 1);
      a(60020, "fountain/SPRITE", 13, 100, 20, 60021);
      a(60022, "Item guide", this.a, 0, 16751360, true, true);
      var1.k(14);
      var1.b(0, 60008, 98, 64);
      var1.b(1, 60009, 261, 73);
      var1.b(2, 65418, 401, 71);
      var1.b(3, 65419, 401, 71);
      var1.b(4, 60010, 112, 100);
      var1.b(5, 60011, 105, 115);
      var1.b(6, 60013, 378, 151);
      var1.b(7, 60014, 307, 200);
      var1.b(8, 60015, 307, 200);
      var1.b(9, 60017, 357, 210);
      var1.b(10, 60018, 300, 133);
      byte var3 = 10;
      var1.b(11, 60019, 319, 107 + var3);
      var1.b(12, 60020, 319, 107 + var3);
      var1.b(13, 60022, 357, 110 + var3);
   }
}
