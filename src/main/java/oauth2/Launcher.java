package oauth2;

import java.util.Map;

import oauth2.token.TokenManager;

public class Launcher {

  public static void main(String[] args) throws Exception {
    String clientId = "Client ID here";
    String clientSecret = "Client Secret here";
    String scopes = "Scopes separated by space here";
    String authorizationURLString = "Authorization URL here";
    String tokenURLString = "Token URL here";

    // create instance of TokenManager with all 5 parameters
    TokenManager tokenManager =
        new TokenManager(clientId, clientSecret, scopes, authorizationURLString, tokenURLString);
    // Get authorization code
    String authorizationCode = tokenManager.getAuthorizationCode();
    // Supply authorization code to get Access and Refresh Token
    Map<String, String> tokens = tokenManager.getTokens(authorizationCode);
    System.out.println(tokens.get("accessToken"));
    System.out.println(tokens.get("refreshToken"));
  }
}
