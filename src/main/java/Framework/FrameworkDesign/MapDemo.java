package Framework.FrameworkDesign;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;
 
public class MapDemo
{
 @Test
    public void hashmap()
    {
        Map map = new HashMap();
 
        //Adding values to the HashMap
        map.put("test key 1", "test value 1");
        map.put("test key 2", "test value 2");
        map.put("test key 3", "test value 3");
 
        System.out.println("Retrieving values from HashMap");
        retrieveValuesFromListMethod(map);
        System.out.println("**********************\n\n");
        
        Set keys = map.keySet();
        Iterator itr = keys.iterator();
 
        String key;
        String value;
        while(itr.hasNext())
        {
            key = (String)itr.next();
            value = (String)map.get(key);
            System.out.println(key + " - "+ value);
        }
 
 
    }
 
    /*This method retrieves values from Map
     */
 @Test
    public static void retrieveValuesFromListMethod(Map map)
    {
        Set keys = map.keySet();
        Iterator itr = keys.iterator();
 
        String key;
        String value;
        while(itr.hasNext())
        {
            key = (String)itr.next();
            value = (String)map.get(key);
            System.out.println(key + " - "+ value);
        }
    }
}