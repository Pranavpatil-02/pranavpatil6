import Mypack;
class ActBalance
{
   public static void main(String args[])
   {
      Balance2 b[]=new Balance[3];
      b[0]=new Balance2("Leena",500.56);
      b[1]=new Balance("Anita",100);
      b[2]=new Balance("Kalyani",1);
      for(int i=0;i<3;i++)
      {
         b[i].show();
      }
   }

}






