package rs.p_A_uc;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.awt.Color;
import java.lang.reflect.Type;

public class C_f implements JsonSerializer<Color>, JsonDeserializer<Color> {
   @Override
   public Color deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (!(var1 instanceof JsonObject)) {
         throw new JsonParseException("The color " + var1 + " is not an object!");
      } else if (!var1.getAsJsonObject().has("value")) {
         throw new JsonParseException("The color " + var1 + " has no value!");
      } else {
         return new Color(var1.getAsJsonObject().get("value").getAsInt());
      }
   }

   @Override
   public JsonElement serialize(Color var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      var4.add("value", new JsonPrimitive(var1.getRGB()));
      var4.add("falpha", new JsonPrimitive(0.0F));
      return var4;
   }
}
