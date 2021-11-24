
public class example1
{

	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.setempcode(101);
		obj.setEmpname("Pavan");
		obj.setDesignation("Developer");
		System.out.println("Employee code:"+obj.getEmpcode());
		System.out.println("Employee name:"+obj.getEmpname());
		System.out.println("Designation:"+obj.getDesignation());

	}

}
