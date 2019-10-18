package Helpers;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class AssertJson {
    @Test
    public void CompareJson(){
        try{
            String actualResponse = "{\"Items\":[{\"CustomerCode\": \"ABC008\", \"TestBla\":\"Bla\"}]}";
            JSONObject jsonObject = new JSONObject(actualResponse);
            System.out.println("This is where the testing begin");
            JSONAssert.assertEquals(actualResponse, jsonObject, true);

        }catch(JSONException err){
            System.out.println("There is something wrong with it");
        }


    }

}
