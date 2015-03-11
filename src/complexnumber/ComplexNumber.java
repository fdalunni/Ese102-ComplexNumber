package complexnumber;

public class ComplexNumber{
    private double re;
    private double im;
    
    
    public void setRectangular(double re, double im) /*variabili re e im inizializzate*/
    {
    	this.re = re;
    	this.im = im;
    }
    
    public void setPolar(double argument, double modulus)
    {
        if(modulus >= 0)
        {
          this.re = Math.cos(argument*Math.PI/180)*modulus;
	      if(argument == 180)
	        this.im = 0;
	      else
	        this.im = Math.sin(argument*Math.PI/180)*modulus;
        }
        else
        	throw new IllegalArgumentException("Modulo uguale o maggiore di 0.");
    }
    
    public double getModulus()
    {
        return(Math.sqrt(Math.pow(this.re, 2)+Math.pow(this.im, 2)));
    }
    
    public double getArgument() 
    {
    	int bugFix = 0;
    	if(this.re < 0)
    		bugFix = 180;
    	return((Math.atan(this.im/this.re)*180)/Math.PI+bugFix);
    }
    
    public double getRe()
    {
        return re;
    }

    public double getIm()
    {
        return im;
    }
}