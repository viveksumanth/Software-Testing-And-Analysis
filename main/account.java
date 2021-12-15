//***********************************************
//************* CLASS ACCOUNT *******************
//***********************************************

package main;

public class account
{
    private int x0;    // maximum pin retries
    private int x1;    // Balance
    private int x2;    // LockedFlag
    private int x3;    // Pin Number
    private int x4;    // State
    private int x5;    // Account Number
    private int x6;    // Fine
    private int x7;    // Minimum Balance
    private int x8;    // Lock Pin
    private int x9;    // Count of Pin Retries

    public final int showBalance()
    {
        return x1;
     } //Testing oriented Method

    public final int showState()
    {
        return x4;
    } //Testing oriented Method

    public final int showPinRetries()
    {
        return x9;
    } //Testing oriented Method

    public final int showLockedFlag()
    {
        return x2;
    } //Testing oriented Method

    public final int showPin(){
        return x3;
    } // Testing oriented Method

    public final int showAccountNumber(){
        return x5;
    } // Testing oriented Method

    public account()
    {
        x2 = 0;
        x4 = -1;
        x6 = 20;
        x7 = 200;
        x9 = 0;
        x0 = 3;
    }
    // public final int open(int AccountId,  int PinNumber, int balance )
    public final int open(int z, int y, int x)
    {
        if ((x > 0) && (x4 == -1) && (y > 0) && (z > 0))
        {
            x1 = x;    // Balance
            x3 = y;    // Pin Number
            x5 = z;    // Account Id
            x4 = 0;    // State
            return 0;
        };
        return -1;
    }
    public final int pin(int x)
    {
        if (x4 != 1)
        {
            return -1;
        }
        if (x == x3)
        {
            x4 = 2;
            return 0;
        }
        else
        {
            x9++;
        }
        if (x9 >= x0)
        {
            x4 = 0;
        }
        return -1;
    }
    public final int logout()
    {
        if ((x4 == 0) || (x2 == 1))
        {
            return -1;
        }
        x4 = 0;
        return 0;
    }
    public final int login(int x)
    {
        if (x4 != 0)
        {
            return -1;
        }
        if (x5 == x)
        {
            x4 = 1;
            x9 = 0;
            return 0;
        }
        return -1;
    }
    public final int balance()
    {
        if (x4 != 2)
        {
            return -1;
        }
        return x1;
    }
    public final int lock(int x)
    {
        if (x4 != 2)
        {
            return -1;
        }
        if (x == x3)
        {
            return -1;
        }
        if (x2 == 0)
        {
            x2 = 1;
            x8 = x;
            return 0;
        }
        else
        {
            return -1;
        }
    }
    public final int unlock(int x)
    {
        if (x4 != 2)
        {
            return -1;
        }
        if ((x2 == 1) && (x == x8))
        {
            x2 = 0;
            return 0;
        }
        else
        {
            return -1;
        }
    }
    public final int deposit(int d)
    {
        if (x4 != 2)
        {
            return -1;
        }
        if (x2 == 1)
        {
            return -1;
        };
        if ((x1 + d < x7) && (d>0))
        {
            x1 = x1 + d - x6;
            return 0;
        }
        else
        {
            if (d > 0)
            {
                x1 = x1 + d;
                return 0;
            }
        }
        return -1;
    }
    public final int withdraw(int w)
    {
        if (x4 != 2)
        {
            return -1;
        }
        if (x2 == 1)
        {
            return -1;
        };
        if ((x1 > w) && (w > 0))
        {
            if (x1 < x7)
            {
                return -1;
            }
            else
            {
                x1 = x1 - w;
            };
            if (x1 < x7)
            {
                x1 = x1 - x6;
            }
            return 0;
        }
        return -1;
    }
}