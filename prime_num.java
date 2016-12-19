package Core_javaS6;

/*========================================================================*/
/*========================================================================*/
class thread_class extends Thread{		// thread class extended
	int j=0;		
	
	thread_class(int a)
	{
		this.j=a;  // setting value for j in constructor
	}
	public void run()		// run method for Thread class...
	{
		int loop=0;
		boolean flag=false;
		System.out.println(Thread.currentThread().getName());
				for(loop=2;loop<(j/2);loop++)	// checking with number
		{
		
			if((int)(j%loop)==0)
			{
				flag=true;	
				break;		// number=0, not prime number
			}
		}
		if(flag)
		{
			System.out.println(j+ " is Not Prime Number\n");
		}
		else
		{
			System.out.println(j+" is Prime Number\n");
		}
	}


}
/*=====================================================================*/
/*=====================================================================*/
class thread_intf implements Runnable{

	int k=0;	
	thread_intf(int a)
	{
		this.k=a;  // setting value for j in constructor
	}
	@Override
	public void run() 
	{
		int loop=0;
		boolean flag=false;
		for(loop=2;loop<(k/2);loop++)
		{
		
			if((int)(k%loop)==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(k+ " is Not Prime Number\n");
		}
		else
		{
			System.out.println(k+" is Prime Number\n");
		}
		System.out.println(k);
		System.out.println(Thread.currentThread().getName());
		
		
	}
	
}
/*========================================================================*/
/*========================================================================*/
public class prime_num {

	public static void main(String[] args) 
	{
		int number_to_check = 22;
		thread_class b1 =new thread_class(number_to_check);	// creating object for class
		b1.setName("thread_class");		// setting name by set name method....
		b1.start();						// starting thread 
		
		
		thread_class d1 =new thread_class(number_to_check);
		Thread j1 = new Thread(d1);  // thread class object
		j1.setName("Thread Interface");
		j1.start();
	
	}

}
/*========================================================================*/
/*========================================================================*/