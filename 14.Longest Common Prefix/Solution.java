class Solution {
    public static String longestCommonPrefix(String[] list)
    {
        if(list.length==1)
        {
            return(list[0]);
        }
       String commonPrefixInTwo=commonPara(list[0],list[list.length-1]);
       
       if(!commonPrefixInTwo.equals(""))
       {
            for(int i=2;i<list.length;i++)
            {
               if(!(commonPara(list[i],commonPrefixInTwo).equals(commonPrefixInTwo)))
               {
                    return "";
               }
            }
       }

       return commonPrefixInTwo;
    }
    
    

     
    public static String commonPara(String str1, String str2 )
    {
        String prefix="";
        int lengthOfStr1=str1.length();
        int lengthOfStr2=str2.length();
        Checker ch=new Checker();
        
        ch=isThereACommonPhrase(str1,str2);
        if(ch.wasThereACommonPrefix)
        {
            int currentIndexA=ch.startingOfACommonPrefix[0];
            int currentIndexB=ch.startingOfACommonPrefix[1];
            while((currentIndexA<lengthOfStr1 && currentIndexB<lengthOfStr2) && str1.charAt(currentIndexA)==str2.charAt(currentIndexB))
            {
                prefix+=str1.charAt(currentIndexA);
                currentIndexA++;
                currentIndexB++;
            }
            return prefix;
        }
        return prefix;
    }
    
    public static Checker isThereACommonPhrase(String str1,String str2)
    {
        int str1Length=str1.length();
        int str2Length=str2.length();
        Checker ch=new Checker();

        for(int i=0;i<str1Length-1;i++)
        {
            for(int j=0;j<str2Length-1;j++)
            {
                if(str1.charAt(i)==str2.charAt(j) && str1.charAt(i+1)==str2.charAt(j+1))
                {
                    ch.setWasThereACommonPrefix(true);
                    ch.setStartingOfACommonPrefix(i, j);
                    return ch;
                }
            }
        }

        return ch;
    }


}


