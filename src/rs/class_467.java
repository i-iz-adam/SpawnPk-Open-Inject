package rs;

import com.sun.jna.platform.win32.aU;

/* JADX INFO: loaded from: client-final.jar:rs/class_467.class */
public class class_467 {
    public static void a(class_495 class_495Var) {
        class_495Var.a(class_351.a(class_463.cy, "raids/tomes1")).b(class_463.bH, 25, 45);
        class_349 class_349VarA = class_349.g(class_463.cC, 20).a(10);
        class_349VarA.h(12, 20);
        class_349VarA.bC = true;
        class_349VarA.bD = true;
        class_349VarA.W = new String[0];
        for (int i = 21234; i <= 21250; i++) {
            class_349VarA.ax[i - 21234] = i + 1;
            class_349VarA.av[i - 21234] = 0;
        }
        class_495Var.a(class_349VarA).b(class_463.cy, 12, 11);
        class_495Var.a(class_342.b(class_463.cG, "raids/btn2a", "Select").d("@whi@Buy x10 random modifiers @gre@(10% discount)\nThey'll will be added to your coffer above.").c("raids/btn2b")).b(class_463.cy, 311, 111);
        class_495Var.a(class_342.b(class_463.cH, "raids/btn1a", "Select").d("@whi@Buy a random modifier\nIt be added to your coffer above.").c("raids/btn1b")).b(class_463.cy, 179, 111);
        class_495Var.a(class_342.b(class_463.cI, "raids/btn1a", "Select").d("@whi@Buy x5 random modifiers\nThey'll be added to your coffer above.").c("raids/btn1b")).b(class_463.cy, 179, 138);
        class_495Var.a(class_352.a(class_463.cM, "Roll x1: @cya@<img=469> 1,000").a().b().m()).b(class_463.cy, 241, 117);
        class_495Var.a(class_352.a(class_463.cN, "Roll x5: @cya@<img=469> 5,000").a().b().m()).b(class_463.cy, 241, 145);
        class_495Var.a(class_352.a(class_463.cO, "Roll x10\\n\\n@cya@<img=469>@gre@ 9,000\\n@gre@(10% Discount)").a().b().m()).b(class_463.cy, 362, 115);
        class_495Var.a(class_352.a(class_463.cP, "What are Modifier tomes?").n().l()).b(class_463.cy, 77, 119);
        class_495Var.a(class_352.a(class_463.cQ, "Click here to learn more").o().m().a(155)).b(class_463.cy, 0, 135);
        class_495Var.a(class_351.a(class_463.cz, "raids/tomes2")).b(class_463.cy, -12, 172);
        class_349 class_349VarA2 = class_349.g(class_463.cD, 1).a(1);
        class_349VarA2.ax[0] = 6750;
        class_349VarA2.av[0] = 0;
        class_349VarA2.bC = true;
        class_349VarA2.bD = true;
        class_349VarA2.W = new String[0];
        class_495Var.a(class_349VarA2).b(class_463.cz, 171, 51);
        class_495Var.a(class_352.a(class_463.cR, "Affliction Tomes").o().m()).b(class_463.cz, aU.hm_, 22);
        class_495Var.a(class_342.b(class_463.cX, "bank/bank 17", "Deposit all tomes from inventory").a().c("bank/bank 18")).b(class_463.cz, 222, 41);
        class_495Var.a(class_342.b(class_463.cY, "bank/bank 35", "Deposit all tomes from bank").a().c("bank/bank 46")).b(class_463.cz, 222, 67);
        class_495Var.a(class_342.b(class_463.bO, "raids/close1", "Close interface").b("raids/close2")).b(class_463.bH, 493, 3);
    }
}
