public class Solution {
    public static int romanToInt(String s) {
    int sum=0;
    for(int i=0; i<=s.length()-1;i++)
    {
        
        switch(s.charAt(i)){
            case 'I' : 
            {
                if(i!=s.length()-1 && getValue(s.charAt(i+1))>getValue(s.charAt(i)))
                {
                    sum -= getValue(s.charAt(i));
                }
                else
                {
                    sum+= getValue(s.charAt(i));
                }
                break;
            }
            
            case 'V' :
            {
                if(i!=s.length()-1 && getValue(s.charAt(i+1))>getValue(s.charAt(i)))
                {
                    sum -= getValue(s.charAt(i));
                }
                else
                {
                    sum+= getValue(s.charAt(i));
                }
                break;
            }
            
            case 'X' :
            {
                if(i!=s.length()-1 && getValue(s.charAt(i+1))>getValue(s.charAt(i)))
                {
                    sum -= getValue(s.charAt(i));
                }
                else
                {
                    sum+= getValue(s.charAt(i));
                }
                break;
            }
            
            case 'L' :
            {
                if(i!=s.length()-1 && getValue(s.charAt(i+1))>getValue(s.charAt(i)))
                {
                    sum -= getValue(s.charAt(i));
                }
                else
                {
                    sum+= getValue(s.charAt(i));
                }
                break;
            }
            
            case 'C' :
            {
                if(i!=s.length()-1 && getValue(s.charAt(i+1))>getValue(s.charAt(i)))
                {
                    sum -= getValue(s.charAt(i));
                }
                else
                {
                    sum+= getValue(s.charAt(i));
                }
                break;
            }
            
            case 'D' :
            {
                if(i!=s.length()-1 && getValue(s.charAt(i+1))>getValue(s.charAt(i)))
                {
                    sum -= getValue(s.charAt(i));
                }
                else
                {
                    sum+= getValue(s.charAt(i));
                }
                break;
            }
            
            case 'M' :
            {
                if(i!=s.length()-1 && getValue(s.charAt(i+1))>getValue(s.charAt(i)))
                {
                    sum -= getValue(s.charAt(i));
                }
                else
                {
                    sum+= getValue(s.charAt(i));
                }
                break;
            }
            
        }    


    }

    return sum;
    
    
    
    
    
    
    }
    public static int getValue(char s)
    {
        switch(s)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }
    
}