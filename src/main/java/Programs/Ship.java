class Ship
 {
  static void print(String x)
   {
    System.out.print(x);}
     static void println(String y)
      {
       System.out.println(y);
        }
         public static void main(String[] d_stark) 
           {
            String [] sym =
             {
              " ",             //0
               "*",             //1
                "|&}",           //2
                 ".",             //3
                  "_   ",          //4
                   "(          .",  //5
                    "_|_",           //6
                     "_",             //7
                     "",              //8
                    "(",             //9
                   ")",             //10
                  "|>",            //11
                 "|)",            //12
                "______  ",      //13
               ".  \\|=$=|\\_", //14
              "|))___",        //15
             "_____/>",       //16
            "|=",            //17
           "|o",            //18
          "~",             //19
         "/",             //20
        "_/ \\",         //21
       "\\_/",          //22
      "\\",            //23
     "_|",            //24
    "_.-'",          //25
  "\n\n",          //26
 };  
/*loop lines*/
for(int i = 0; i < 12 ; ++i)
 {
  /*line 1*/
   if(i == 0)
    {
     for(int a = 0; a < 8 ; ++a)
      {
       print(sym[0]);
        }
         print(sym[1]);
          for(int b = 0; b < 5; ++b)
           {
            print(sym[0]);
             }
              for(int c= 0; c < 5; ++c)
               {
                print(sym[0]);
                 }
                  print(sym[2]);
                  for(int d = 0; d < 4; ++d)
                 {
                print(sym[0]);
               }
              print(sym[3]);
             for(int e = 0; e < 5; ++e)
            {
           print(sym[0]);
          }
         for(int f = 0; f < 2;++f)
        {
       print(sym[4]);
      }
     println(sym[8]);
    }
   /*line 2*/ 
  if(i == 2)
 {
for(int g = 0; g < 3; ++g)
{
 print(sym[0]);
  }
   print(sym[5]);
    for(int h = 0; h < 3; ++h)
     {
      print(sym[0]);
       }
        print(sym[6]);
         for(int j = 0; j < 9; ++j)
          {
           print(sym[0]);
            }
             for(int k = 0; k< 2; ++k)
              {
               print(sym[21]);
                }
                 println(sym[7]);
                  }
                   /*line 3*/
                   if(i == 3)
                  {
                 for(int l = 0; l < 14; ++l)
                { 
               print(sym[0]);
              }
             for(int m = 0; m < 4; ++m)
            {
           print(sym[0]);
          }
         print(sym[22]);
        for(int n = 0; n< 8;++n)
       {
      print(sym[0]);
     }
    print(sym[9]);
   for(int o = 0; o < 5; ++o)
  {
 print(sym[7]);
}
print(sym[10]);
 for(int p = 0; p< 3; ++p)
  {
   print(sym[7]);
    }
     println(sym[10]);
      }
       /*line 4*/
        if(i == 4)
         {
          for(int q = 0;q < 13;++q)
           {
            print(sym[0]);
             }
              print(sym[11]);
               for(int r = 0; r < 4; ++r)
                {
                 print(sym[0]);
                  }
                   print(sym[12]);
                   for(int s = 0; s < 4;++s)
                  {
                 print(sym[0]);
                }
               println(sym[11]);
              }
             /*line 5*/
            if(i == 5)
           {
          for(int t = 0; t < 3;++t)
         {
        print(sym[0]);
       }
      print(sym[3]);
     for(int u = 0; u < 3;++u)
    {
   print(sym[0]);
  }
 print(sym[1]);
for(int v = 0; v< 2;++v)
{
 print(sym[0]);
  }
  for(int w = 0; w< 3;++w)
   {
    print("   "+sym[12] + sym[10]);
     }
      println(sym[0]);
       }
        /*line 6*/
         if(i == 6)
          {
           for(int x = 0; x<13;++x)
            {
             print(sym[0]);
              }
               for(int y = 0; y < 3; ++y)
                {
                 print(sym[12]+sym[10]
                +sym[10]+"  ");
               }
              println(sym[3]+"    "+sym[1]);
             }
            /*line 7*/
           if(i == 7)
          {
         for(int z = 0; z < 5; ++z)
        {
       print(sym[0]);
      }
     print(sym[13]);
    for(int a = 0; a < 3; ++a)
   {
  print(sym[12] + sym[10] + sym[10] +"  ");
 }
println(sym[0]);
}
 /*line 8*/           
  if(i == 8)
   {
    for(int a = 0; a< 2; ++a)
     {
      print(sym[0]);
       }
        print(sym[14]);
         for(int b = 0; b< 3;++b)
          {
           print(sym[15]);
            }
             println(sym[16]);
              }    
               /*line 9*/
                if(i == 9)
                 {
                  for(int c = 0; c < 6; ++c)
                  {
                 print(sym[0]);
                }
               for(int d = 0; d < 3; ++d)
              {
             print(sym[17]);
            }
           print(sym[18]);
          for (int e = 0; e < 2; ++e)
         {
        print(sym[17]);
       }
      print(sym[18]);
     for(int f = 0; f< 2; ++f)
    {
   print(sym[17]);
  }
 print(sym[18]);
for(int g = 0; g < 4; ++g )
{
 print(sym[17]);
  }
   println(sym[20]);
    }
     /*line 10*/
      if(i == 10)
       {
        for (int h = 0; h < 6; ++ h)
         {
          print(sym[19]);
           }
            print(sym[23]);
             for(int j = 0; j < 12; ++j)
              {
               print(sym[24]);
                }
                 print(sym[20]);
                  for(int k = 0; k< 7; ++k)
                   {
                    print(sym[19]);
                     }
                     println(sym[0]);
                    }
                   /*Line 11*/
                  if(i == 11)
                 {
                for(int l = 0; l < 20; ++l)
               {
              print(sym[25]);}
             print(sym[27]+sym[27]+sym[26]);
            }
           }                      
          } 
         }
    
    
    
  
                   
                   
                   

   