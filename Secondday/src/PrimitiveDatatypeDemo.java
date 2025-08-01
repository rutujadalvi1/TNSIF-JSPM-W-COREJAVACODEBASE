
public class PrimitiveDatatypeDemo {

	public static void main(String[] args) {
		byte bytemax=126;
		byte bytemin=-128;
		System.out.println("min range of byte is:"+bytemin);
		System.out.println("max range of byte is:"+bytemax);
        
		short shortmax= 32767;
		short shortmin=-32767;
		System.out.println("min range of short is:"+shortmin);
		System.out.println("max range of short is:"+shortmax);
		
		
		int intmax=2147483647;
	    int intmin=-2147483647;
	    System.out.println("min range of int is:"+intmin);
		System.out.println("max range of int is:"+intmax);
	    
	    long longmax=9223372036854775807L;
	    long longmin=-9223372036854775808L;
	    System.out.println("min range of long is:"+longmin);
		System.out.println("max range of long is:"+longmax);
	}

}
