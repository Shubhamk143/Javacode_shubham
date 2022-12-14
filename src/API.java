public class GetAndFindProject  {
	// check Specific Data available in complex Response
	@Test
	public void getAndVerifyProject() {
		Response resp = given()
					   .contentType(ContentType.JSON)
					.when()
					   .get("http://localhost:8084/projects");
		    resp.then()
		          .assertThat().statusCode(200);
		    
		    ArrayList<String> lst = resp.jsonPath().get("projectName");
		    for(int i=0; i<lst.size();i++) {
		    	if(lst.get(i).equals("HDFC")) {
		    		System.out.println("PASS");
		    		break;
		    	}}}}
		 
***************************************************************************************************
# authentication 
                              We have used Bearer Token & Oauth2 Autehtication 
               	@Test
	public void getAllProject() {
	        given()
	          .auth().oauth2("BearerTokenID")
	          .contentType(ContentType.JSON)
	        .when()
	          .get("http://localhost:8084/projects")
	        .then()
	           .log().all()

	}
 
OR
    Basic Auth
given()
          .auth().basic("username", "password")
          .contentType(ContentType.JSON)
          .body(fis)
        .when()
          .post("http://localhost:8084/addProject")
        .then()
          .log().all()
          .assertThat().statusCode(201);
********************************************************
Post---
  Import static io.restassured.RestAussured.*;

Class CreateCustomer{
                 @test
                  Public void createCustomer(){
                         
            HashMAp map = new HAshMAp()
                                map.put(“customerNAme” , “hdfc”);
                                map.put(“add”, “bangalore”);
                                  map.put(“id” , 123);

                          given()
                                 .contentType(ContentType.JSON)
                                 .auth().oath2(“barereTokenID”)
                                 .body(map)
                         .when()
                               .post(“http://rmgyantra.com/projects”)
                           .then()
                                 .assertThat().statusCode(200)}}


****************************************************
Data provider using Post method 
public class CreateProject_BDD extends BaseAPIClass{

	@Test(dataProvider = "getData")
	public void createPRoject(String prjectNAme , String status) {
	
	         Project pObj = new Project("deepak", prjectNAme, status, 10);
           given()
              .spec(requestSpec)
              .body(pObj)
            .when()
               .post("/addProject")
            .then()
               .assertThat().statusCode(201)
               .log().all();		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] objArr = new Object[4][2];
		objArr[0][0] = "HDFC-11";
		objArr[0][1] = "Completed";
		
		objArr[1][0] = "ICICI";
		objArr[1][1] = "Completed";
		
		objArr[2][0] = "YES";
		objArr[2][1] = "Completed";
		
		objArr[3][0] = "SMB";
		objArr[3][1] = "Completed";
		return objArr;
	}
}
****************************************************
API chaining
@Test
	public void getAndVerifyProject() {
		Response resp = given()
					   .contentType(ContentType.JSON)
					.when()
					   .get("http://localhost:8084/projects");
		    
		      String projectId = resp.jsonPath().get("projectId[0]");
		      
		      System.out.println(projectId);
		     given()
		        .contentType(ContentType.JSON)
		        .pathParam("PID", projectId)
		     .when()
		       .delete("http://localhost:8084/projects/{PID}")
		     .then()
                .assertThat().statusCode(204);	}}	     
		*********************************************************************************************************
     RuqestSpecBuilder
     public class BaseAPIClass {
	public RequestSpecification requestSpec;
	@BeforeSuite
	public void configBeforeSuite() {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri("http://localhost:8084");
        builder.setContentType(ContentType.JSON);
        
         requestSpec = builder.build(); }
       
	   ===================to use in test ===================================
public class CreateProject_BDD extends BaseAPIClass{

	@Test
	public void createPRoject() {
	
	         Project pObj = new Project("deepak", "HDFC", "Completed", 10);
           given()
              .spec(requestSpec)
              .body(pObj)
            .when()
               .post("/addProject")
            .then()
               .assertThat().statusCode(201)
               .log().all();
}}


                                     
                                     
