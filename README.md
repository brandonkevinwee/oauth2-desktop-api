# OAuth2 Token Extractor for Desktop Applications

Easy to use OAuth2 Token Extractor for desktop applications. Tested with Spotify.

Notes:
1. Allow http://localhost:8080 in your Application dashboard's Redirect URL
2. The program uses Gradle to manage dependencies. Gradle Wrapper is included in this repository

Program Flow:
1. Create an instance of TokenManager, supply the 5 required parameters (Client ID, Client Secret, Scope of Access, Authorization URL, Token URL)
2. Execute getAuthorizationCode(), this will open your browser for user authentication. OAuth2 will supply the authorization code to a redirect to a local server, which will be returned by the getAuthorizationCode() method.
3. Use the authorization code to get the Access Token and Refresh Token with getTokens().
4. Use the Access Token to access your desired APIs.
5. Use the Refresh Token instead of Authorization Code with getTokens() to refresh your Access Token.

See Launcher.java for quick demonstration