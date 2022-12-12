public class SingletonDesign {

	private static SingletonDesign instance;

	private SingletonDesign() {
		System.out.println("instace cretaed");
	}
	
	public static SingletonDesign getInstance() {
		if (instance == null) {
		synchronized (SingletonDesign.class) {      // Double lock checking
			if (instance == null) {
			instance = new SingletonDesign();}
		}
		}
		return instance;
	}
	public void showMessage(){
	      System.out.println("Hello World!");
	   }
	
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonDesign n=SingletonDesign.getInstance();
				n.showMessage();
			}
			});
        Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SingletonDesign n2=SingletonDesign.getInstance();
				n2.showMessage();
			}
			});
	      t.start();
	      t2.start();

		//selenium code
//	      public WebDriver driver;
//	 	 @BeforeClass
//	 	 public void launchBrowser() throws Throwable {
//	 	  String BROWSER = pLib.readDataFromPropertyFfile("browser");
//
//	 	  if (BROWSER.equalsIgnoreCase("firefox")) {
//	 	   driver = new FirefoxDriver();
//	 	  } else if (BROWSER.equalsIgnoreCase("chrome")) {
//	 	   driver = new ChromeDriver();
//	 	  } else if (BROWSER.equalsIgnoreCase("ie")) {
//	 	   driver = new InternetExplorerDriver();
//	 	  }
//	 	  driver.manage().window().maximize();
//	 	   driver.get("www.att.com");
//	 	  wlib.waitforPageToLoad(driver);
	      
		
	}}
