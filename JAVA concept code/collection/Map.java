import java.util.HashMap;


 class Test {
 
    public static void main(String[] args) {
        HashMap<String,String> emp=new HashMap<String,String>();
        emp.put("Id","101");
        emp.put("Name","Vigor");
        emp.put("sal","45000");
        emp.put("Loc","Bengaluru");//put()-to add element  
          emp.put(null, null);
        System.out.println(emp);
        System.out.println(emp.get("Name"));//get()-use to get the values
        System.out.println(emp.get("null"));
        System.out.println(emp.values());//
        System.out.println(emp.keySet());//
        System.out.println(emp.entrySet());//
        
    }
 } 
