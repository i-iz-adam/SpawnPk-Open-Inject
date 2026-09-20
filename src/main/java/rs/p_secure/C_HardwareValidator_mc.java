package rs.p_secure;

public class C_HardwareValidator_mc {
   private static String a = System.getProperty("os.name").toLowerCase();

   public static void main(String[] var0) {
      System.out.println(a);
      if (a()) {
         System.out.println("This is Windows");
      } else if (b()) {
         System.out.println("This is Mac");
      } else if (c()) {
         System.out.println("This is Unix or Linux");
      } else if (d()) {
         System.out.println("This is Solaris");
      } else {
         System.out.println("Your OS is not support!!");
      }
   }

   public static boolean a() {
      return a.indexOf("win") >= 0;
   }

   public static boolean b() {
      return a.indexOf("mac") >= 0;
   }

   public static boolean c() {
      return a.indexOf("nix") >= 0 || a.indexOf("nux") >= 0 || a.indexOf("aix") > 0;
   }

   public static boolean d() {
      return a.indexOf("sunos") >= 0;
   }
}
