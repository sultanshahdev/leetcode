class Checker {
     boolean wasThereACommonPrefix;

     int[] startingOfACommonPrefix;

    public Checker()
    {
        wasThereACommonPrefix=false;
        startingOfACommonPrefix= new int[2];
    }

    public void setWasThereACommonPrefix(boolean a)
    {
        this.wasThereACommonPrefix=a;

    }
    public void setStartingOfACommonPrefix(int a,int b)
    {
        this.startingOfACommonPrefix[0]=a;
        this.startingOfACommonPrefix[1]=b;
    }

    public void status()
    {
        System.out.println("WAS THERE A COMMON PHRASE"+wasThereACommonPrefix);
        if(wasThereACommonPrefix)
        {
            System.out.println("The phase Starts at "+ startingOfACommonPrefix[0] + " In String 1");
            System.out.println("The phrase Strats at "+startingOfACommonPrefix[1]+" In String 2");

        }

    }