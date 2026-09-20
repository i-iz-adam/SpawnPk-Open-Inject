package rs.p_n.p_c;

public class C_l extends rs.p_n.C_c {
   public C_l(rs.p_l.C_K_uc[] var1) {
      super(var1);
   }

   @Override
   public void a() {
      rs.p_n.C_e var1 = d(54100);
      h(54101, "skills/image 7");
      a(54102, "Blood Slayer", this.a, 2, 16750623, true, true);
      a(54103, "Choose a Task", this.a, 2, 16750623, true, true);
      a(54104, "Easy task monsters", this.a, 2, 16750623, false, true);
      c(54105, 1, "gambling/SPRITE");
      c(54106, 1, "gambling/SPRITE");
      c(54107, 1, "gambling/SPRITE");
      c(54108, 1, "gambling/SPRITE");
      a(54109, "<tab=20>Monster hunter @yel@(PvM)", "Select timed task", this.a, 0, 16750623, false, true, 150);
      a(54110, "<tab=20>Boss hunter @yel@(PvM)", "Select boss hunter task", this.a, 0, 16750623, false, true, 150);
      a(54111, "<tab=20>Bounty hunter @yel@(PK)", "Select man hunter task", this.a, 0, 16750623, false, true, 150);
      a(54112, "<tab=20>Slaughter @yel@(PK)", "Select man slaughter task", this.a, 0, 16750623, false, true, 150);
      a(54113, "skills/button", 1, 120, 41, "Get a blood slayer task", -1, 54114, 1);
      a(54114, "skills/button", 2, 120, 41, 54115);
      a(54116, "<img=24> Get a task", this.a, 1, 16751360, true, true);
      a(54117, "<u=16776960>Reward points", this.a, 0, 16750623, true, true);
      a(54118, "@yel@5 <col=FF9B00>Blood slayer points", this.a, 0, 16751360, true, true);
      a(54119, "@yel@5 <col=FF9B00>Slayer points", this.a, 0, 16751360, true, true);
      a(54120, "", this.a, 0, 16751360, true, true);
      short var2 = 170;
      var1.k(20);
      var1.b(0, 54101, 16 + var2, 42);
      var1.b(1, 54102, 106 + var2, 51);
      var1.b(2, 63740, 172 + var2, 50);
      var1.b(3, 63741, 170 + var2, 50);
      var1.b(4, 54103, 102 + var2, 82);
      var1.b(5, 54117, 106 + var2, 211);
      byte var3 = 4;
      var1.b(6, 54105, 30 + var2, 110 + var3);
      var1.b(7, 54109, 29 + var2, 112 + var3);
      var1.b(8, 54106, 30 + var2, 130 + var3);
      var1.b(9, 54110, 29 + var2, 132 + var3);
      var1.b(10, 54107, 30 + var2, 150 + var3);
      var1.b(11, 54111, 29 + var2, 152 + var3);
      var1.b(12, 54108, 30 + var2, 170 + var3);
      var1.b(13, 54112, 29 + var2, 172 + var3);
      var1.b(14, 54113, 46 + var2, 263);
      var1.b(15, 54114, 46 + var2, 263);
      var1.b(16, 54116, 102 + var2, 275);
      var1.b(17, 54118, 106 + var2, 227);
      var1.b(18, 54119, 106 + var2, 240);
      var1.b(19, 54120, 106 + var2, 253);

      for (int var4 = 0; var4 < var1.al.length; var4++) {
         var1.bc[var4] = var1.bc[var4] - 15;
      }
   }
}
