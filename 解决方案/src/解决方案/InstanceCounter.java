package 解决方案;
public class InstanceCounter {
   private static int numInstances = 0;
   protected static int getCount() {
      return numInstances;
   }
 
   private static void addInstance() {
	   InstanceCounter oms= new InstanceCounter();
      numInstances++;
   }
 
   InstanceCounter() {

      InstanceCounter.addInstance();
   }
 
   public static void main(String[] arguments) {
      System.out.println("Starting with " +
      InstanceCounter.getCount() + " instances");
      for (int i = 0; i < 500; ++i){
//         new InstanceCounter();
         InstanceCounter.numInstances++;
          }
      System.out.println("Created " +
      InstanceCounter.getCount() + " instances");
   }
}