import java.util.HashMap;


 class Test {
 
    public static void main(String[] args) {
        HashMap<String,String> emp=new HashMap<String,String>();
        emp.put("P_Id","101");
        emp.put("P_Name","samsung");
        emp.put("Price","45000");
        emp.put("Color","Red");//put()-to add element  
          emp.put("Avail", "True");
        System.out.println(emp);
        System.out.println(emp.get("P_Id"));//get()-use to get the values
        System.out.println(emp.get("P_Name"));//get()-use to get the values
        System.out.println(emp.get("Price"));//get()-use to get the values
        System.out.println(emp.get("Color"));//get()-use to get the values
        System.out.println(emp.get("PAvail"));//get()-use to get the values
    
        System.out.println(emp.values());// values()-use to get values
        System.out.println(emp.keySet());//KeySet()-use to get key
        System.out.println(emp.entrySet());//entrySet()-use to get both key and values
        
    }
 } 
