public class complex {
    private double real;
    private double imag;
    public complex(double real,double imag)
    {
        this.real=real;
        this.imag=imag;
    }
    public complex add(complex n2)
    {
        complex temp=new complex(0.0,0.0);
        temp.real=this.real+n2.real;
        temp.imag=this.imag+n2.imag;
        return temp;
    }
    public static void main(String[] args)
    {
        complex n1,n2,result;
        n1=new complex(6.0,5.9);
        n2=new complex(3.0,8.0);
        result=n1.add(n2);
        System.out.println("SUM=="+result.real+"+"+result.imag+"i");
    }
}
