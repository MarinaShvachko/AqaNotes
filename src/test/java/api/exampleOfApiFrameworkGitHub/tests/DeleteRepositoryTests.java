package api.exampleOfApiFrameworkGitHub.tests;

import api.exampleOfApiFrameworkGitHub.BaseClass;
import api.exampleOfApiFrameworkGitHub.utility.Authentication;
import api.exampleOfApiFrameworkGitHub.utility.BodyGenerator;
import api.exampleOfApiFrameworkGitHub.utility.CommonUtilityFunctions;
import api.exampleOfApiFrameworkGitHub.utility.Url;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteRepositoryTests {
    String endPoint = Url.getBaseUrI("/user/repos");
    String token = Authentication.getToken();
    Response response;

    @Test
    public void deleteRepository() {
        String requestBody = BodyGenerator.generateBodyFromFileToString("createRepo.json");
        response = BaseClass.postRequest(endPoint, requestBody, token);
        String deleteEndPoint = Url.getBaseUrI("/repos/MarinaShvachko/") + CommonUtilityFunctions.getResponseKeyValue(requestBody, "name");
        response = BaseClass.deleteRequest(deleteEndPoint, token);
        Assert.assertEquals(CommonUtilityFunctions.getStatusCode(response), 204, "Error while deleting the repository");
    }
}
