package cn.swpu.zzh;

public class Student{
   static String name;
   static String password;
   static String id;
   double height,weight;
   public String getName(){
     return name;
   }
   public void setName(String newName){
     name=newName;
   }

   public String getPassword() {
	// TODO Auto-generated method stub
	return password;
}
   public  void setPassword(String newpassword) {
	password=newpassword;
}
   public String getId(){
	     return id;
	   }
   public void setId(String newid){
	     id=newid;
	   }
}
