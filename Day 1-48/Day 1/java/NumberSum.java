class NumberSum{
  public static void main(String[] args){
    System.out.println("Length: "+args.length);
	int sum=0;
	if(args.length==0){
	   System.out.println("Too few parameters, pls pass numbers");
	}
	else{
	for(int i=0;i<args.length;i++){
	    //System.out.println("Number :"+args[i]);
		sum=sum+Integer.parseInt(args[i]);
		
	}
	System.out.println("Sum :"+sum);
	}
  }
}