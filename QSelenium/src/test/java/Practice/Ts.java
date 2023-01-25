package Practice;

import org.testng.annotations.Test;

public class Ts {
         @Test
         public void createContact()
         {
        	 System.out.println("Contact is created");
        }
        @Test (dependsOnMethods = "createContact")
        public void modifyContact()
        {
        	System.out.println("Contact is modified");
        }
        @Test (dependsOnMethods = "modifyContact")
        public void deleteContact()
        {
        	System.out.println("Contact is deleted");
        }
        //If we want to run multiple times
        //@Test(invocationCount=4)
        //public void createcontact()
        //{
        	//System.out.println("Contact created");
//}
        //IF WE WANT TO SKIP ANY METHOD
        //@Tets(enabled=false)
        //}
}
