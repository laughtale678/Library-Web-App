export const oktaConfig = {
    clientId:'0oajd0gpeohYmML1X5d7',
    issuer:'https://dev-47873018.okta.com/oauth2/default',
    redirectUri:'https://localhost:3000/login/callback',
    scopes:['openid', 'profile', 'email'],
    pkce: true,
    disableHttpsCheck: true,
}