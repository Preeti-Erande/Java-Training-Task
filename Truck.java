package AccessModifiers1;

import AccessModifiers.Vehicle;

public class Truck extends Vehicle
{
      public void CallProtectedMethodOutsidePackage()
      {
    	  this.ProtectedMethod();
      }
	
}
