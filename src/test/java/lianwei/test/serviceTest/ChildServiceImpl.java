package lianwei.test.serviceTest;

public class ChildServiceImpl implements ChildService{
	private SuperService superService;
	public ChildServiceImpl(SuperService superServiceInstance) {
		this.superService = superServiceInstance;
	}
	
	public void b() {
		superService.b();
	}

	public void a() {
		superService.a();
	}

	public void c() {
		System.err.println("child c");
	}

}
